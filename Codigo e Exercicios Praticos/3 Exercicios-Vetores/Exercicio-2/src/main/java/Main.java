import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = criarVetor(sc);

        alteracaoValorVetor(vetor);
    }

    public static int[] criarVetor(Scanner sc) {
        System.out.println("Digite a quantidade de vetores");
        int quant = sc.nextInt();
        int[] vetor = new int[quant];

        for (int i = 0; i < quant; i++) {
            System.out.println("Digite o valor da posição " + i);
            vetor[i] = sc.nextInt();
        }

        return vetor;
    }

    public static void alteracaoValorVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                vetor[i] = vetor[i] * 2;
            } else {
                vetor[i] = (int) Math.pow(vetor[i], 2);
            }
            System.out.println(vetor[i]);
        }
    }
}
