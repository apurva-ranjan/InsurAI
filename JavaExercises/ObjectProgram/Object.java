class Book {
    String title;
    String author;
    int pages;
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Book class
        Book myBook = new Book();

        // Assigning values to object fields
        myBook.title = "Java Programming";
        myBook.author = "John Doe";
        myBook.pages = 350;

        // Output
        System.out.println("Book Details:");
        System.out.println("Title: " + myBook.title);
        System.out.println("Author: " + myBook.author);
        System.out.println("Pages: " + myBook.pages);
    }
}
