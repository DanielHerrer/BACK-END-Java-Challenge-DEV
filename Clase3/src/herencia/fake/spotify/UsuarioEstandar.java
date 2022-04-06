package herencia.fake.spotify;

public class UsuarioEstandar extends Usuario{

    static void listenSong(){
        for(int i=0;i< canciones.size();i++) {
            System.out.println("Estas escuchando: "+canciones.get(i));
            System.out.println("-MOMENTO PUBLICITARIO-");
        }
    }

}
