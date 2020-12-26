package Encapsulamento;

public class Agenda {
  private int dia;
  private int mes;
  private String anotacao;


  void anota(int dia, int mes, String anotacao){
    this.dia = dia;
    this.mes = mes;
    this.anotacao = anotacao;

    validaData();
  }

  private void validaData(){
    if((dia<1 || dia>31) || (mes<1 || mes>12)){
      this.dia = 0;
      this.mes = 0;
      this.anotacao = "Anotação inválida!";
    }
  }

  void mostrarAnotacao(){
    System.out.println("Dia:"+this.dia+"\nMes:"+this.mes+"\nAnotação:"+this.anotacao);
  }
}
