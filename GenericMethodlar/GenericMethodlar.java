package GenericMethodlar;

public class GenericMethodlar {
    public static  <T1,T2,T3> void genericmethod(T1[] dizi,T2[] dizi2,T3[] dizi3){//GENERIC METHOD
        for(T1 i:dizi){
            System.out.println(i);
        }
        for(T2 i:dizi2){
            System.out.println(i);
        }
        for(T3 i:dizi3){
            System.out.println(i);
        }
    }
}
