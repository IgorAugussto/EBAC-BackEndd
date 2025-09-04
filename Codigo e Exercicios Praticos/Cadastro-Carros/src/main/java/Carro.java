import java.util.Scanner;

public class Carro {

    Scanner sc = new Scanner(System.in);

    public String marca;
    public String modelo;
    public int quantidade;
    public double preco;

    Carro (String marca, String modelo, int quantidade, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Caroo: " + marca + " " + modelo + " | Quantidade total de carros cadastrados" + quantidade +
        "Preço: R$ " + preco;
    }

    public Carro[] cadastrarCarro (int qtd) {
        Carro[] carros = new Carro[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nCarro " + (i + 1) + ":");

            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine();
            sc.nextLine(); // limpar buffer

            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            sc.nextLine(); // limpar buffer

            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            sc.nextLine(); // limpar buffer

            carros[i] = new Carro(marca, modelo, quantidade, preco);
        }

        return carros;
    }
}
