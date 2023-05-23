import java.util.Arrays;
public class HazirDiziSM {
    public static void main(String[] args) {
        int[] a={453,6767,4,32,7,81,36,45};
        int[] f={453,6767,4,32,7,81,36,45};
        System.out.println(Arrays.toString(a));
        //Arrays.fill(a,10);
        //System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,45));
        int[] b={453,6767,4,32,7,81,36,45};
        int[] c = Arrays.copyOf(b,3);
        System.out.println(Arrays.toString(c));
        int[] d = Arrays.copyOfRange(b,3,5);
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.equals(f,b));
    }
}
