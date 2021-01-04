package Encapsulamento_e_Heranca.Familia;

public class Filha extends Mae{
    public String apelido;
    protected String esportePreferido;
    public Filha(String nome, String sobrenomeMaterno, String sobrenomePaterno,
                 String apelido, String esportePreferido){
        super(nome, sobrenomeMaterno, sobrenomePaterno);
        this.apelido = apelido;
        this.esportePreferido = esportePreferido;
        System.out.println("Nome:"+super.nome);
        System.out.println("Sobrenome paterno:"+super.getSobrenomePaterno());
    }
}
