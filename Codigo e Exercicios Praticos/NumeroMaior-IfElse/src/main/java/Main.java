import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite 2 número inteiros");

        System.out.printf("Primeiro numero: ");
        int priemrioNum = sc.nextInt();
        System.out.printf("Segundo numero: ");
        int segundoNum = sc.nextInt();

        if (priemrioNum == segundoNum) {
            System.out.println("Os número são iguais!");
        } else if (priemrioNum > segundoNum) {
            System.out.printf("O maior número é: %d", priemrioNum);
        } else {
            System.out.printf("O maior número é: %d", segundoNum);
        }
    }
}
