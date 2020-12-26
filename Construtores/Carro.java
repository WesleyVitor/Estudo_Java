package Construtores;

class Carro {
  String tipo;
  String cor = "Branco";
  String placa;
  int numPortas;

  public Carro(){

  }
  public Carro(String placa){
    this.placa = placa;
  }


  void setTipo(String tipo){
    this.tipo = tipo;
  }

  String getTipo(){
    return this.tipo;
  }

  void setCor(String cor){
    this.cor = cor;
  }

  String getCor(){
    return this.cor;
  }

  void setPlaca(String placa){
    this.placa = placa;
  }

  String getPlaca(){
    return this.placa;
  }

  void setNumPortas(int numPortas){
    this.numPortas = numPortas;
  }

  int getNumPortas(){
    return this.numPortas;
  }
}
