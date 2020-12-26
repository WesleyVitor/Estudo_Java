package Heranca.Pessoa;

public class Pessoa extends Object {
    private String nome;
    private String cpf;
    private Calendar dataNasc;

    public Pessoa(String nome, String cpf, Calendar dataNasc){
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public void mostrarPessoa(){
        System.out.println("Sou uma Pessoa!");
        System.out.println(this.nome);
        System.out.println(this.cpf);
        this.dataNasc.mostrar_data();
    }
}
