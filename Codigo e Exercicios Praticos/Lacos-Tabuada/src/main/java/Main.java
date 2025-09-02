import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Por favor digite um numero de 1 a 100");
        System.out.println();
        int num = sc.nextInt();
        if (num == 0 || num == 101) {
            System.out.println("Favor digitar um número de 1 a 100 apenas ");
            return;
        }
        Tabuada(num);
        CopiarFraseDigitada();
    }

    public static void Tabuada (int num) {
        int i = 0;
        while (i <= 10) {
            int resultado = num * i;
            System.out.println(resultado);
            i++;
        }
    }

    public static void CopiarFraseDigitada () {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nOpção 1: Continuar.");
            System.out.println("Opção 2: Sair.");
            System.out.println("Dentre as opções acima, digite 1 para continuar no nosso programa ou 2 para sair");
            opcao = sc.nextInt();
            sc.nextLine();
            if (opcao == 2) {
                System.out.println("Obrigado por utilizar o nosso sistema, esperto que tenha gostado");
            } else {
                System.out.println("Escreva uma palavra ou uma frase");
                String frase = sc.nextLine();
                System.out.println("A frase/palavra digitada foi " + frase);
            }
        } while (opcao == 1);
    }
}
