package Encapsulamento_e_Heranca.Familia;

public class Mae {
    private int idade;
    private String sobrenomeMaterno;
    private String sobrenomePaterno;
    protected String nome;

    public Mae(String nome, String sobrenomeMaterno, String sobrenomePaterno){
        this.nome = nome;
        this.sobrenomeMaterno = sobrenomeMaterno;
        this.sobrenomePaterno = sobrenomePaterno;
    }

    public String getSobrenomeMaterno(){
        return this.sobrenomeMaterno;
    }

    public void setSobrenomeMaterno(String sobrenomeMaterno){
        this.sobrenomeMaterno = sobrenomeMaterno;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSobrenomePaterno() {
        return sobrenomePaterno;
    }

    public void setSobrenomePaterno(String sobrenomePaterno) {
        this.sobrenomePaterno = sobrenomePaterno;
    }
}
