package com.Library.data;
import java.util.ArrayList;

public class Database {
    private final ArrayList<Book> bookArrayList =  new ArrayList<>();
    private final ArrayList<Member> memberArrayList =  new ArrayList<>();
    private final ArrayList<Worker> workerArrayList =  new ArrayList<>();
    private final ArrayList<Library> libraryArrayList =  new ArrayList<>();

    public Database() {
        bookArrayList.add(new Book(1, "The Midnight Library", "Matt Haig", "fiction", 288));
        bookArrayList.add(new Book(2, "Educated", "Tara Westover", "memoir", 334));
        bookArrayList.add(new Book(3, "Dune", "Frank Herbert", "science fiction", 896));
        bookArrayList.add(new Book(4, "To Kill a Mockingbird", "Harper Lee", "classic fiction", 336));
        bookArrayList.add(new Book(5, "Becoming", "Michelle Obama", "memoir", 448));
        bookArrayList.add(new Book(6, "The Da Vinci Code", "Dan Brown", "mystery, thriller", 454));
        bookArrayList.add(new Book(7, "The Hobbit", "J.R.R. Tolkien", "fantasy", 300));
        bookArrayList.add(new Book(8, "1984", "George Orwell", "dystopian fiction", 328));
        bookArrayList.add(new Book(9, "The Catcher in the Rye", "J.D. Salinger", "classic fiction", 224));
        bookArrayList.add(new Book(10, "The Girl with the Dragon Tattoo", "Stieg Larsson", "crime, thriller", 672));

        memberArrayList.add(new Member(1, "John Smith", 32, "male"));
        memberArrayList.add(new Member(2, "Sarah Johnson", 45, "female"));
        memberArrayList.add(new Member(3, "Michael Brown", 28, "male"));
        memberArrayList.add(new Member(4, "Emily Davis", 19, "female"));
        memberArrayList.add(new Member(5, "David Lee", 55, "male"));
        memberArrayList.add(new Member(6, "Sophia Chen", 41, "female"));
        memberArrayList.add(new Member(7, "Olivia Wang", 23, "female"));
        memberArrayList.add(new Member(8, "Daniel Kim", 36, "male"));
        memberArrayList.add(new Member(9, "Ethan Jones", 29, "male"));
        memberArrayList.add(new Member(10, "Ava Martinez", 401, "female"));

        workerArrayList.add(new Worker(1, "Lucas Brown", 39, "male","librarian", 2));
        workerArrayList.add(new Worker(2, "Liam Wilson", 46, "male","cleaner", 1));
        workerArrayList.add(new Worker(3, "Jessica Nguyen", 27, "female","librarian", 5));
        workerArrayList.add(new Worker(4, "Andrew Thompson", 42, "male","librarian", 2));
        workerArrayList.add(new Worker(5, "Sophia Patel", 31, "female","librarian", 3));
        workerArrayList.add(new Worker(6, "Ava Thompson", 33, "female","cleaner", 1));
        workerArrayList.add(new Worker(7, "Emily Jones", 29, "female","admin", 2));
        workerArrayList.add(new Worker(8, "Samuel Chen", 35, "male","director", 6));
        workerArrayList.add(new Worker(9, "Grace Kim", 24, "female","admin", 4));
        workerArrayList.add(new Worker(10, "Benjamin Martinez", 58, "male","cleaner", 2));

        libraryArrayList.add(new Library(1, "City Central Library", "123 Main Street, Suite 100, Anytown, USA", 150000, 2000));
        libraryArrayList.add(new Library(2, "Riverside Public Library", "456 Elm Avenue, Unit 200, River City, Canada", 80000, 1000));
        libraryArrayList.add(new Library(3, "Oakwood Heights Library", "789 Oakwood Road, Floor 3, Hillside Town, Australia", 90000, 1200));
        libraryArrayList.add(new Library(4, "Pine Hill Community Library", "321 Pine Street, Suite B, Grove Village, UK", 120000, 1500));
        libraryArrayList.add(new Library(5, "Cedar Grove Library", "876 Cedar Road, Unit 150, Mountainville, Japan", 100000, 1300));
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
