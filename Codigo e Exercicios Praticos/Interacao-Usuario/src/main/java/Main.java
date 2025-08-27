import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        String nome;
        String cpf;
        String estadoCivil;
        int idade;
        double peso;
        double altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Comece digitando seu nome completo abaixo");
        nome = sc.nextLine();
        String[] primeiroNome = nome.split(" ");

        System.out.println("Seja Bem-Vindo " + primeiroNome[0]);
        System.out.println("Agora preencha essa informações abaixo");

        System.out.println("CPF:");
        cpf = sc.nextLine();
        System.out.println("Idade:");
        idade = sc.nextInt();
        System.out.println("Peso:");
        peso = sc.nextFloat();
        System.out.println("Altura:");
        altura = sc.nextFloat();
        sc.nextLine();
        System.out.println("Estado Civíl:");
        estadoCivil = sc.nextLine();
        sc.close();

        System.out.println(primeiroNome[0] + " Essa são suas informações");
        System.out.printf("Nome: %s\nCPF: s% \nIdade: %d\nPeso: %.2f\nAltura: %.2f\nEstado Civil: %s\n",
                nome, cpf, idade, peso, altura, estadoCivil);


    }
}
