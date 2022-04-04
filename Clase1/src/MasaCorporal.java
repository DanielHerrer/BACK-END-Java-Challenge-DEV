import java.util.Scanner;

public class MasaCorporal {
    public static void main(String[] args){
        double peso, alturaCm;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su altura [Ejemplo= 165 (cm)]: ");
        alturaCm = entrada.nextDouble();
        System.out.println();

        System.out.print("Ingrese su peso [Ejemplo= 68 (kg)]: ");
        peso = entrada.nextDouble();
        System.out.println();

        //Pasa de centimetros a metros
        double alturaMt = alturaCm / 100;
        double imc = peso / (alturaMt * alturaMt);

        System.out.println("IMC: "+ imc);

        if(imc < 20){
            System.out.println("Mal estado");
        }else if(imc < 23){
            System.out.println("Bajo de Peso");
        }else if(imc < 26){
            System.out.println("Peso Normal");
        }else if(imc < 31){
            System.out.println("Sobrepeso");
        }else if(imc < 41){
            System.out.println("Sobrepeso crónico");
        }else if(imc > 40){
            System.out.println("Hospitalizado");
        }
    }
}