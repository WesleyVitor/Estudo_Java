package Polimorfismo.Brinquedo;

public class Brinquedo {
    private String nome;
    private double velocidade;
    private double aceleracao;

    public Brinquedo(){}
    public Brinquedo(String nome){
        this.nome = nome;
    }
    public void mover(){}
    public void velocidade(){};
    public void velocidade(int velocidade){}
    public void velocidade(double velocidade){
        System.out.println(velocidade);
    }
    public void velocidade(float velocidade, double aceleracao){}

    public static void main(String[]args){
        Brinquedo brinks = new Brinquedo("Toy-Store");
        brinks.velocidade(2);

    }
}
