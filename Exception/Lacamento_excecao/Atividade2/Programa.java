package Exception.Lacamento_excecao.Atividade2;

import java.util.Arrays;
import java.util.List;
public class Programa {
    public boolean validarLetrasAlfabeto(String string) throws ExcecaoAlfabeto{
        String[] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
                "o","p","q","r","s","t","u","v","w","x","y","z"};
        List alfabeto_collection = Arrays.asList(letras);
        boolean esta_contido = false;
        String[] letras_string = string.split("");

        for(String letra_string:letras_string){
            esta_contido = alfabeto_collection.contains(letra_string);
            if(!esta_contido){
                throw new ExcecaoAlfabeto();
            }
        }
        return esta_contido;
    }

    public boolean validarStringIsNumero(String string) throws ExcecaoNumeros{
        boolean isDigite = true;
        String[] letras_string = string.split("");

        for(String letra:letras_string){
            Character letrinha = letra.charAt(0);
            if(!Character.isDigit(letrinha)){
                throw new ExcecaoNumeros();
            }
        }
        return isDigite;
    }
    public void chama_metodo() throws ExcecaoAlfabeto{
        Programa programa = new Programa();
        programa.validarLetrasAlfabeto("bruno");
    }

    public static void main(String[] args) {
        Programa p = new Programa();
        try {
            if(p.validarLetrasAlfabeto("wesley")){
                System.out.println("Tá no alfabeto!");
            }
        }catch (ExcecaoAlfabeto ea){
            System.out.println("Deu exceção alfabeto");
        }
        try {
            if( p.validarStringIsNumero("123")){
                System.out.println("É digito!");
            }


        }catch (ExcecaoAlfabeto ea){
            System.out.println("Deu exceção alfabeto");
        }

    }
}
