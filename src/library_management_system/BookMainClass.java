package library_management_system;

import java.util.Scanner;

public class BookMainClass {
    public static void main(String[] args) {
        Library l = new Library();
        Scanner scan = new Scanner(System.in);
        boolean start = true;

        while (start) {
            System.out.println("\nEnter Choice: \n1. Add Book \n2. Show Books \n3. Search Book By Id \n4. Search Book By Author \n5. Update Book Cost By Title \n6. Remove Book \n7. Exit");
            System.out.print("Your choice: ");
            int choice = scan.nextInt();
            scan.nextLine(); // Consume newline

            switch (choice) {
                case 1: {
                    System.out.print("Enter the Book Title: ");
                    String title = scan.nextLine();

                    System.out.print("Enter the Book Author: ");
                    String author = scan.nextLine();

                    System.out.print("Enter the Book Id: ");
                    int id = scan.nextInt();

                    System.out.print("Enter the Book Cost: ");
                    int cost = scan.nextInt();

                    System.out.print("Enter the Number of Pages: ");
                    int noOfPages = scan.nextInt();

                    scan.nextLine(); // Consume newline

                    l.addBook(new Book(title, author, cost, id, noOfPages));
                    break;
                }
                case 2: {
                    l.showBooks();
                    break;
                }
                case 3: {
                    System.out.print("Enter the Book Id: ");
                    int id = scan.nextInt();
                    scan.nextLine();
                    l.searchBookById(id);
                    break;
                }
                case 4: {
                    System.out.print("Enter the Author: ");
                    String author = scan.nextLine();
                    l.searchByAuthor(author);
                    break;
                }
                case 5: {
                    System.out.print("Enter the Title: ");
                    String title = scan.nextLine();

                    System.out.print("Enter the New Cost: ");
                    int cost = scan.nextInt();
                    scan.nextLine();

                    l.updateBookCostByTitle(title, cost);
                    break;
                }
                case 6: {
                    System.out.print("Enter the Book Id: ");
                    int id = scan.nextInt();
                    scan.nextLine();
                    l.deleteBookById(id);
                    break;
                }
                case 7: {
                    System.out.println("Exiting program...");
                    start = false;
                    break;
                }
                default:
                    System.err.println("Enter valid data...");
            }
        }

        scan.close();
    }
}
