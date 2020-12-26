package Stdin_Stdout;
import java.util.Scanner;
public class ler_frases {
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    System.out.println("---Frases---");
    System.out.print("Digite frase 1:");
    String frase1 = leitor.nextLine();
    System.out.print("Digite frase 2:");
    String frase2 = leitor.nextLine();
    System.out.print("Digite frase 3:");
    String frase3 = leitor.nextLine();
    System.out.println();
    System.out.println("Mostrar Informações:");
    System.out.println(frase3);
    System.out.println(frase2);
    System.out.println(frase1);
  }
}
