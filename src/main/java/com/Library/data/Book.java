package com.Library.data;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private long id;
    private String title;
    private String author;
    private String genre;
    private int pages;
}
