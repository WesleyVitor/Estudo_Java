package Encapsulamento_e_Heranca.Vestuario;

public class Social extends Roupa{
    public void dobrar(){
        super.dobrar();
        System.out.println("Roupa social dobrada");
    }
    public void lavar(){
        System.out.println("Roupa social lavada");
    }
}
