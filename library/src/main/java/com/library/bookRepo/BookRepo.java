package com.library.bookRepo;

import com.library.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
    Book findByBookName(String bookName);

//    Book findByStudentId(String studentId, String bookName);

    Book findByStudentIdAndBookName(Integer studentId, String bookName);
}
