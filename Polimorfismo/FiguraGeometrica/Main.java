package Polimorfismo.FiguraGeometrica;

public class Main {
    private FiguraGeometrica fg;

    public Main(FiguraGeometrica fg){
        this.fg = fg;
    }
    public void desenha(){
        fg.desenha();
    }

    public static void main(String[] args) {
        FiguraGeometrica fg = new FiguraGeometrica();
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        FiguraEquilatero fe = new FiguraEquilatero();
        Quadrado quadrado = new Quadrado();
        Main principal = new Main(circulo);

        principal.desenha();


    }




}
