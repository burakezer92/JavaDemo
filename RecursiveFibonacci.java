public class RecursiveFibonacci {
    static int Fibonacci(int a){

        if(a<=2){
            return 1;
        }
        return Fibonacci(a-1)+Fibonacci(a-2);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(9));

    }
}
