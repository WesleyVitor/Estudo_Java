package Exception;

public class ConverteString {
    public int conversao(String string) throws NumberFormatException{
       int valor;
        try {
            valor = Integer.parseInt(string);
       }catch(NumberFormatException nfe){
           throw new NumberFormatException();
       }

        return valor;
    }

    public static void main(String[] args) {
        ConverteString cs = new ConverteString();
        try {
            cs.conversao("oi");
        }catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
}
