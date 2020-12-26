package Polimorfismo.CadastroPessoa;

public class Cliente extends Pessoa{
    private int codigo;

    public Cliente(){
        super();
    }
    public Cliente(int codigo, String nome, String cpf){
        super(nome, cpf);
        this.codigo = codigo;
    }
    public void mostrarDados(){
        System.out.printf("Nome:%s\n" +
                "Cpf:%s\n" +
                "Código:%d\n\n",super.getNome(), super.getCpf(),this.codigo);
    }

}
