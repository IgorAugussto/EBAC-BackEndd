import java.util.Scanner;
import java.util.SimpleTimeZone;

public class ReservaManager {

    Scanner sc = new Scanner(System.in);

    private Reserva[] reservas;

    public ReservaManager() {
    }

    public void adicionarReserva(int qtdReservas) {
        Reserva[] reservas = new Reserva[qtdReservas];

        for (int i = 0; i < reservas.length; i++) {
            System.out.println("Prencha as informações abaixo");
            System.out.printf("Nome: ");
            String nome = sc.nextLine();
            System.out.printf("CPF: ");
            String cpf = sc.nextLine();
            System.out.printf("Quantas diarias: ");
            int diarias = sc.nextInt();
            sc.nextLine();

            Reserva hospede = new Reserva(nome, cpf, diarias);

            System.out.println("Tipo de Quarto:");
            System.out.println("1 - Standard - R$250,00");
            System.out.println("2 - Luxo - R$600,00");
            System.out.println("3 - Presidencial - R$2.500,00");
            int opcao = sc.nextInt();
            sc.nextLine();
            hospede.escolherQuarto(opcao);
            reservas[i] = hospede;

        }
        setReservas(reservas);
    }

    public void listarReservas(Reserva[] reservas) {
        for (int i = 0; i < reservas.length; i++) {
            System.out.println(reservas[i]);
        }
    }

    public void listarReservaPorNome(Reserva[] reservas) {
        System.out.println("Digite o nome do hospide para buscar:");
        String nomeBusca = sc.nextLine().trim();

        boolean encontrado = false;
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] != null && reservas[i].getNomeHospede() != null) {
                if (reservas[i].getNomeHospede().equalsIgnoreCase(nomeBusca)) {
                    System.out.println("Reserva encontrada:");
                    System.out.println(reservas[i].toString());
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("Nenhuma reserva encontrada para o nome " + nomeBusca);
        }
    }

    public void ordenarQuantidadeDias(Reserva[] reservas) {
        for (int i = 0; i < reservas.length; i++) {
            for (int j = i; j < reservas.length; j++) {

                if (reservas[j].getNumeroDias() > reservas[i].getNumeroDias()) {
                    Reserva aux = reservas[i];
                    reservas[i] = reservas[j];
                    reservas[j] = aux;
                }
            }
            System.out.println(reservas[i]);
        }
    }

    /*@Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Lista de Reservas:\n");
       Reserva[] listaReservas = getReservas();
       for (int i = 0; i < listaReservas.length; i++) {
           if (listaReservas[i] != null) {
               sb.append(String.format("Reserva %d:\nNome: %s \nCPF: %s \nDiarias: %d \nTipo de Quarto: %s\n", (i + 1), listaReservas[i].getNomeHospede(),
                       listaReservas[i].getCpf(), listaReservas[i].getNumeroDias(),listaReservas[i].getQuatoEscolhidoEscrito()));
           }
       }
       if (listaReservas.length == 0) {
           sb.append("Nenhuma reserva cadastrada");
       }
       return sb.toString();
    }*/

    //GETTERS SETTERS
    public Reserva[] getReservas() {
        return reservas;
    }

    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }
}
