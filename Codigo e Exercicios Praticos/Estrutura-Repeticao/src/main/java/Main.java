import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int num;

        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite um número positivo menor que 100");
        num = sc.nextInt();
        if (num <= 0 || num > 100) {
            System.out.println("Digite um numero entre 1 e 100");
        } else {
            int numSaida = NumeroCres(num);
            NumeroDes(numSaida);
        }
        ContadorLetra(nome);
    }

    public static int NumeroCres(int num) {
        //Crescente
        for (int i = 0; i <= num; i++) {
            System.out.println(i);

        }
        return num;
    }

    public static void NumeroDes(int numSaida) {
        //Decrecente
        for (int i = numSaida; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void ContadorLetra(String nome) {
        if (nome.length() > 6) {
            for (int i = 0; i <= nome.length(); i++) {
                System.out.println(nome);
            }
        }
    }

}
