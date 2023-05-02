package com.library.bookService;

import com.library.book.Book;
import com.library.bookDto.BookDto;

import java.util.List;

public interface BookService {
    //save
    public Book saveBook(BookDto dto);
    //update
    public Book updateBook(BookDto dto,Integer id);
    //get
    public List<Book> fetchAllBooks();
    //delete
    public void deleteBook(Integer id);
    //issue
    public Book issueBook(BookDto dto,String bookname);
    //return
    public Book returnBook(Integer studentId,String bookName);
}
