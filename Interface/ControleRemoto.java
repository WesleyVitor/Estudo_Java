package Interface;

public class ControleRemoto {
    public void brinquedoAndaPraFrente(Mobilidade obj){
        obj.andarFrente();
    }
    public void brinquedoAndarParaTras(Mobilidade obj){
        obj.andarTras();
    }
    public void brinquedoParar(Mobilidade obj){
        obj.parar();
    }
    public void brinquedoVirarDireita(Mobilidade obj, int graus){
        obj.virarDireita(graus);
    }
    public void briquedoVirarEsquerda(Mobilidade obj, int graus){
        obj.virarEsquerda(graus);
    }
}
