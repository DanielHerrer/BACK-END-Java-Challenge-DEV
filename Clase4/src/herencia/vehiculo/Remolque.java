package herencia.vehiculo;

public class Remolque {
    private int peso;

    public Remolque(int peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Remolque{" +
                "peso=" + peso + "kg" +
                '}';
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
