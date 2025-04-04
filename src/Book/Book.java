package Book;


public class Book {
    private String title;
    private String author;
    private int year;


    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return "Book.Book:\n" +
                "Название: " + title + " | " +
                "Автор книги: " + author + " | " + "Год выпсука: " + year;
    }
    public int getYear() {
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