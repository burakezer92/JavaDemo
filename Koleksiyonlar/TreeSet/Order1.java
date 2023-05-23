package Koleksiyonlar.TreeSet;

import java.util.Comparator;

public class Order1 implements Comparator<Ogrenciler> {

    @Override
    public int compare(Ogrenciler o1, Ogrenciler o2) {
        return o1.getNot()-o2.getNot();
    }

}
