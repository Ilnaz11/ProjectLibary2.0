package Book;
import Libary.Libary;

public class Book {
    private static String title;
    private static String author;
    private static int year;


    public static String getTitle() {
        return title;
    }
    public static String getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return "Book.Book:\n" +
                "Название: " + title + " | " +
                "Автор книги: " + author + " | " + "Год выпсука: " + year;
    }
    public static int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}