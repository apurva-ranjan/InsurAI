class Book {
    String title;
    String author;
    int pages;
}

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.title = "Java Basics";
        myBook.author = "Alice";
        myBook.pages = 300;

        System.out.println("Title: " + myBook.title);
        System.out.println("Author: " + myBook.author);
        System.out.println("Pages: " + myBook.pages);
    }
}
