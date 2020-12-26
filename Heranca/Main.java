package Heranca;

import Heranca.Celular.SmartPhone;

public class Main {
    public static void main(String[] args) {
        //Automovel carro = new Automovel();
        //System.out.println(carro.getCapacidade());

        SmartPhone smart = new SmartPhone();
        smart.ligar();

        smart.atender();
    }
}
