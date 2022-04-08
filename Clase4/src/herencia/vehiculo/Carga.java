package herencia.vehiculo;

public class Carga extends Vehiculo {
    private Remolque remolque;

    public Carga(int matricula) {
        super(matricula);
        remolque = null;
    }

    public void ponRemolque(Remolque r) {
        this.remolque = r;
    }

    public void quitaRemolque() {
        remolque = null;
    }

    @Override
    public int acelerar(int km) throws DemasiadoRapidoException {
        velocidad += km;
        System.out.println("Acelerando a "+ velocidad +" km/h");
        if(velocidad > 100 && remolque != null){
            throw new DemasiadoRapidoException("Cuidado, tu velocidad está por encima de la máxima.");
        }
        return velocidad;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n Carga{" +
                "\n remolque=" + remolque +
                "\n }";
    }

    public Remolque getRemolque() {
        return remolque;
    }

    public void setRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

}
