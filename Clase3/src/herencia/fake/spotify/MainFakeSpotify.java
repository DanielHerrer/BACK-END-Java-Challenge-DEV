package herencia.fake.spotify;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFakeSpotify {
    public static void main(String[] args){
        ArrayList<String> canciones = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int flag, opcion;
        String usuario;

        System.out.println("Welcome to FakeSpotify ");
        do {
            flag=0;
            System.out.println();
            System.out.println("Playlists to play:");
            System.out.println("1. Trap");
            System.out.println("2. Rock");
            System.out.println("3. Tech");
            opcion = scan.nextInt();

            if (opcion == 1) {
                canciones.add("She dont give a fo");
                canciones.add("Dance Crip");
                canciones.add("Canguro");
            } else if (opcion == 2) {
                canciones.add("Should stay or should i go");
                canciones.add("Bad to the bones");
                canciones.add("Black in black");
            } else if (opcion == 3) {
                canciones.add("Psy");
                canciones.add("House");
                canciones.add("Progressive");
            } else {
                System.out.println();
                System.out.println("Invalid option.");
                flag=1;
            }
        } while(flag==1);

        System.out.println("Please, sign in with your username: ");
        usuario = scan.nextLine();

        public static void confirmation()

        System.out.println();


    }

}
