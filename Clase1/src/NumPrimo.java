import java.util.Scanner;

public class NumPrimo {
    int num, flag, primo = 0, divisor = 2;
    Scanner entrada = new Scanner(System.in);

    public void EsPrimo(){

        do{
            System.out.print("Ingrese un numero del 1 al 14: ");
            num = entrada.nextInt();
            System.out.println();

            if(num < 1 || num > 14){
                System.out.println("El numero ingresado es incorrecto.");
                flag=0;
            }else{
                flag=1;
            }
        }while(flag==0);

        if(num == 1 || num == 2){
            primo = 0;
        }

        while ((primo == 0) && (divisor!=num)){
            if(num % divisor != 0) {
                primo = 1;
            }
            divisor++;
        }

        switch(primo){
            case 0:
                System.out.println("El numero NO es primo.");
                break;
            case 1:
                System.out.println("El numero SI es primo.");
                break;
            default:
                break;
        }

    }

}
