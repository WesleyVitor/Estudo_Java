package Polimorfismo.Brinquedo;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        ControleRemoto cr = new ControleRemoto(carro);
        cr.mover();

    }
}
