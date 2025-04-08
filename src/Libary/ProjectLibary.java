package Libary;

import Book.Book;

import static Book.ProjectSearchByBook.scanner;
import static Libary.Libary.listBook1;

public class ProjectLibary {


    public static void removeBook1() throws NumberFormatException {
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
    public static void addBook1() {
            System.out.println("Введите название");
            String title = scanner.nextLine();
            System.out.println("Введите имя автора");
            String author = scanner.nextLine();
            System.out.println("Введите год");
            int year = 0;
            try {
                year = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ты че попутал");
            }
            listBook1.add(new Book(title, author, year));
            System.out.println("Книга добавлена в библиотеку\nСписок всех книг");
    }

    public static boolean removeBook(Book book) {
        return listBook1.remove(book);
    }
}
// Идет проверка git revert