package Polimorfismo.CadastroPessoa;

public class Gerente extends Funcionario{
    private int area;

    public Gerente(){
        super();
    }
    public Gerente(int area, String matricula, double salario, String nome, String cpf){
        super(matricula, salario, nome, cpf);
        this.area = area;
    }

    public void mostrarDados(){
        System.out.printf("" +
                        "Nome:%s\n" +
                        "Cpf:%s\n" +
                        "Matricula:%s\n" +
                        "Salario:%.2f\n" +
                        "Área:%d\n\n",super.getNome(), super.getCpf(),
                super.getMatricula(), super.getSalario(),this.area
        );
    }
}
