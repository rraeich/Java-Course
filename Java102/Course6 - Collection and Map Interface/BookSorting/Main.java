package BookSorting;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Jextedn is back!", "Haluk Alireisoğlu", 2607, 2017);
        Book book2 = new Book("Ralphonee", "Pelin Yaşar", 2212, 2019);
        Book book3 = new Book("National Socialist Germany", "Karaman Mehmetoğlu", 560, 2006);
        Book book4 = new Book("Murders?", "İhsan Dönemez", 195, 2022);
        Book book5 = new Book("Atalanta", "Ahmet Karamambalı", 872, 2009);

        TreeSet<Book> bookHolder = new TreeSet<>();

        bookHolder.add(book1);
        bookHolder.add(book2);
        bookHolder.add(book3);
        bookHolder.add(book4);
        bookHolder.add(book5);

        for (Book b : bookHolder) {
            System.out.print(b.getBookName() + " / ");
            System.out.println(b.getPageOfNumber());
        }

        TreeSet<Book> bookHolder_two = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageOfNumber() - o2.getPageOfNumber();
            }
        });

        bookHolder_two.add(book1);
        bookHolder_two.add(book2);
        bookHolder_two.add(book3);
        bookHolder_two.add(book4);
        bookHolder_two.add(book5);

        System.out.println();
        for (Book b2 : bookHolder_two) {
            System.out.print(b2.getBookName() + " / ");
            System.out.println(b2.getPageOfNumber());
        }
    }
}
