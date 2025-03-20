public class ProjectBook {

    public static void main(String[] args) throws InterruptedException {


        Book book = new Book("Harry Potter", "Joan Rolling", 1997);
        Libary libary = new Libary();
        libary.addBook1();

        Thread.sleep(3000);

        libary.searchByBook();
        Book book1 = new Book("Mentality Milloner", "Harv Ecker", 2005);

        Book book2 = new Book("The art of thinking respectably", "David Shvarc", 1987);


    }
}