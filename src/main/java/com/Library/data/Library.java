package com.Library.data;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Library {
    private long id;
    private String name;
    private String location;
    private int booksAmount;
    private int visitorsAmount;
}
