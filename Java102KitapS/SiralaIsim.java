package Java102KitapS;


import java.util.Comparator;

public class SiralaIsim implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        return o1.getKitapIsmi().compareTo(o2.getKitapIsmi());
    }
}
