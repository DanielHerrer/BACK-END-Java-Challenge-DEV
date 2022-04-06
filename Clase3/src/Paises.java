import java.util.Scanner;

public class Paises {
    static Scanner scan = new Scanner(System.in);
    private static String[][] GeoLocat = new String[5][4];
    private static String pais, ciudad;

    public static void main(String[] args){
        llenarPais();
        llenarCiudad();
        mostrarGeo();
    }

    public static void llenarPais(){
        for(int i=0;i< 5;i++){
            System.out.println("Por favor ingrese el pais n°"+(i+1)+": ");
            pais = scan.nextLine();
            GeoLocat[i][0] = pais;
        }
    }

    public static void llenarCiudad(){
        int flag = 0;
        int contPais = 0;
        String nombPais;
        do {
            nombPais = GeoLocat[contPais][0];
            for (int j = 1; j < 4; j++) {
                System.out.println("Por favor ingrese la ciudad n°" + j + " del pais "+nombPais+": ");
                ciudad = scan.nextLine();
                GeoLocat[contPais][j] = ciudad;
            }
            contPais++;
        }while(contPais < 5);
    }

    public static void mostrarGeo(){
        for(int i=0;i<5;i++){
            System.out.println();
            for(int j=0;j<4;j++){
                System.out.print("["+GeoLocat[i][j]+"] ");
            }
        }
    }

}
