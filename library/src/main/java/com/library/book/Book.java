package com.library.book;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "library")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;
    private String bookName;
    private Integer studentId;
}
