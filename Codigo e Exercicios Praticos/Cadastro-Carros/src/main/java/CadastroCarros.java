import java.util.Scanner;

public class CadastroCarros {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Quantos carros deseja cadastrar ? (Max 50)");
        int qtd = sc.nextInt();
        sc.nextLine();

        if (qtd > 50) {
            System.out.println("Quantidade maior que o limite (50). Será considerado 50.");
            qtd = 50;
        }

        Carro carroAux = new Carro(" ", " ", 0, 0.0);
        Carro[] meusCarros = carroAux.cadastrarCarro(qtd);

        System.out.println("\n--- Resultado ---");
        for (Carro c : meusCarros) {
            System.out.println(c); // aqui chama o toString() de cada carro
        }


    }
}
