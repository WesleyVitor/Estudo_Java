package Encapsulamento_e_Heranca.Oficina;
import java.util.ArrayList;

import java.util.Arrays;
public class Componente {
    private String nome;
    private ArrayList<Peca>pecas;
    public Componente(String nome, ArrayList<Peca>pecas){
        this.nome = nome;
        this.pecas = pecas;
    }
    public String getNome(){
        return this.nome;
    }

}
