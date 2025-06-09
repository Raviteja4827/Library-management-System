package library_management_system;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int bookCost;
    private int bookId;
    private int noOfPages;

    public Book() {}

    public Book(String bookTitle, String bookAuthor, int bookCost, int bookId, int noOfPages) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookCost = bookCost;
        this.bookId = bookId;
        this.noOfPages = noOfPages;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookCost() {
        return bookCost;
    }

    public void setBookCost(int bookCost) {
        this.bookCost = bookCost;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public void displayBook() {
        System.out.println("Book Title: " + getBookTitle());
        System.out.println("Book Author: " + getBookAuthor());
        System.out.println("Book Cost: " + getBookCost());
        System.out.println("Book Id: " + getBookId());
        System.out.println("Number Of Pages: " + getNoOfPages());
        System.out.println("-----------------------------------------");
    }

    @Override
    public String toString() {
        return "Book Title = " + bookTitle + 
               "\nBook Author = " + bookAuthor + 
               "\nBook Cost = " + bookCost + 
               "\nBook Id = " + bookId + 
               "\nNumber Of Pages = " + noOfPages;
    }
}
