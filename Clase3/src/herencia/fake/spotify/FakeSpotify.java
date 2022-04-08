package herencia.fake.spotify;
import java.util.ArrayList;

abstract public class FakeSpotify{

    public FakeSpotify(String usuario, ArrayList<String> songs) {
        UsuarioPremium menPre = new UsuarioPremium();
        Usuario menUsu = new Usuario();

        if(menPre.confirmation(usuario)){
            menPre.listenSong(songs);
        } else if(menUsu.confirmation(usuario)){
            menUsu.listenSong(songs);
        } else {
            System.out.println("Your username is invalid.");
        }

    }

}