package Heranca.Pessoa;

public class TestarTudo {
    public static void main(String[] args) {
        System.out.println("Testando tudo");
        //Calendar nascimento = new Calendar(15, 12, 1976);
        //Pessoa pessoa = new Pessoa("Jose", "123", nascimento);
        //pessoa.mostrarPessoa();

        System.out.println();
        Calendar admissao = new Calendar(23, 12, 2020);
        Calendar nascimento_funcionario = new Calendar(10, 6,1980);
        Funcionario funcionario = new Funcionario("Caio", "1234",nascimento_funcionario,
                "1010", admissao, 10000 );
        funcionario.mostrarFuncionario();
    }
}
