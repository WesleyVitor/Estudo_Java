package Polimorfismo.CadastroPessoa;

public class Funcionario extends Pessoa{
    private String matricula;
    private double salario;

    public Funcionario(){
        super();
    }
    public Funcionario(String matricula, String nome, String cpf){
        super(nome, cpf);
        this.matricula = matricula;
    }
    public Funcionario(String matricula, double salario, String nome, String cpf){
        super(nome, cpf);
        this.matricula = matricula;
        this.salario = salario;
    }
    public void mostrarDados(){
        System.out.printf("" +
                "Nome:%s\n" +
                "Cpf:%s\n" +
                "Matricula:%s\n" +
                "Salario:%.2f\n\n",super.getNome(), super.getCpf(),
                this.matricula, this.salario
                );
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
