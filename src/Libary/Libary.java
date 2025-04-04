package Libary;
import Book.Book;
import java.util.*;

import Book.ProjectSearchByBook;
import static Libary.ProjectLibary.*;

public class Libary {
    private boolean running = true;
    public static List<Book> listBook1 = new ArrayList<>();
    public  Scanner scanner = new Scanner(System.in);
    ProjectSearchByBook projectSearchByBook = new ProjectSearchByBook();

    public void viewBooks() {
        for (Book book : listBook1) {
            System.out.println(book);
        }
    }


    public void run() throws NumberFormatException {
        System.out.println("Добро пожаловать в диспетчер задач\nВыберите действие");
        while (running) {
        System.out.println("[1: ДОБАВИТЬ КНИГУ В БЛИБЛЕОТЕКУ]");
        System.out.println("[2: УДАЛИТЬ КНИГУ ИЗ БИБЛИОТЕКИ]");
        System.out.println("[3: ПОКАЗАТЬ СПИСОК КНИГ БИБЛИТОЕКИ]");
        System.out.println("[4: ИСКАТЬ КНИГУ ПО ЕГО НАЗВАНИЮ]");
        System.out.println("[5: ИСКАТЬ КНИГУ ПО ИМЕНИ АВТОРА]");
        System.out.println("[6: ИСКАТЬ КНИГУ ПО ГОДУ ВЫПУСКА]");
        System.out.println("[7: ВЫХОД]");
        int vvod = 0;
        try {
            vvod = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ты по-моему че то перепутал");
        }
        switch (vvod) {
            case 1:
                addBook1();
                break;
            case 2:
                removeBook1();
                break;
            case 3:
                viewBooks();
                break;
            case 4:
                projectSearchByBook.searchByBook();
                break;
            case 5:
                projectSearchByBook.searchByAuthor();
                break;
            case 6:
                projectSearchByBook.searchByYear();
                break;
            case 7:
                running = false;
                break;
        }
        }
    }


}
