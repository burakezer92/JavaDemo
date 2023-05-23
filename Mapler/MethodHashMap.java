package Mapler;

import java.util.HashMap;
import java.util.Map;

public class MethodHashMap {
    public static void main(String[] args) {
        Map<String,String> ulkeler = new HashMap<>();
        ulkeler.put("TR","Türkiye");
        ulkeler.put("USA","Amerika");
        ulkeler.put("GR","Almanya");
        System.out.println(ulkeler.get("TR"));
        for(String ulke : ulkeler.keySet()){//Maplerde iterable yok.
            System.out.println(ulke);
        }
        for(String ulke : ulkeler.values()){
            System.out.println(ulke);
        }
        for(String ulke : ulkeler.keySet()){
            System.out.println(ulkeler.get(ulke));
        }
    }
}
