package com.Library.data;
import java.util.ArrayList;

public class Database {
    private final ArrayList<Book> bookArrayList =  new ArrayList<>();
    private final ArrayList<Member> memberArrayList =  new ArrayList<>();
    private final ArrayList<Worker> workerArrayList =  new ArrayList<>();
    private final ArrayList<Library> libraryArrayList =  new ArrayList<>();

    public Database() {
        bookArrayList.add(new Book(1, "shock absorber", "1", "1", 1));
        bookArrayList.add(new Book(2, "shock absorber", "1", "1", 1));
        bookArrayList.add(new Book(3, "shock absorber", "1", "1", 1));
        bookArrayList.add(new Book(4, "shock absorber", "1", "1", 1));
        bookArrayList.add(new Book(5, "shock absorber", "1", "1", 1));
        bookArrayList.add(new Book(6, "shock absorber", "1", "1", 1));
        bookArrayList.add(new Book(7, "shock absorber", "1", "1", 1));
        bookArrayList.add(new Book(8, "shock absorber", "1", "1", 1));
        bookArrayList.add(new Book(9, "shock absorber", "1", "1", 1));
        bookArrayList.add(new Book(10, "shock absorber", "1", "1", 1));

        memberArrayList.add(new Member(1, "Ivan", 2, "man"));
        memberArrayList.add(new Member(2, "Valeriy", 7, "man"));
        memberArrayList.add(new Member(3, "Volodymyr", 9, "man"));
        memberArrayList.add(new Member(4, "Petro", 11, "man"));
        memberArrayList.add(new Member(5, "Anna", 3, "woman"));
        memberArrayList.add(new Member(6, "Maria", 17, "woman"));
        memberArrayList.add(new Member(7, "Marta", 45, "woman"));
        memberArrayList.add(new Member(8, "Olexander", 2, "man"));
        memberArrayList.add(new Member(9, "Roman", 5, "man"));
        memberArrayList.add(new Member(10, "Vasyl", 1, "man"));

        workerArrayList.add(new Worker(1, "Ivan", 2, "man","librarian", 2));
        workerArrayList.add(new Worker(2, "Valeriy", 7, "man","librarian", 1));
        workerArrayList.add(new Worker(3, "Volodymyr", 9, "man","librarian", 5));
        workerArrayList.add(new Worker(4, "Petro", 11, "man","cleaner", 2));
        workerArrayList.add(new Worker(5, "Anna", 3, "woman","librarian", 3));
        workerArrayList.add(new Worker(6, "Maria", 17, "woman","cleaner", 2));
        workerArrayList.add(new Worker(7, "Marta", 45, "woman","admin", 2));
        workerArrayList.add(new Worker(8, "Olexander", 2, "man","director", 6));
        workerArrayList.add(new Worker(9, "Roman", 5, "man","admin", 4));
        workerArrayList.add(new Worker(10, "Vasyl", 1, "man","cleaner", 2));

        libraryArrayList.add(new Library(1, "one", "Zelena 104", 1099, 120));
        libraryArrayList.add(new Library(2, "two", "Horodotska 28", 1550, 154));
        libraryArrayList.add(new Library(3, "three", "Knyahyni Olhy 295", 1828, 109));
        libraryArrayList.add(new Library(4, "four", "Khmelnytskogo 25", 972, 57));
        libraryArrayList.add(new Library(5, "five", "Bandery 118", 2091, 234));
    }
    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }
    public void setBookArrayList(Book book) {
        bookArrayList.add(book);
    }

    public ArrayList<Member> getMemberArrayList() {
        return memberArrayList;
    }

    public void setMemberArrayList(Member member) {
        memberArrayList.add(member);
    }

    public ArrayList<Worker> getWorkerArrayList() {
        return workerArrayList;
    }

    public void setWorkerArrayList(Worker worker) {
        workerArrayList.add(worker);
    }

    public ArrayList<Library> getLibraryArrayList() {
        return libraryArrayList;
    }

    public void setLibraryArrayList(Library library) {
        libraryArrayList.add(library);
    }
}
