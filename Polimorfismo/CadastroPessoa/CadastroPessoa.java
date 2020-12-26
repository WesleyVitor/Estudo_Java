package Polimorfismo.CadastroPessoa;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {

    private List<Pessoa>pessoas = new ArrayList<Pessoa>();
    private int quantAtual;

    public void cadastrarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void mostrarCadastro(){
        for(Pessoa pessoa:pessoas){
            pessoa.mostrarDados();
        }
    }

    public static void main(String[] args) {
        CadastroPessoa cp = new CadastroPessoa();
        Cliente cliente = new Cliente(12, "Jose", "123.345.678-91");
        Gerente gerente = new Gerente(20, "13030", 10345,"Maria", "987.654.321-10");
        cp.cadastrarPessoa(cliente);
        cp.cadastrarPessoa(gerente);
        cp.mostrarCadastro();

    }
}
