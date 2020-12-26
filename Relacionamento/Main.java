package Relacionamento;

public class Main {
  public static void main(String[] args) {
    System.out.println("SISTEMA COM CARDINALIDADE");

    Carro meuCarro = new Carro();

    Pessoa p1 = new Pessoa();

    


    meuCarro.setCor("Preto");
    meuCarro.setPlaca("MMM-123");
    meuCarro.setNumPortas(4);
    meuCarro.setTipo("Esportivo");

    p1.setNome("Jose");
    p1.setIdade(29);
    p1.setCarro(meuCarro);


    System.out.println();
    p1.ligarCarro();
    p1.setCambioCarro(1);
    p1.acelerarCarro();
    System.out.println(p1.getCarro().getCambio());
    p1.setCambioCarro(2);
    System.out.println(p1.getCarro().getCambio());
  }
}
