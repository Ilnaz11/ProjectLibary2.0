import java.util.*;
import java.util.stream.Collectors;


public class Libary {
    public List<Book> listBook1 = new ArrayList<>();
    public  Scanner scanner = new Scanner(System.in);
    //обавить книгу
    public void viewBooks() {
        for (int i = 0; i < listBook1.size(); i++) {
            System.out.println(listBook1.get(i));
        }
    }

    public void addBook(Book book) {
        if(book != null) {
            listBook1.add(book);
        } else {
            System.out.println("Ты че то препутал");
        }
    }
    public void removeBook1() throws NumberFormatException {
        System.out.println("Введите название");
        String title = scanner.nextLine();
        System.out.println("Введите имя автора");
        String author = scanner.nextLine();
        System.out.println("Введите год");
        int year = 0;
        try {
            while (true) {
                year = Integer.parseInt(scanner.nextLine());
                break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ты че попутал");
        }
        removeBook(new Book(title, author, year));
    }
    public void addBook1() throws NumberFormatException {
        System.out.println("Введите название");
        String title = scanner.nextLine();
        System.out.println("Введите имя автора");
        String author = scanner.nextLine();
        System.out.println("Введите год");
        int year = 0;
        try {
            while (true) {
                year = Integer.parseInt(scanner.nextLine());
                break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ты че попутал");
        }
        addBook(new Book(title, author, year));
        System.out.println("Книга добавлена в библиотеку\nСписок всех книг");
        viewBooks();
    }

    public boolean removeBook(Book book) {
        return listBook1.remove(book);
    }
    // Ищет книгу по названию

    public void searchByBook() {
    System.out.println("Введите название книги которую вы хотите найти");
    while(true) {
        String string = scanner.nextLine();
        if (Book.getTitle().equals(string)) {
            System.out.println("Книга найдена");
            break;
        } else {
            System.out.println("Такая книга не найдена\nТы чето попутал");
            break;
        }
    }
}
//public void searchByAuthor() {
//    System.out.println("Введите имя автора книги");
//    while (true) {
//        String string = sc
//    }
    public List<Book> serachByAuthor(String author) {
        if(author == null || author.trim().isEmpty()) {
            new ArrayList<Book>();
        }
        String name1 = author.toLowerCase();
        return listBook1.stream()
                .filter(book -> book.getAuthor()
                        .toLowerCase()
                        .contains(author))
                .collect(Collectors.toList());

    }

}