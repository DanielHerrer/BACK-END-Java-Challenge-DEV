package herencia.fake.spotify;
import java.util.ArrayList;
import java.util.Scanner;

public class FakeSpotify{
    static ArrayList<String> canciones = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Usuario menUsu = new Usuario();
        String usuario;
        canciones.add("She dont give a fo");
        canciones.add("Bad to the bones");
        canciones.add("Lo malo de ser bueno");

        System.out.println("Welcome to FakeSpotify, please type your user: ");
        usuario = scan.nextLine();

        menUsu.logIn(usuario);
        boolean ok = menUsu.confirmation();
        if(ok){
            UsuarioPremium.listenSong();
        } else {
            UsuarioEstandar.listenSong();
        }

    }

}

/*
1) generar un "fake" spotify", donde tienen canciones,
y usuarios estándar y premium., los dos heredan de usuario

2) hacer una clase "forma" y que hereden cuadrado, triangulo y circulo,
 y que deban sobrecargar el método de la clase madre "calcularPerimetro" y "calcular area"
 */