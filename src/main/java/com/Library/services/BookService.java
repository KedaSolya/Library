package com.Library.services;

import com.Library.data.Database;
import com.Library.data.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final Database database = new Database();

    public List<Book> findAll() {
        return database.getBookArrayList();
    }

    public Book findById(Long id) {
        for (int i = 0; i < database.getBookArrayList().size(); i++) {
            if (database.getBookArrayList().get(i).getId() == (id)) {
                return database.getBookArrayList().get(i);
            }
        }
        return null;
    }

    public void save(Book book) {
        database.setBookArrayList(book);
    }

    public void deleteAll() {
        database.getBookArrayList().clear();
    }

    public void delete(Long id) {
        database.getBookArrayList().remove(findById(id));
    }

    public void update(Long id, Book book) {
        Book toUpdateBook = findById(id);
        toUpdateBook.setId(book.getId());
        toUpdateBook.setTitle(book.getTitle());
        toUpdateBook.setAuthor(book.getAuthor());
        toUpdateBook.setGenre(book.getGenre());
        toUpdateBook.setPages(book.getPages());
    }
}
