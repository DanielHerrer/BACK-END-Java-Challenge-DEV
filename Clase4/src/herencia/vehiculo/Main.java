package herencia.vehiculo;

public class Main {
    public static void main(String[] args) {
        Carga camion1 = new Carga(420123);
        Particular auto1 = new Particular(421234, 4);
        Remolque cajon = new Remolque(400);

        camion1.ponRemolque(cajon);
        System.out.println(camion1.toString());

        try {
            camion1.acelerar(20);
            camion1.acelerar(20);
            camion1.acelerar(100);
        } catch (DemasiadoRapidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
