package Exception.Lacamento_excecao;

public class RoupaException extends Exception{
    public RoupaException(String message){
        super(message);
    }
    @Override
    public String getMessage(){
        return "Erro de roupa";
    }
}
