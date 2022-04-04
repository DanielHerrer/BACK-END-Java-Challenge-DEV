import java.util.Scanner;

public class Mayor {
    public static void main(String[] args){
        int valor1,valor2,valor3,mayor = 0;
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

        for(int i=0;i<numeros.length;i++){
            if(mayor<numeros[i]){
                mayor = numeros[i];
            }
        }

        System.out.print("El valor numerico mas alto es: "+mayor);
    }
}
