package Heranca.Automovel;

public class Automovel extends Terrestre {
    private String cor;
    private int num_portas;
    private int placa;

    public Automovel(){
        super.setCapacidade(4);
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNum_portas() {
        return num_portas;
    }

    public void setNum_portas(int num_portas) {
        this.num_portas = num_portas;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
}
