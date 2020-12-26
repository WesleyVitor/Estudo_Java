package Heranca.Celular;

public class SmartPhone extends CelularTiraFoto {
    private String senha_wifi;

    public SmartPhone(){
        super();
    }
    public SmartPhone(boolean ligado, double resolucao_camera_traseira, double resolucao_camera_frontal, String senha_wifi){
        super(ligado, resolucao_camera_traseira, resolucao_camera_frontal);
        this.senha_wifi = senha_wifi;
    }


    public String getSenha_wifi() {
        return senha_wifi;
    }

    public void setSenha_wifi(String senha_wifi) {
        this.senha_wifi = senha_wifi;
    }
}
