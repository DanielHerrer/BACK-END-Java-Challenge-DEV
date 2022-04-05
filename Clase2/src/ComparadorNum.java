import java.util.Arrays;
import java.util.Scanner;

public class ComparadorNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idPair = 0, idOdd = 0, capP=0, capO=0, numBigger, numLower;
        int[] array = new int[10];

        //SE INGRESAN LOS 10 NUMEROS
        System.out.println();
        System.out.println("Please, type 10 numbers: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            array[i] = scan.nextInt();
            if ((array[i] % 2) == 0) {
                capP++;
            }else if ((array[i] % 2) != 0) {
                capO++;
            }
        }

        //SE TOMA EL PRIMER VALOR PARA COMPARAR, SE CREAN DOS ARRAYS APARTE
        numBigger = array[0];
        numLower = array[0];
        int[] arrayP = new int[capP];
        int[] arrayO = new int[capO];

        //LUEGO RECORRE EL ARREGLO ORIGINAL Y TOMA LOS DATOS
        for (int i = 0; i < array.length; i++) {
            if (numBigger < array[i]) {
                numBigger = array[i];
            }
            if (numLower > array[i]) {
                numLower = array[i];
            }

            if ((array[i] % 2) == 0) {
                arrayP[idPair] = array[i];
                idPair++;
            } else if ((array[i] % 2) != 0) {
                arrayO[idOdd] = array[i];
                idOdd++;
            }
        }

        System.out.println("Show the biggest number: " + numBigger);
        System.out.println("Show the lowest number: " + numLower);
        System.out.println("Show pair numbers: " + Arrays.toString(arrayP));
        System.out.println("Show odd numbers: " + Arrays.toString(arrayO));

        //ORDENAMIENTO DE MENOR A MAYOR - METODO BURBUJA
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sort them in ascending order: " + Arrays.toString(array));

        //ORDENAMIENTO DE MAYOR A MENOR - METODO BURBUJA
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sort them descending: " + Arrays.toString(array));

    }
}

/*
Realizar un programa que permita ingresar por teclado 10 números en un arreglo y debe:

Mostrar el número mayor
Mostrar el número menor
Mostrar los números pares
Mostrar los números impares
Ordenarlos de manera Ascendente
Ordenarlos de manera Descendente
 */
