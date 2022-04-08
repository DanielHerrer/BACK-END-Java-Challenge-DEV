package herencia.vehiculo;

abstract public class Vehiculo {
    int matricula;
    int velocidad;

    public Vehiculo(int matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public int acelerar(int km) throws DemasiadoRapidoException {
        velocidad += km;
        System.out.println("Acelerando a "+ velocidad +" km/h");
        return velocidad;
    }

    public String toString() {
        return "{" +
                "\n matricula=" + matricula +
                "\n velocidad=" + velocidad +
                "\n }";
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
