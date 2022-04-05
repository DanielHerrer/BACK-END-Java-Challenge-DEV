import java.util.Arrays;
import java.util.Scanner;

public class ComparadorNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idPair = 0, idOdd = 0, numBigger, numLower, numA, numB;
        int[] array = new int[10];

        //SE INGRESAN LOS 10 NUMEROS
        System.out.println();
        System.out.println("Please, type 10 numbers: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }

        //SE TOMA EL PRIMER VALOR PARA COMPARAR, SE CREAN DOS ARRAYS APARTE
        numBigger = array[0];
        numLower = array[0];
        int[] arrayP = new int[10];
        int[] arrayO = new int[10];

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

            //ORDENARLOS DE MENOR A MAYOR
            for (int i = 0; i < array.length; i++) {
                numA = array[i];
                numB = array[i + 1];
                if (numA > numB) {
                    array[i] = numB;
                    array[i + 1] = numA;
                }
            }
            System.out.println("Sort them in ascending order: " + Arrays.toString(array));

            //ORDENARLOS DE MAYOR A MENOR
            for (int i = 0; i < array.length; i++) {
                numA = array[i];
                numB = array[i + 1];
                if (numA < numB) {
                    array[i] = numB;
                    array[i + 1] = numA;
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
