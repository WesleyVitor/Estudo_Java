package Introducao;

class Pessoa {
  String nome;
  String telefone;
  String tipo_sanguineo;
  int idade;

  String getNome(){
    return this.nome;
  }
  void setNome(String nome){
    this.nome = nome;
  }

  String getTelefone(){
    return this.telefone;
  }
  void setTelefone(String telefone){
    this.telefone = telefone;
  }

  String getTipoSanguineo(){
    return this.tipo_sanguineo;
  }
  void setTipoSanguineo(String tipo_sanguineo){
    this.tipo_sanguineo = tipo_sanguineo;
  }

  int getIdade() {
    return idade;
  }
  void setIdade(int idade) {
    this.idade = idade;
  }
   



}
