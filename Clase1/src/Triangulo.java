public class Triangulo {
    private int A, B, C;

    public Triangulo(int ladoA,int ladoB,int ladoC){
        this.A = ladoA;
        this.B = ladoB;
        this.C = ladoC;
    }

    public void QuienSoy(){
        if(A==B && B==C){
            System.out.println("El triangulo es equilatero");
        }else if(A==B || B==C || A==C){
            System.out.println("El triangulo es isosceles");
        }else {
            System.out.println("El triangulo es escaleno");
        }

    }

}
