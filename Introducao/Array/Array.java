package Introducao.Array;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        String[] ferramentas = new String[10];
        Scanner leitor = new Scanner(System.in);
        System.out.println("Pegando ferramentas:");
        for(int i=0;i<ferramentas.length;i++){
            System.out.println("Digite o nome da ferramenta");
            String nome_ferramenta = leitor.nextLine();
            ferramentas[i] = nome_ferramenta;
        }

        System.out.println("Mostrando ferramentas:");
        for(int j=0;j<ferramentas.length;j++){
            System.out.println("Ferramenta "+ (j+1) +":"+ferramentas[j]);
        }

    }
}
