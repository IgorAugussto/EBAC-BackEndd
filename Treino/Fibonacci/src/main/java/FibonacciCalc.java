import java.util.HashMap;
import java.util.Map;

public class FibonacciCalc {

    private Map<Integer, Integer> memo = new HashMap<>();

    public void fibonacci(int n) {

        int valorA = 0;
        int valorB = 1;
        int fib = 0;

        for (int i = 1; i < n; i++) {
            fib = valorA + valorB;

            valorA = valorB;
            valorB = fib;
        }
        System.out.println(fib);
    }

    public int fibonacciRecursivoMemo(int n) {
        Integer valorEmMemoria = memo.get(n);

        if (valorEmMemoria != null)
            return valorEmMemoria;

        if (n < 2) {
            return n;
        }

        int resultado = fibonacciRecursivoMemo(n - 1) + fibonacciRecursivoMemo(n - 2);
        memo.put(n, resultado);

        return resultado;
    }

    public int fibonacciRecursivo(int n) {
        if (n < 2) {
            return n;
        }

        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
}
