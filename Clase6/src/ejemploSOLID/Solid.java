public class Solid {
    public static void main(String[] args) throws Exception {
        /*
        S: Single Responsibility Principle -> Principio de responsabilidad unica
        O: Open/Closed Principle -> Principio de abierto/cerrado
        L: Liskov Substitution Principle -> Principio de sustitución de Liskov
        I: Interface Segregation Principle -> Principio de segrergación de interfaz
        D: Dependency Inversion Principle -> Principio de inversión de dependencia


        - Mantenimiento del codigo es mas facil y rapido
        - Permite añadir funcioanlidad de forma mas sencilla
        [Escalable][Interoperable]
        - Favorece una mayor reusabilidad y calidad del codigo, asi como
        encapsulacion [Recuperabilidad][Portabilidad]

        S.
        Establece que una clase, componente o microservicio debe ser
        responsable de una sola cosa (desacoplado).Si una clase tiene
        varias responsabilidades, esto implica que el cambio de una responsabilidad
        provocara la modificacion de otra responsabilidad.

        class Coche {
            private String marca;

            public Coche(String marca) {
            this.marca = marca;
            }

            public String getMarca(){
            return marca;
            }

            public void guardarCocheDB(this){...}
        }

        No deberia permitir nada que tenga que ver con la BD.
        El principio estaría aplicado asi:

        class cocheDB {
            public void guardarCocheDB(Coche coche){...}
            public void eliminarCocheDB(Coche coche){...}
        }

        O.
        Establce que las entidades de SW (clases, modulos y funciones) deberian
        estar abiertos para su extension, pero cerrado para su modificacion.

        class Coche {
            String marca;
            public Coche(String marca) {this.marca = marca;}
            public String getMarca(){return marca;}
        }

        main() {
            Coche[] coches = {new Coche("fiat"), new Coche("vw")};
            imprimirMarcas(coches);
        }

        public static void imprimirCoches(Coche[] coches) {
            for(Coche coche: coches) {
                System.out.Println(coche.marca);
            }
        }

        public static void imprimirPrecioSegunMarca(Coche[] coches) {
            for(Coche coche: coches) {
                if(coche.getMarca().equals("fiat")) {
                    print(100000);
                }
                if(coche.getMarca().equals("vw")) {
                    print(180000);
                }
            }
        }

        El coche debe mostrar lo que quiere, debe haber un encapsulamiento

        ----> coche.getMarca() y el String marca debe ser private

        Principio aplicado:

        public abstract class Coche {
            public abstract int precioMedioCoche();
        }

        public class Fiat extends Coche {
            @override
            public int precioMedioCoche() {return 100000;}
        }

        public clss Vw extends Coche {
            @override
            public int precioMedioCoche() {return 180000;}
        }

        main() {
            Coche[] coches = {new Fiat(), new Vw()};
            imprimirPrecioMedioCoche(coches);
        }

        public static void imprimirPrecioMedioCoche(Coche[] coches) {
            for(Coche coche: coches) {
                print(coche.precioMedioCoche());
            }
        }


        L.
        Declara que una subclase debe ser sustituible por su superclase, y si
        al hacer esto el programa falla, estaremos violando este principio.

        public static void imprimirNumeroAsientos(Coche[] listaCoches) {
            for(Coche value: listaCoches) {
                if(value instanceof Fiat) {
                    print(nAsientosFiat(value));
                } else if(value instanceof Fiat500){
                    print(nAsientosFiat(value));
                }
            }
        }


        Bien hecho:
        public abstract class Coche {
            public abstract int nAsientos();
        }

        public Fiat extends Coche {
            @override
            public int nAsientos() {return 4;}
        }

        public Fiat500 extends Fiat {
            @override
            public int nAsientos() {return 2;}
        }

        Coche f500 = new Fiat500();

        public static void imprimirNumeroAsientos(Coche[] coches) {
            for(Coche coche: coches) {
                print(coche.nAsientos());
            }
        }


        I.
        establece que los consumidores de una interfaz no deberian verse
        forzados a depender de interfaces que no usan.
        Si no lo uso, no implemento.

        public interface IAve {
            public void volar();
            public void comer();
            public void nadar();
        }

        public class Loro implements IAve {
            @override
            public void volar(){...}
            public void comer(){...}
        }

        public class Tucan implements IAve {
            @override
            public void volar(){...}
            public void comer(){...}
        }

        public class Pinguino implements IAve {
            @override
            public void volar(){...}
            public void comer(){...}
            public void nadar(){...}
        }

        Aplicamos el principio:

        public interface IAve {
            public void comer();
        }

        public interface IAveVoladora {
            public void volar();
        }

        public interface IAveNadadora {
            public void nadar();
        }

        class Loro implements IAve, IAveVoladora {
            @override
            public void volar(){...};
            public void comer(){...};
        }

        class Pinguino implements IAve, IAveNadadora {
            @override
            public void nadar(){...};
            public void comer(){...};
        }

        D.
        Establece que las dependencias deben estar en las abstracciones,
        no en las concreciones.
        - Los modulos de alto nivel no deberian depender de los modulos
        de bajo nivel. Ambos deben deberian depender de abstracciones
        - las abstracciones no deberian depender de modulos de bajo nivel.
        Los detalles deberian depender de abstracciones.

        public class DatabaseService {
            Dato getDatos(){...}
        }

        public class accesoADatos {
            private DatabaseService dbService;
            public AccesoADatos(DatabaseService dbS) {
                this.dbService = dbS;
            }
            public Dato getDatos(){this.sbService.getDatos();}
        }

        Aplicando el principio:

        public interface Conexion {
            public Dato getDatos();
            public void setDatos();
        }

        public class AccesoADatos {
            private Conexion conexion;

            public AccesoADatos(Conexion conexion) {
                this.conexion = conexion;
            }

            public Dato getDatos() {
                this.conexion.getDatos();
            }
        }

        public class DatabaseService implements Conexion {
            @override
            public Dato getDatos(){...}
            public void setDatos(){...}
        }

        public class APIService implements Conexion {
            @override
            public Dato getDatos(){...}
            public void setDatos(){...}
        }
        */
    }
}