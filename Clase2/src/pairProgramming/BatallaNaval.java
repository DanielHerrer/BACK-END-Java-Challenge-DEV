package pairProgramming;
import java.util.Scanner;

public class BatallaNaval {
    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y, x1, y2;

        System.out.println("Bienvenido a Batalla Naval");
        System.out.println(Por favor, ingrese las coordenadas a ejecutar su disparo.”);
        System.out.print(“Coordenadas X: “);
        x1 = scan.nextInt();
        System.out.print(“Coordenadas Y: “);
        y1 = scan.nextInt();

        Int[][] mat = new mat[10][10];

        llenarMat(mat);

        ubicarBarquito(mat);

        disparo(x1,y1);


        public int[][] llenarMat(int[][] mat){
            for(int i=0;i<mat.lentgh;i++){
                for(int j=0;j<mat[i].lentgh;i++){
                    Mat[i][j] = 0;
                }
            }
            return mat;
        }

        public int[][] ubicarBarquito(int[][] mat){
            Int barco = 10;
            this.x = (int) (Math.random()* 10 +1;
            this.y = (int) (Math.random()* 10 +1;
            mat[x][y] = barco ;
            return mat
        }

.
.
.
.
.
        public void disparo(int x1, int y1){
            if (this.x == x && this.y == y){
                System.out.println(“Su disparo ha acertado.”);
            } else {
                System.out.println(“Su disparo ha fallado.”);
            }
        }




    }
}
