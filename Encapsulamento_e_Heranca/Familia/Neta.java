package Encapsulamento_e_Heranca.Familia;

public class Neta extends Filha{
    public Neta(String nome, String sobrenomeMaterno, String sobrenomePaterno,
                String apelido, String esportePreferido){
        super(nome, sobrenomeMaterno, sobrenomePaterno,
                apelido, esportePreferido);
    }

    public void mostrarApelido(){
        System.out.println("Apelido:"+super.apelido);
    }

    public static void main(String[] args) {
        Neta n = new Neta("Joyce","Silva",
                "Gonzaga", "jojo", "Vôlei");
        n.mostrarApelido();
    }
}
