package herencia.vehiculo;

public class Particular extends Vehiculo {
    private int numPuertas;

    public Particular(int matricula, int numPuertas) {
        super(matricula);
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+ "Particular{" +
                "numPuertas=" + numPuertas +
                '}';
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
