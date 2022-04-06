//SIN TERMINAR
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String jugador1, jugador2, palabra;
        int flag = 0;
        char letraIn;
        int Intentos = 0;
        int puntoJu1 = 0;
        int puntoJu2 = 0;

        System.out.println("Bienvenido al ahorcado.");

        System.out.println("Ingrese el nombre del jugador 1: ");
        jugador1 = scan.nextLine();
        System.out.println("Ingrese el nombre del jugador 2: ");
        jugador2 = scan.nextLine();

        do {
            System.out.println("Ingrese la palabra: ");
            palabra = scan.nextLine();
            String[] letras = new String[palabra.length()];
            String intentoLetras[] = new String[letras.length];
            String ingresadasLetras[] = new String[letras.length];


            while (Intentos <= 6) {
                if (letras.length > 0) {
                    System.out.println("No se ingreso la palabra");
                    break;
                }
                System.out.println("Ingrese una letra");
                letraIn = scan.next().charAt(0);

                for (int i = 0; i < letras.length; i++) {
                    System.out.println(intentoLetras[i]);
                    if (letras[i].equals(letraIn)) {
                        //Añadimos la letra a nuestro array
                        puntoJu2 = puntoJu2 + 1;
                    } else {
                        Intentos++;
                    }
                }
            }
        }while(puntoJu1<3 || puntoJu2<3);
    }
}