import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vetor = criarVetor(sc);

        ordemCres(vetor);

        exibirVetorCres(vetor);

        sc. close();
    }

    public static String[] criarVetor(Scanner sc) {
        System.out.println("Digite a quantidade de vetores");
        int quant = sc.nextInt();
        String[] vetor = new String[quant];
        sc.nextLine();

        for (int i = 0; i < quant; i++) {
            System.out.println("Digite a palavra da posição  " + i);
            vetor[i] = sc.nextLine();
        }

        return vetor;
    }

    public static void ordemCres (String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i; j < vetor.length; j++) {
                if (vetor[j].compareTo(vetor[i]) < 0) {
                    String aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }

    public static void exibirVetorCres(String[] vetor) {
        System.out.println("Veja os valores do vetor que você criou em ordem crescente:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}
