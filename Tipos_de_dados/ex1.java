/*

Construa um programa que utilize uma variável inteira global e atribua o valor 20 a ela. Declare outras 4 variáveis inteiras locais ao programa principal e atribua os valores 30, 40,50, 60 a elas. Declare 4 variáveis caracteres e atribua a elas as letras g,a,t,o. O programa deverá imprimir, usando todas as variáveis declaradas: as variáveis inteiras que contêm os números: 20,30,40,50,60 e as variáveis caracteres que contêm as letras citadas acima. */
package Tipos_de_dados;

public class ex1 {
  public static int vGlobal = 20;
  public static void main(String[] args) {

    
    //Variáveis inteiras
    int i1 = 30;
    int i2 = 40;
    int i3 = 50;
    int i4 = 60;
    System.out.println("V1:"+i1);
    System.out.println(i2);
    System.out.println(i3);
    System.out.println(i4);
    //Variaveis Caracteres
    char c1 = 'g';
    char c2 = 'a';
    char c3 = 't';
    char c4 = 'o';
    System.out.println();
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);

    

  }
}
