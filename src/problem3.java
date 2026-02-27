public class problem3 {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Smith");
        Book book = new Book("Quantum Mechanics", "Richard Feynman");
        LibrarySystem library = new LibrarySystem();

        library.checkout(prof, book);
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class LibrarySystem {
    public void checkout(Professor p, Book b) {
        System.out.println(p.getName() + " has checked out " + b.getTitle() + " for research.");
    }
}