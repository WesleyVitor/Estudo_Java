package Encapsulamento_e_Heranca.Vestuario;

public class Roupa {
    private String descricao;
    private String cor;
    private String situacao;
    private String estampa;
    private int manequim;
    private Status status;
    public Roupa(){}


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void dobrar(){
        System.out.println("Roupa dobrada");
    }
    public void lavar(){
        System.out.println("Roupa lavada");
    }
}
