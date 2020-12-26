package Arquivos;

import java.io.*;

public class Main {
    public static void main(String[] args){
        try{
            File file = new File("/home/wesley/Documentos/Java/POO/Arquivos/src/teste.txt");

            BufferedReader br = new BufferedReader(
                    new FileReader("/home/wesley/Documentos/Java/POO/Arquivos/src/teste.txt")
            );
            System.out.println(file.exists());

            if(file.exists()){
                System.out.println(file);
            }else{
                System.out.println("Arquivo não existe!");
            }


        }catch (Exception ex){
            return;
        }
        /*
        if(file.isFile()){
            String s;
            while((s = br.readLine())!=null){
                System.out.println(s);
            }
            br.close();
        }

         */

    }
}
