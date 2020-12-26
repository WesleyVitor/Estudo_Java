package Polimorfismo.CadastroPessoa;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(){
        super();
    }

    public Pessoa(String nome){
        super();
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf){
        super();
        this.nome = nome;
        this.cpf = cpf;
    }
    public void mostrarDados(){
        System.out.printf("Nome:%s\nCpf:%s\n\n",nome, cpf);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
