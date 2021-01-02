package Abstract;

public class Principal {
    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        System.out.println("Quadrado");
        q.desenha();
        System.out.println();
        Triangulo t = new Triangulo();
        System.out.println("Triângulo");
        t.desenha();
    }
}
