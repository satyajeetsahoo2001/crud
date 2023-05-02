package com.library.bookServiceImpl;

import com.library.book.Book;
import com.library.bookDto.BookDto;
import com.library.bookRepo.BookRepo;
import com.library.bookService.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepo bookRepo;
    //save
    @Override
    public Book saveBook(BookDto dto){
        Book book=new Book();
        book.setBookName(dto.getBookName());
        book.setStudentId(0);
        return (Book) bookRepo.save(book);
    }
    //update
    @Override
    public Book updateBook(BookDto dto,Integer id){
        Book book= (Book) bookRepo.findById(id).get();
        book.setBookName(dto.getBookName());
        return (Book) bookRepo.save(book);
    }
    //get
    @Override
    public List<Book> fetchAllBooks(){
        return bookRepo.findAll();
    }
    //delete
    @Override
    public void deleteBook(Integer id){
        bookRepo.deleteById(id);

    }
    //issue
    @Override
    public Book issueBook(BookDto dto,String bookName){
        Book book=bookRepo.findByBookName(bookName);
        book.setStudentId(dto.getStudentId());
        return (Book) bookRepo.save(book);

    }
    //return
    @Override
    public Book returnBook(Integer studentId,String bookName){
        Book book = null;
        try {

         book=bookRepo.findByStudentIdAndBookName(studentId,bookName);
        book.setStudentId(0);
        }
        catch (Exception e){

        }
        return (Book) bookRepo.save(book);
    }
}
