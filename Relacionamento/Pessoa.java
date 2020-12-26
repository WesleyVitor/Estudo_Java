package Relacionamento;

public class Pessoa {
  private String nome;
  private int idade;
  private Carro carro;

  public void ligarCarro(){
    carro.ligar();
  }

  public void desligarCarro(){
    carro.desligar();
  }

  public void acelerarCarro(){
    carro.acelerar();
  }

  public void frearCarro(){
    carro.frear();
  }

  public void setCambioCarro(int marcha){
    carro.setCambio(marcha);
  }

  public void setCarro(Carro carro) {
    this.carro = carro;
  }

  public Carro getCarro() {
    return carro;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return nome;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
  public int getIdade() {
    return idade;
  }
}
