import java.util.Scanner;

public class Promedio {
    public static void main(String[] args){
        int nota1, nota2, nota3, promedio;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la primer calificacion: ");
        nota1 = entrada.nextInt();
        System.out.println();

        System.out.print("Ingrese la segunda calificacion: ");
        nota2 = entrada.nextInt();
        System.out.println();

        System.out.print("Ingrese la tercer calificacion: ");
        nota3 = entrada.nextInt();
        System.out.println();

        promedio = (nota1+nota2+nota3) / 3;
        System.out.println("Su promedio es: "+promedio);
        if (promedio<10){
            System.out.println("Usted ha REPROBADO");
        }else if(promedio>=10 && promedio<15){
            System.out.println("Usted ha APROBADO");
        }else if(promedio>=15){
            System.out.println("Usted ha quedado EXIMIDO");
        }
    }
}
