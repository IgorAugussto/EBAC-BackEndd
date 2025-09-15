
public class Reserva {

    private String nomeHospede;
    private String tipoQuarto;
    private String cpf;
    private int numeroDias;
    private double quatoEscolhido;
    private String quatoEscolhidoEscrito;
    private double quartoStandard = 250.00;
    private double quartoLuxo = 600.00;
    private double quartoPresidencial = 2500.00;
    private String quartoStandardEscrito = "Standard";
    private String quartoLuxoEscrito = "Luxo";
    private String quartoPresidencialEscrito = "Presiencial";
    private double valorTotalDiaria;

    public Reserva(String nomeHospede, String cpf, int numeroDias) {
        this.nomeHospede = nomeHospede;
        this.cpf = cpf;
        this.numeroDias = numeroDias;
    }

    public Reserva() {}

    public double escolherQuarto(int opcao) {
        switch (opcao) {
            case 1:
                setQuatoEscolhido(getQuartoStandard());
                calcularValorTotal(getQuatoEscolhido());
                setQuatoEscolhidoEscrito(getQuartoStandardEscrito());
                break;
            case 2:
                setQuatoEscolhido(getQuartoLuxo());
                calcularValorTotal(getQuatoEscolhido());
                setQuatoEscolhidoEscrito(getQuartoLuxoEscrito());
                break;
            case 3:
                setQuatoEscolhido(getQuartoPresidencial());
                calcularValorTotal(getQuatoEscolhido());
                setQuatoEscolhidoEscrito(getQuartoPresidencialEscrito());
        }
        return getQuatoEscolhido();
    }

    public double calcularValorTotal(double quartoEscolhido) {
        valorTotalDiaria = numeroDias * quartoEscolhido;
        setValorTotalDiaria(valorTotalDiaria);
        return getValorTotalDiaria();
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \nCPF: %s \nDiárias: %d \nTipo de Quarto: %s \nValor Total: R$%.2f\n\n",
                nomeHospede, cpf, numeroDias, quatoEscolhidoEscrito != null ? quatoEscolhidoEscrito : "Não definido", getValorTotalDiaria());
    }




    //GETTERS SETTERS
    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        if (numeroDias <= 0) {
            throw new IllegalArgumentException("Quantidade de dias precisa ser maior que zero !");
        }
        this.numeroDias = numeroDias;
    }

    public double getQuartoStandard() {
        return quartoStandard;
    }

    public String getQuartoStandardEscrito() {
        return quartoStandardEscrito;
    }

    public String getQuartoLuxoEscrito() {
        return quartoLuxoEscrito;
    }

    public String getQuartoPresidencialEscrito() {
        return quartoPresidencialEscrito;
    }

    public double getQuartoLuxo() {
        return quartoLuxo;
    }

    public double getQuartoPresidencial() {
        return quartoPresidencial;
    }

    public double getQuatoEscolhido() {
        return quatoEscolhido;
    }

    public void setQuatoEscolhido(double quatoEscolhido) {
        this.quatoEscolhido = quatoEscolhido;
    }

    public String getQuatoEscolhidoEscrito() {
        return quatoEscolhidoEscrito;
    }

    public void setQuatoEscolhidoEscrito(String quatoEscolhidoEscrito) {
        this.quatoEscolhidoEscrito = quatoEscolhidoEscrito;
    }

    public double getValorTotalDiaria() {
        return valorTotalDiaria;
    }

    public void setValorTotalDiaria(double valorTotalDiaria) {
        this.valorTotalDiaria = valorTotalDiaria;
    }
}
