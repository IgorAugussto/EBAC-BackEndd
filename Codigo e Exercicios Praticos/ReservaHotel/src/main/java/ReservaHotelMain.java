import java.util.Scanner;

public class ReservaHotelMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReservaManager reservaManager = new ReservaManager();
        int opcao;

        do {
            System.out.println("---- Seja Bem-Vindo a sua área de administração de hotel ! ----");
            System.out.println("Escolha umas das opções abaixo");
            System.out.println("1 - Nova Reserva");
            System.out.println("2 - Listar Reserva");
            System.out.println("3 - Buscar por nome do hóspede");
            System.out.println("4 - Ordenar por dias");
            System.out.println("5 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite quantas reservas quer cadastrar");
                    int qtdReservas = sc.nextInt();
                    reservaManager.adicionarReserva(qtdReservas);
                    break;
                case 2:
                    reservaManager.listarReservas(reservaManager.getReservas());
                    break;
                case 3:
                    reservaManager.listarReservaPorNome(reservaManager.getReservas());
                    break;
                case 4:
                    reservaManager.ordenarQuantidadeDias(reservaManager.getReservas());
                    break;
            }
        } while (opcao != 5);
    }

}
