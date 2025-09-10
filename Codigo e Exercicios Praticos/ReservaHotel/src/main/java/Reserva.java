public class Reserva {

    private String nome;
    private String cpf;
    private String tipoQuarto;
    private int diarias;
    private double valorDiaria;
    private int[] qtdReserva = new int[10];

    public Reserva(String nome, String cpf, String tipoQuarto, int diarias) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoQuarto = tipoQuarto;
        this.diarias = diarias;
        
    }

    //Calcular valor total da diaria: quantidade de dias * valor da diaria (Retorna double)
    public double calcularValorTotalDiaria(int diarias, double valorDiaria) {
        double resultado = diarias * valorDiaria;

        return resultado;
    }

    //Registrar reserva
    public void registrarReserva() {

    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int[] getQtdReserva() {
        return qtdReserva;
    }

    public void setQtdReserva(int[] qtdReserva) {
        this.qtdReserva = qtdReserva;
    }
}
