package com.Library.services;

import com.Library.data.Library;
import com.Library.data.Database;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    private final Database database = new Database();

    public List<Library> findAll() {
        return database.getLibraryArrayList();
    }

    public Library findById(long id) {
        for (int i = 0; i < database.getLibraryArrayList().size(); i++) {
            if (database.getLibraryArrayList().get(i).getId() == (id)) {
                return database.getLibraryArrayList().get(i);
            }
        }
        return null;
    }

    public void save(Library library) {
        database.setLibraryArrayList(library);
    }

    public void deleteAll() {
        database.getLibraryArrayList().clear();
    }

    public void deleteByID(long id) {
        database.getLibraryArrayList().remove(findById(id));
    }

    public void update(long id, Library library) {
        Library toUpdateLibrary = findById(id);
        toUpdateLibrary.setId(library.getId());
        toUpdateLibrary.setName(library.getName());
        toUpdateLibrary.setLocation(library.getLocation());
        toUpdateLibrary.setBooksAmount(library.getBooksAmount());
        toUpdateLibrary.setVisitorsAmount(library.getVisitorsAmount());
    }
}
