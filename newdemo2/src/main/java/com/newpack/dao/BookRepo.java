package com.newpack.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.newpack.Book;

public interface BookRepo extends JpaRepository<Book, Long> {

}
