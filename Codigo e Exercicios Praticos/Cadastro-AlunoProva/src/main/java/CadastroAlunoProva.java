import java.util.Scanner;

public class CadastroAlunoProva {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // Quantos alunos serão cadastrados?
        System.out.print("Digite a quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();

        // Quantas provas cada aluno fez?
        System.out.print("Digite a quantidade de notas por aluno: ");
        int qtdNotas = sc.nextInt();
        sc.nextLine(); // limpar buffer

        Aluno[] alunos = new Aluno[qtdAlunos];

        // Cadastro dos alunos
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("\n--- Cadastro do aluno " + (i + 1) + " ---");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine(); // limpar buffer

            Aluno a = new Aluno(nome, idade, qtdNotas);

            // Cadastro das notas com validação
            for (int j = 0; j < qtdNotas; j++) {
                double nota;
                while (true) {
                    System.out.print("Digite a " + (j + 1) + "ª nota: ");
                    nota = sc.nextDouble();
                    sc.nextLine(); // limpar buffer
                    if (nota >= 0 && nota <= 10) {
                        break; // válido
                    }
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
                a.setNota(j, nota);
            }

            alunos[i] = a;
        }

        // Exibir resultados
        System.out.println("\n===== RESULTADOS =====");
        for (Aluno a : alunos) {
            System.out.println(a); // chama o toString
            System.out.print("Notas: ");
            for (double n : a.getNotas()) {
                System.out.print(n + " | ");
            }
            System.out.printf("\nMédia: %.2f\n", a.calcularMedia());
            System.out.println("-------------------");
        }

        sc.close();
    }
}
