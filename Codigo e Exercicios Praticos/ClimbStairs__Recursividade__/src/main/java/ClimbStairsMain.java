import java.util.Scanner;

public class ClimbStairsMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        ClimbStairsCalc climbStairsCalc = new ClimbStairsCalc();

        System.out.printf("Digite a quantidade de degraus que deseja calcular: ");
        n = sc.nextInt();
        System.out.println("Se o número de degraus for " + n +" Há " + climbStairsCalc.CalcularPassos(n) +" maneiras distintas de subir até o topo");



    }
}
