package interfaz;
import java.util.Arrays;
import java.util.Scanner;

public class Truco implements RepartirCartas {
    Scanner scan = new Scanner(System.in);
    int jugadores, cantCartas = 40;

    @Override
    public void repartir() {

        System.out.print("Cuantas personas van a jugar?: ");
        jugadores = scan.nextInt();
        System.out.println();

        int[] array = new int[jugadores];
        int cartasReparto = jugadores * 3;

        if (cartasReparto > cantCartas) {
            System.out.println("No alcanzan las cartas para los jugadores");
        } else {
            for (int i = 0; i < jugadores; i++) {
                array[i] = cartasReparto / jugadores;
            }
        }

        System.out.println("TRUCO - Manos en juego: " + Arrays.toString(array));
    }

}
