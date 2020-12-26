package Stdin_Stdout;
import java.util.Scanner;
public class ler_informacoes {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite o seu nome:");
    String nome = leitor.nextLine();
    System.out.println("Nome Digitado:"+nome);
    System.out.println("Digite a sua idade,"+nome+":");
    int idade = leitor.nextInt();
    System.out.println("Sua idade é:"+idade);
    System.out.println("Informações:");
    System.out.println("Nome:"+nome);
    System.out.println("Idade:"+idade);
  }
}
