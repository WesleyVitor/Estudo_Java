package Encapsulamento;

public class Main {
  public static void main(String[] args) {
    Agenda agenda1 = new Agenda();
    Agenda agenda2 = new Agenda();

    agenda1.anota(25, 12, "Feliz Natal");
    agenda2.anota(10, 15, "Feliz páscoa");

    agenda1.mostrarAnotacao();
    System.out.println();
    agenda2.mostrarAnotacao();

    
  }
}
