package Interface;

public class Trator implements Mobilidade{
    public void ligar(){
        System.out.println("Trator ligado");
    }
    @Override
    public void andarFrente() {
        System.out.println("[Trator] andando para frente");
    }
    @Override
    public void andarTras(){
        System.out.println("[Trator] andando para tras");
    }
    @Override
    public void parar(){
        System.out.println("[Trator] parou");
    }
    @Override
    public void virarDireita(int graus){
        System.out.println("[Trator] virou a direita a "+graus+" graus");
    }
    @Override
    public void virarEsquerda(int graus){
        System.out.println("[Trator] virou a esquerda a "+graus+" graus");
    }
}
