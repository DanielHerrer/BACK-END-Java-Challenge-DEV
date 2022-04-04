import java.util.Scanner;

public class Capicua {
    public static void main(String[] args){
        String numero1, numero2 = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor numerico: ");
        numero1 = entrada.nextLine();
        System.out.println();

        int cantidadC = numero1.length() - 1;

        while(cantidadC >= 0){
            numero2 += (numero1.charAt(cantidadC));
            cantidadC--;
        }

        if(numero1.equals(numero2)){
            System.out.println("El numero SI es capicua");
        } else {
            System.out.println("El numero NO es capicua");
        }
        System.out.println(numero2);

    }
}
