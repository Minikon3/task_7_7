public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
          new Book("book1"),
          new Magazine("magazine1"),
          new Book("book2"),
          new Magazine("magazine2")
        };
        System.out.println("Журналы: ");
        Magazine.printMagazines(printables);
        System.out.println("Книги: ");
        Book.printBooks(printables);
    }
}