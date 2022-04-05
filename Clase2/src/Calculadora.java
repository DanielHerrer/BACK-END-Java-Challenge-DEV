import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numA, numB, result;
        char option, flag = 0;

        System.out.println();
        System.out.print("Welcome, please type your first number: ");
        numA = scan.nextInt();
        System.out.println();
        System.out.print("Please type your second number: ");
        numB = scan.nextInt();

        do {
            System.out.println();
            System.out.println("Calculator Menu:");
            System.out.println("a. Summation");
            System.out.println("b. Subtraction");
            System.out.println("c. Multiplication");
            System.out.println("d. Divide");
            System.out.println("e. Exit");
            System.out.println();
            System.out.print("Choice: ");
            option = scan.next().charAt(0);

            switch(option){
                case 'a':
                    result = numA + numB;
                    System.out.println("Summation: "+numA+" + "+numB+" = "+result);
                    break;
                case 'b':
                    result = numA - numB;
                    System.out.println("Subtraction: "+numA+" - "+numB+" = "+result);
                    break;
                case 'c':
                    result = numA * numB;
                    System.out.println("Multiplication: "+numA+" * "+numB+" = "+result);
                    break;
                case 'd':
                    result = numA / numB;
                    System.out.println("Divide: "+numA+" / "+numB+" = "+result);
                    break;
                case 'e':
                    flag = 1;
                    break;
                default:
                    break;
            }
        }while(flag == 0);
    }
}
