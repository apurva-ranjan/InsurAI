public class Main {
    public static void main(String[] args) {
        // Creating an object of Book class
        Book myBook = new Book();

        // Assigning values to fields
        myBook.title = "Java Programming";
        myBook.author = "John Doe";
        myBook.pages = 350;

        System.out.println("Book Title: " + myBook.title);
        System.out.println("Author: " + myBook.author);
        System.out.println("Pages: " + myBook.pages);
    }
}

// Note: You will need the Book class defined somewhere accessible.
