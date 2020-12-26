package Heranca.Pessoa;

public class Aluno extends Pessoa {
    private String matricula;
    public Aluno(String nome, String cpf, Calendar dataNasc, String matricula){
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
    }

    public void mostrarAluno(){
        System.out.println("Sou um aluno!");
        System.out.println(this.matricula);
    }
}
