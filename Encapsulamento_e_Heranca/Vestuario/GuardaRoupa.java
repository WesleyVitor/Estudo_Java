package Encapsulamento_e_Heranca.Vestuario;

import java.util.ArrayList;

public class GuardaRoupa {
    public ArrayList<Roupa> portaDireita;
    public ArrayList<Roupa> portaEsquerda;
    public ArrayList<Roupa> gavetaDireita;
    public ArrayList<Roupa> gavetaEsquerda;

    public GuardaRoupa(){
        this.portaDireita = new ArrayList<Roupa>();
        this.portaEsquerda = new ArrayList<Roupa>();
        this.gavetaDireita = new ArrayList<Roupa>();
        this.gavetaEsquerda = new ArrayList<Roupa>();
    }

    public void adicionar(ArrayList<Roupa>compartimento, Roupa roupa){
        roupa.setStatus(Status.GUARDA_ROUPA);
        compartimento.add(roupa);
    }
    public void remover(ArrayList<Roupa>compartimento, Roupa roupa){
        if(compartimento.contains(roupa)){
            roupa.setStatus(Status.EM_USO);
            compartimento.remove(roupa);
        }
    }

    public void checarCompartimento(ArrayList<Roupa>compartimento){
        for(Roupa roupa:compartimento){
            System.out.println(roupa);
        }
    }
    public int quantidade_roupas(){
        int qPortaDireita = portaDireita.size();
        int qPortaEsquerda = portaEsquerda.size();
        int qGavetaDireita = gavetaDireita.size();
        int qGavetaEsquerda = gavetaEsquerda.size();
        int soma = qGavetaDireita+qGavetaEsquerda+qPortaDireita+qPortaEsquerda;
        return soma;
    }

}
