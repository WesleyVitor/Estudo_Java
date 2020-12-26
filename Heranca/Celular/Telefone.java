package Heranca.Celular;

public class Telefone extends Object {
    private boolean ligado;

    public Telefone(){
        this.ligado = false;
    }
    public Telefone(boolean ligado){
        super();
        this.ligado = ligado;
    }
    public void ligar(){
        if(this.ligado==false){
            setLigado(!this.ligado);
        }
        System.out.println("Telefone ligado!");
    }

    public void atender(){
        if(this.ligado){
            System.out.println("Telefone atendido!");
        }else{
            System.out.println("Ligue o telefone!");
        }
    }

    public boolean getLigado(){
        return this.ligado;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
}
