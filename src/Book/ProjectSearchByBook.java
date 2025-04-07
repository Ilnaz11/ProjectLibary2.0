package Book;
import java.util.Scanner;


public class ProjectSearchByBook {
    Book book;
    public static Scanner scanner = new Scanner(System.in);

    // Ищет книгу по названию
    public void searchByBook() {
        System.out.println("Введите название книги которую вы хотите найти");
        while (true) {
            String string = scanner.nextLine();
            if (book.getTitle().equals(string)) {
                System.out.println("Книга найдена");
                break;
            } else {
                System.out.println("Такая книга не найдена\nТы чето попутал");
                break;
            }
        }
    }

    // Ищет книгу по году выпуска
    public void searchByYear() {
        System.out.println("Введите год выпуска книги");
        while (true) {
            int y = Integer.parseInt(scanner.nextLine());
            if(book.getYear() == y) {
                System.out.println("Книги такого года выпуска пристутсвуют в нашей библиотеке");
                break;
            } else {
                System.out.println("Ты че попутал");
                break;
            }
        }
    }

    // Ищет книгу по названию
    public void searchByAuthor() {
        System.out.println("Введите имя автора книги");
        while (true) {
            String s = scanner.nextLine();
            if(book.getAuthor().equals(s)) {
                System.out.println("Книги такого автора пристутсвуют в нашей библиотеке");
                break;
            } else {
                System.out.println("Ты че попутал");
                break;
            }
        }
    }
}
