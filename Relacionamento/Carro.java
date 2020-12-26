package Relacionamento;

class Carro {
  private String tipo;
  private String cor = "Branco";
  private String placa;
  private int numPortas;
  private Pessoa dono;
  private int cambio;

  public void setCambio(int cambio) {
    this.cambio = cambio;
  }
  public int getCambio() {
    return cambio;
  }

  public void setDono(Pessoa dono) {
    this.dono = dono;
  }
  public Pessoa getDono() {
    return dono;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public String getTipo(){
    return this.tipo;
  }

  public void setCor(String cor){
    this.cor = cor;
  }

  public String getCor(){
    return this.cor;
  }

  public void setPlaca(String placa){
    this.placa = placa;
  }

  public String getPlaca(){
    return this.placa;
  }

  public void setNumPortas(int numPortas){
    this.numPortas = numPortas;
  }

  public int getNumPortas(){
    return this.numPortas;
  }

  public void ligar(){
    System.out.println("Carro ligado!");
  }
  public void desligar(){
    System.out.println("Carro desligado!");
  }
  public void acelerar(){
    System.out.println("Carro acelerando!");
  }
  public void frear(){
    System.out.println("Carro freando!");
  }
}

