package herencia.fake.spotify;
import java.util.ArrayList;

public class UsuarioPremium extends FakeSpotify{
    private boolean confirmation;

    public boolean confirmation(String user){
        if(!user.equals("Premium")){
            confirmation = false;
        }
        return confirmation;
    }

    public void listenSong(ArrayList<String> songs){
        for(int i=0;i< songs.size();i++) {
            System.out.println("Estas escuchando: "+songs.get(i));
            System.out.println();
        }
    }

}
