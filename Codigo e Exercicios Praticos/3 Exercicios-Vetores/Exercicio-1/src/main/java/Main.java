import java.util.Scanner;

public class Main {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = criarVetor(sc);

        exibirVetor(vetor);

        ordemCres(vetor);

        exibirVetorCres(vetor);

        sc.nextLine();
        System.out.println("Digite um nome abaixo");
        String nome = sc.nextLine();
        exibirSOmenteVogais(nome);

        sc.close();

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

    public static void exibirVetor(int[] vetor) {
        System.out.println("Veja os valores do vetor que você criou:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }

    public static void exibirVetorCres(int[] vetor) {
        System.out.println("Veja os valores do vetor que você criou em ordem crescente:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }

    public static void ordemCres (int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i; j < vetor.length; j++) {
                if (vetor[j] < vetor[i]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }

    public static void exibirSOmenteVogais(String nome) {
        String somenteVogais = nome.replaceAll("(?i)[^aeiou]","");
        System.out.println("Vogais: " + somenteVogais);
    }
}
