package Stdin_Stdout;
import java.util.Scanner;
public class mediaAritmetica {
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    System.out.println("--Media Anual--");
    System.out.println("Média do 1° Bimestre:");
    double nota1 = leitor.nextDouble();
    System.out.println("Média do 2° Bimestre:");
    double nota2 = leitor.nextDouble();
    System.out.println("Média do 3° Bimestre:");
    double nota3 = leitor.nextDouble();
    System.out.println("Média do 4° Bimestre:");
    double nota4 = leitor.nextDouble();

    double media = (nota1+nota2+nota3+nota4)/4;
    System.out.println("Resultado:"+media);
  }
}
