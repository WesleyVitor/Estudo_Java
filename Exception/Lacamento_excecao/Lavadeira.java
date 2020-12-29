package Exception.Lacamento_excecao;

public class Lavadeira {
    public void lavar() throws RoupaException{
        throw new CalcaException("Erro");
    }

    public static void main(String[] args) {
        Lavadeira l = new Lavadeira();
        try{
            l.lavar();
        }catch (CalcaException ce){
            System.out.println(ce.getMessage());
        }catch (CamisaException cae){
            System.out.println();
        }catch (RoupaException e) {
            e.printStackTrace();
        } finally {
            System.out.println();
        }
    }
}
