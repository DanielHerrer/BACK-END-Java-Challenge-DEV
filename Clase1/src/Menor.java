import java.util.Scanner;

public class Menor {
    public static void main(String[] args){
        int valor1,valor2,valor3,menor;
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[3];

        System.out.print("Ingrese el primer valor: ");
        valor1 = entrada.nextInt();
        numeros[0] = valor1;

        System.out.print("Ingrese el segundo valor: ");
        valor2 = entrada.nextInt();
        numeros[1] = valor2;

        System.out.print("Ingrese el tercer valor: ");
        valor3 = entrada.nextInt();
        numeros[2] = valor3;

        //Asignamos el primer valor del arreglo para tener un parametro
        menor = valor1;
        //Luego recorremos el arreglo
        for(int i=0;i<numeros.length;i++){
            if(menor>numeros[i]){
                menor = numeros[i];
            }
        }

        System.out.print("El valor numerico mas bajo es: "+menor);
    }
}