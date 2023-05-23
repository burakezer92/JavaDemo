package Mapler;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MethodLinkedHashMap {
    public static void main(String[] args) {
        ulke tr = new ulke("Türkiye",120,"Ankara");
        ulke usa = new ulke("Amerika",150,"New York");
        ulke gr = new ulke("Almanya",170,"Berlin");
        Map<String,ulke> ulketel = new LinkedHashMap<>();
        ulketel.put("90",tr);
        ulketel.put("1",usa);
        ulketel.put("50",gr);
        System.out.println(ulketel.get("50").getUlke_adi());

        for(String i:ulketel.keySet()){
            System.out.println(i);
        }
        for(ulke i:ulketel.values()){//Sıralanmış şekilde hashmapden farklı olarak
            System.out.println(i.getUlke_adi());
        }
        for(String i:ulketel.keySet()){
            System.out.println(ulketel.get(i).getUlke_adi());
        }


    }
}
