import javax.crypto.spec.PSource;

public class Fibonacci {

    public static void main(String[] args) {
        FibonacciCalc fibonacciCalc = new FibonacciCalc();



        int fibRec = fibonacciCalc.fibonacciRecursivo(4);
        System.out.println(fibRec);
    }


}
