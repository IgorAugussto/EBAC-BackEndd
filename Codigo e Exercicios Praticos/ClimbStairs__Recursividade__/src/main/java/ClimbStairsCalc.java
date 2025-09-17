public class ClimbStairsCalc {

    public int CalcularPassos(int n) {
        if (n <= 1)
            return 1;

        return CalcularPassos(n - 1) + CalcularPassos(n - 2);


    }
}
