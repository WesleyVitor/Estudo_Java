package Interface;

public interface Mobilidade extends Energia{
    public void andarFrente();
    public void andarTras();
    public void parar();
    public void virarDireita(int graus);
    public void virarEsquerda(int graus);
}
