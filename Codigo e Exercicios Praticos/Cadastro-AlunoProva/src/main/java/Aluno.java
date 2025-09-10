public class Aluno {
    private String nome;
    private int idade;
    private double[] notas;

    // Construtor
    public Aluno(String nome, int idade, int qtdNotas) {
        this.nome = nome;
        this.idade = idade;
        this.notas = new double[qtdNotas];
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getNotas() {
        return notas;
    }

    // Setter de notas com validação
    public void setNota(int pos, double valor) {
        if (valor < 0 || valor > 10) {
            throw new IllegalArgumentException("Nota inválida! Digite um valor entre 0 e 10.");
        }
        notas[pos] = valor;
    }

    // Cálculo da média
    public double calcularMedia() {
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.length;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " | Idade: " + idade;
    }
}
