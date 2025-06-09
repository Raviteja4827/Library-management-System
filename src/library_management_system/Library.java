package library_management_system;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(Book b) {
        books.add(b);
        System.out.println(b.getBookTitle() + " Book Added Successfully");
    }

    // Show Books
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books have been added yet.");
        } else {
            for (Book b : books) {
                b.displayBook();
            }
        }
    }

    // Search Book by ID
    public void searchBookById(int bookId) {
        boolean isFound = false;
        if (books.isEmpty()) {
            System.out.println("No books have been added yet.");
        } else {
            for (Book b : books) {
                if (b.getBookId() == bookId) {
                    System.out.println(b.getBookTitle() + " Book Found");
                    isFound = true;
                    break;
                }
            }
        }
        if (!isFound) {
            System.out.println("Invalid Book ID. No book found.");
        }
    }

    // Search Book by Author
    public void searchByAuthor(String author) {
        boolean isFound = false;
        if (books.isEmpty()) {
            System.out.println("No books have been added yet.");
        } else {
            for (Book b : books) {
                if (b.getBookAuthor().equalsIgnoreCase(author)) {
                    System.out.println(b.getBookAuthor() + " Book Found");
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("Invalid author. No book found.");
        }
    }

    // Update Book Cost by Title
    public void updateBookCostByTitle(String title, int newCost) {
        boolean isFound = false;
        if (books.isEmpty()) {
            System.out.println("No books have been added yet.");
        } else {
            for (Book b : books) {
                if (b.getBookTitle().equalsIgnoreCase(title)) {
                    b.setBookCost(newCost);
                    System.out.println("Book cost updated successfully.");
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("Invalid book title. No book found.");
        }
    }

    // Delete Book by ID
    public void deleteBookById(int id) {
        boolean isFound = false;
        if (books.isEmpty()) {
            System.out.println("No books have been added yet.");
        } else {
            Iterator<Book> itr = books.iterator();
            while (itr.hasNext()) {
                Book b = itr.next();
                if (b.getBookId() == id) {
                    itr.remove();
                    System.out.println("Book removed successfully.");
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                System.out.println("Invalid Book ID. No book found.");
            }
        }
    }
}
