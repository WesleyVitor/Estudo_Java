package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.String;
public class ListaCompras {
    public static void main(String[] args) {
        HashSet<String>lista_compras = new HashSet<String>();
        ArrayList lista_compras2 = new ArrayList();
        HashMap fruta_preco = new HashMap();
        int[] array = {1,2,3,4,5};
        lista_compras.add("Arroz");
        lista_compras.add("Feijão");
        lista_compras.add("Carne");

        fruta_preco.put("Arroz", 2.30);
        System.out.println(fruta_preco.get("Arroz"));
        /*
        double nome = 2.98;
        int nome1 = (int)nome;
        for(String d:lista_compras){
            System.out.println(d);
        }*/

    }
}
