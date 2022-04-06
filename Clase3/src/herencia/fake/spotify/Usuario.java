package herencia.fake.spotify;

public class Usuario extends FakeSpotify{
    private String user;
    private boolean ok;

    public void logIn(String user){
        this.user = user;
    }

    public boolean confirmation(){
        if(user.equals("Standart")){
            ok = false;
        } else if(user.equals("Premium")){
            ok = true;
        }
        return ok;
    }

}
