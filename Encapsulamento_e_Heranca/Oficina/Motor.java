package Encapsulamento_e_Heranca.Oficina;
import java.util.ArrayList;

import java.util.Arrays;
public class Motor extends Componente{
    private ArrayList<Componente>componentes;
    public Motor(ArrayList<Componente>componentes, String nome, ArrayList<Peca>pecas){
        super(nome, pecas);
        this.componentes = componentes;

    }

    public static void main(String[] args) {
        Peca p1 = new Peca("Broca", 1.00,"aço");
        Peca p2 = new Peca("agulha", 0.56,"aço");
        Peca p3 = new Peca("chave de fenda", 1.78,"ferro");

        ArrayList<Peca>pecas1 = new ArrayList<Peca>();
        pecas1.add(p1);
        pecas1.add(p2);

        Componente componente1 = new Componente("Fio", pecas1);

        ArrayList<Peca>pecas2 = new ArrayList<Peca>();
        pecas2.add(p3);

        Componente componente2 = new Componente("Fiosinho", pecas2);
        ArrayList pecas_motor = new ArrayList();
        pecas_motor.add(pecas1);
        pecas_motor.add(pecas2);

        ArrayList<Componente>componentes_motor = new ArrayList<Componente>();
        componentes_motor.add(componente1);
        componentes_motor.add(componente2);

        Motor motor = new Motor(componentes_motor, "Motor", pecas_motor);
        System.out.println(motor.getNome());


    }
}
