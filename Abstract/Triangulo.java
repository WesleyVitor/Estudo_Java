package Abstract;

public class Triangulo extends FiguraAbstrata{
    @Override
    public void desenha(){
        System.out.println("  -   ");
        System.out.println(" / \\ ");
        System.out.println("/   \\");
        System.out.println("------");
    }
}
