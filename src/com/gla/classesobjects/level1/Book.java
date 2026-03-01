public class Book {

    String title;
    String author;
    double price;

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Book b1 = new Book();

        b1.title = "Java Basics";
        b1.author = "Gla";
        b1.price = 499.99;

        b1.display();
    }
}