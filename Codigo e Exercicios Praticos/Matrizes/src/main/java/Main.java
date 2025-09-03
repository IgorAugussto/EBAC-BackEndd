public class Main {

    public static void main (String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4,},
                {5, 6, 7, 8,},
                {9, 10, 11, 12,},
                {13, 14, 15, 16}
        };

        for (int[] linha : matriz) {
            // Segundo for-each para iterar pelos elementos de cada linha
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
    }
}
