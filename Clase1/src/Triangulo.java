public class Triangulo {
    int tipo, A, B, C;

    public Triangulo(int A,int B,int C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public QuienSoy(){
        if(A==B && B==C){
            tipo = 1;
        }else if(A==B || B==C || A==C){
            tipo = 2;
        }else {
            tipo = 3;
        }

        switch(tipo){
            case 1:
                System.out.println("El triangulo es equilatero");
                break;
            case 2:
                System.out.println("El triangulo es isosceles");
                break;
            case 3:
                System.out.println("El triangulo es escaleno");
                break;
        }
    }

}
