
import java.util.Scanner;

class JuegoFacade {
    private Scanner scanner = new Scanner(System.in);

    public void jugarPartidaRapida() {
        System.out.print("Nombre Jugador 1: ");
        String n1 = scanner.nextLine();
        System.out.print("Nombre Jugador 2: ");
        String n2 = scanner.nextLine();

        JuegoLucha juego = new JuegoLucha(n1, n2);
        juego.iniciarPelea();
    }
}
