package Exception;

public class PrimeiraException {
    public void lancarExcecao() throws LanceException{
        if(true){
            throw new LanceException();
        }

    }

    public static void main(String[] args) {
        try{
            PrimeiraException pe = new PrimeiraException();
            pe.lancarExcecao();
        }catch (LanceException le){
            System.out.println("Foi lançada uma exceção!");
        }
    }
}
