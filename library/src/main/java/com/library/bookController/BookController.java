package com.library.bookController;

import com.library.book.Book;
import com.library.bookDto.BookDto;
import com.library.bookServiceImpl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/library")
public class BookController {
    @Autowired
    BookServiceImpl bookServiceImpl;
    @GetMapping("hi")
    public ResponseEntity<String> hi(){//from here i wil get only book name
        return ResponseEntity.status(HttpStatus.OK).body("hi");
    }
    @PostMapping("saveBook")
    public ResponseEntity<Book> saveBook(@RequestBody BookDto dto){//from here i wil get only book name
        Book result=bookServiceImpl.saveBook(dto);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PutMapping("updateBook/{id}")
    public ResponseEntity<Book> updateBook(@RequestBody BookDto dto,@PathVariable Integer id){//from here i wil get only id and book name
        Book result=bookServiceImpl.updateBook(dto,id);//as per the book id i will change the name of the book
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @GetMapping("getAllBook")
    public ResponseEntity<List<Book>> fetchAllBooks(){//from here i wil all books
        List<Book> result=  bookServiceImpl.fetchAllBooks();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @PutMapping("issueBook")
    public ResponseEntity<Book> issueBook(@RequestBody BookDto dto,@RequestParam String bookName){//from here i wil get bookname and as per the bookname i will set teh student name who will take this book
        Book result=bookServiceImpl.issueBook(dto,bookName);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @PutMapping("returnBook/{studentId}")//here i will get bookname and the student is and as per that i wil set studemt id 0 because he/she has return that book so no need to mention the student id
    public ResponseEntity<Book> returnBook(@PathVariable Integer studentId,@RequestParam String bookName){//from here i wil get only id and book name
        Book result= (Book) bookServiceImpl.returnBook(studentId,bookName);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @GetMapping("deleteBook/{id}")
    public ResponseEntity<String> deleteBook0(@PathVariable Integer id){//from here i wil all books
         bookServiceImpl.deleteBook(id);
        return ResponseEntity.status(HttpStatus.OK).body("deleted");
    }
}
