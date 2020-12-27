package Collection.Animais;

import java.util.ArrayList;

public class Animal {
    private String nome;

    public Animal(String nome){
        super();
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        ArrayList<Animal>lista_animal = new ArrayList<Animal>();
        lista_animal.add(new Animal("Galinha"));
        lista_animal.add(new Animal("Cachorro"));
        for(Animal animal: lista_animal){
            System.out.println(animal.getNome());
        }
        System.out.println();
        System.out.println();
        ArrayList without_generics = new ArrayList();
        without_generics.add("Joao");
        without_generics.add(new Animal("Gato"));
        without_generics.add(new Animal("Guepardo"));

        String nome1 = (String) without_generics.get(1);
        System.out.println(nome1);

    }
}
