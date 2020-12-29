package Exception.Lacamento_excecao;


import javax.security.auth.DestroyFailedException;

public class Atividade1 {
    public void lanca_destroy_failed_exception(boolean vl) throws DestroyFailedException{
        if(vl){
            throw new DestroyFailedException();
        }else{
            System.out.println("Método executado com sucesso");
        }


    }

    public static void main(String[] args) {
        Atividade1 a1 = new Atividade1();
        try{
            a1.lanca_destroy_failed_exception(true);
        }catch(DestroyFailedException dfe){
            System.out.println("Método falhou!");
        }finally {
            System.out.println("Cláusula finally");
        }

    }
}
