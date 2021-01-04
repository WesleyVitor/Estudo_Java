package Encapsulamento_e_Heranca.Vestuario;

public class Esporte extends Roupa{
    public void dobrar(){
        super.dobrar();
        System.out.println("Roupa esportiva dobrada");
    }
    public void lavar(){
        super.lavar();
        System.out.println("Roupa esportiva lavada");
    }
}
