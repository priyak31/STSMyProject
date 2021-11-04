package com.newpack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.newpack.service.BookServiceMain;
//import com.newpack.service.bookService;
import java.util.List;
@RestController
public class BookController {
	
	@Autowired
    private BookServiceMain bs;

    @GetMapping("/books")
    List<Book> findAll() {
        return bs.findAll();
    }

    @PostMapping("/books")
    Book newBook(@RequestBody Book newBook) {
        return bs.newBook(newBook);
    }

    // Save or update
    @PutMapping("/books/{id}")
    Book saveOrUpdate(@RequestBody Book newBook, @PathVariable Long id) {
         return bs.saveOrUpdate(newBook,id);             
    }

    @DeleteMapping("/books/{id}")
    void deleteBook(@PathVariable Long id) {
        bs.deleteBook(id);
    }

}
