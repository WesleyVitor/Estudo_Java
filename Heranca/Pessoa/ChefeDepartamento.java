package Heranca.Pessoa;

public class ChefeDepartamento extends Funcionario {
    private String departamento;
    private Calendar dataPromocao;
    private double gratificacao;

    public ChefeDepartamento(String nome, String cpf, Calendar dataNasc,
                             String matricula, Calendar dataAdmissao,
                             double salario, String departamento, Calendar dataPromocao,
                             double gratificacao){
        super(nome, cpf, dataNasc, matricula, dataAdmissao, salario);
        this.departamento = departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;
    }

    public void mostrarChefeDepartamento(){
        System.out.println("Sou um chefe de departamento!");
        System.out.println(this.departamento);
        this.dataPromocao.mostrar_data();
        System.out.println(this.gratificacao);
    }
}
