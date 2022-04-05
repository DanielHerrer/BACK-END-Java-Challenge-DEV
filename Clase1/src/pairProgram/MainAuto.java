//Pair Programming: Sebastian Chamorro / Daniel Herrera
package pairProgram;
import java.util.Scanner;

public class MainAuto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int km, cantAceite, ruedas, flag = 0, service = 0;
        String marca, modelo, año, papeles, marcaAceite;

        System.out.println("Ingrese marca del vehiculo: ");
        marca = teclado.nextLine();
        System.out.println("Ingrese modelo del vehiculo: ");
        modelo = teclado.nextLine();
        System.out.println("Ingrese Año del vehiculo: ");
        año = teclado.nextLine();
        System.out.println("Posee papeles del vehiculo? (y/n): ");
        papeles = teclado.nextLine();
        System.out.println("Ingrese cantidad de aceite (0/100): ");
        cantAceite = teclado.nextInt();
        System.out.println("Ingrese cantidad de kilometros del vehiculo: ");
        km = teclado.nextInt();
        System.out.println("Ingrese cantidad de ruedas del vehiculo: ");
        ruedas = teclado.nextInt();
        System.out.println("Ingrese cantidad de services realizados del vehiculo: ");
        service = teclado.nextInt();

        teclado.nextLine();     //LIMPIA EL BUFFER DEL SCANNER

        System.out.println("Ingrese Marca de ultimo aceite en el service: ");
        marcaAceite = teclado.nextLine();

        Auto auto = new Auto(marca, modelo, año, ruedas, km, service, marcaAceite);

        do {

            int opcion = 0;
            System.out.println();
            System.out.println("Elija la opcion a realizar: ");
            System.out.println("1. Verificar Service");
            System.out.println("2. Verificar Aceite");
            System.out.println("3. Verificar Ruedas");
            System.out.println("4. Verificar Papeles");
            System.out.println("5. Realizar Service");
            System.out.println("6. Informar detalles");
            System.out.println("7. Salir");
            opcion = teclado.nextInt();

            //Menu de opciones
            switch (opcion) {
                case 1:
                    verificarAuto(auto);
                    break;
                case 2:
                    auto.verificarAceite(cantAceite);
                    break;
                case 3:
                    auto.verificarRuedas();
                    break;
                case 4:
                    auto.verificarPapeles(papeles);
                    break;
                case 5:
                    auto.realizarService(auto.getCantServiceHechos(),auto.getMarcaAceite());
                    auto.informarAuto(auto);
                    break;
                case 6:
                    auto.informarAuto(auto);
                    break;
                case 7:
                    flag = 1;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while(flag==0);
    }

    public static  void verificarAuto(Auto auto){
        boolean verificado=auto.verificarService(auto.getKmRealizados(), auto.getCantServiceHechos());
        if (verificado){
            System.out.println("Su auto tiene todos su services correspondientes!");
        } else {
            System.out.println("Su auto le falta realizar un service!");
        }
    }
}

