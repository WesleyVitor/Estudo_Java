package Interface;

public class Robo implements Mobilidade{
    public void ligar(){
        System.out.println("Robo ligado");
    }
    @Override
    public void andarFrente() {
        System.out.println("[Robo] andando para frente");
    }
    @Override
    public void andarTras(){
        System.out.println("[Robo] andando para tras");
    }
    @Override
    public void parar(){
        System.out.println("[Robo] parou");
    }
    @Override
    public void virarDireita(int graus){
        System.out.println("[Robo] virou a direita a "+graus+" graus");
    }
    @Override
    public void virarEsquerda(int graus){
        System.out.println("[Robo] virou a esquerda a "+graus+" graus");
    }

    public void lavantarBraco(int graus){
        System.out.println("[Robo] levantou o braço a"+graus+" graus");
    }
}
