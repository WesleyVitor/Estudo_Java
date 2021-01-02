package Interface;
public class Main {
    public static void main(String[] args) {
        ControleRemoto cr = new ControleRemoto();
        Robo robo = new Robo();
        Trator trator = new Trator();

        cr.brinquedoAndaPraFrente(robo);
        cr.brinquedoAndaPraFrente(trator);
        System.out.println();
        cr.brinquedoAndarParaTras(robo);
        cr.brinquedoVirarDireita(robo, 30);
    }
}
