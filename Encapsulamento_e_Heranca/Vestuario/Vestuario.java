package Encapsulamento_e_Heranca.Vestuario;

public class Vestuario {
    public static void main(String[] args) {
        GuardaRoupa gr = new GuardaRoupa();
        Social terno = new Social();
        gr.adicionar(gr.portaDireita, terno);
        gr.checarCompartimento(gr.portaDireita);
    }
}
