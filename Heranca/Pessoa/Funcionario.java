package Heranca.Pessoa;

public class Funcionario extends Pessoa {
    private String matricula;
    private Calendar dataAdmissao;
    private double salario;

    public Funcionario(String nome, String cpf, Calendar dataNasc,
                       String matricula, Calendar dataAdmissao,
                       double salario){
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public void mostrarFuncionario(){
        System.out.println("Sou funcionario!");
        System.out.println(this.matricula);
        this.dataAdmissao.mostrar_data();
        System.out.println(this.salario);
    }
}
