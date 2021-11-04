package com.newpack.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.newpack.Book;
//import com.newpack.BookRepository;
import com.newpack.dao.BookRepo;

@Service
public class bookService implements BookServiceMain{
	
	@Autowired
    private BookRepo repository;
	
    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }

    @Override
    public Book newBook(Book newBook) {
        return repository.save(newBook);
    }

    @Override
    public Book saveOrUpdate(Book newBook,Long id) {

        return repository.findById(id)
                .map(x -> {
                    x.setName(newBook.getName());
                    x.setAuthor(newBook.getAuthor());
                    x.setPrice(newBook.getPrice());
                    return repository.save(x);
                })
                .orElseGet(() -> {
                    newBook.setId(id);
                    return repository.save(newBook);
                });
    }
    @Override
    public void deleteBook(Long id) {
        repository.deleteById(id);
    }

}
