package Heranca.Celular;

public class CelularTiraFoto extends Telefone {
    private double resolucao_camera_traseira;
    private double resolucao_camera_frontal;
    public CelularTiraFoto(){
        super();
    }
    public CelularTiraFoto(boolean ligado, double resolucao_camera_traseira, double resolucao_camera_frontal){
        super(ligado);
        this.resolucao_camera_traseira = resolucao_camera_traseira;
        this.resolucao_camera_frontal = resolucao_camera_frontal;
    }
    public double getResolucao_camera_frontal() {
        return resolucao_camera_frontal;
    }

    public void setResolucao_camera_frontal(double resolucao_camera_frontal) {
        this.resolucao_camera_frontal = resolucao_camera_frontal;
    }

    public double getResolucao_camera_traseira() {
        return resolucao_camera_traseira;
    }

    public void setResolucao_camera_traseira(double resolucao_camera_traseira) {
        this.resolucao_camera_traseira = resolucao_camera_traseira;
    }
}
