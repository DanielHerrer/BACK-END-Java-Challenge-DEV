public class NumPrimo {
    int num, primo, divisor = 2;

    public NumPrimo(int numero){
        this.num = numero;
    }

    public void EsPrimo(){
        if(num == 0 || num == 1 || num == 2){
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
        }

    }

}
