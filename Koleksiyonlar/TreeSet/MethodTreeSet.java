package Koleksiyonlar.TreeSet;

import GenericInterface.Student;

import java.util.TreeSet;

public class MethodTreeSet {


    public static void main(String[] args) {
        Ogrenciler o1 = new Ogrenciler("Ahmet",56);
        Ogrenciler o2= new Ogrenciler("Zeynep",18);
        Ogrenciler o3 = new Ogrenciler("Cihan",71);
        Ogrenciler o4 = new Ogrenciler("Hikmet",15);
        TreeSet<Ogrenciler> a = new TreeSet<>(new Order1());
        a.add(o1);
        a.add(o2);
        a.add(o3);
        a.add(o4);
        for(Ogrenciler c : a){
            System.out.println(c.getOgrenciIsim());
        }
    }


}
