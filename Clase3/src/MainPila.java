//SIN TERMINAR
public class MainPila {

    public static void main(String[] args){
        int cant=4;
        Pila pilax = new Pila(cant);

        pilax.push("");
        if(!pilax.Full()){
            pilax.push("prueba");
            pilax.push("prueba2");
            pilax.push("prueba3");
        }

        if(!pilax.Empty()){
            System.out.println(pilax.Views());
        }

        while(!pilax.Empty()){
            System.out.println(pilax.pop());
        }

    }

}

