package Java102KitapS;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("bkitabı",200,"pyazari",2005);
        Book b2 = new Book("ikitabı",15,"lyazari",1966);
        Book b3 = new Book("ekitabı",28,"myazari",2015);
        Book b4 = new Book("fkitabı",29,"tyazari",1974);
        Book b5 = new Book("ukitabı",82,"eyazari",2003);
        TreeSet<Book> a = new TreeSet<>(new SiralaIsim());
        TreeSet<Book> c = new TreeSet<>(new SiralaSsayisi());
        a.add(b1);
        a.add(b2);
        a.add(b3);
        a.add(b4);
        a.add(b5);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);


        for(Book h:a){
            System.out.println(h.getKitapIsmi());
        }
        for(Book h:c){
            System.out.println(h.getSayfaSayisi());
        }

    }
}
