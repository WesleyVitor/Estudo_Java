package Static;

public class RelogioPonto {
    private static int hora;
    private static int minuto;
    private static int segundo;

    private int id;
    private String filial;

    public RelogioPonto(){
        super();
    }
    public RelogioPonto(int id, String filial){
        super();
        this.id = id;
        this.filial = filial;
    }
    public static int getHora(){
        return RelogioPonto.hora;
    }

    public static void setHora(int hora) {
        RelogioPonto.hora = hora;
    }

    public static int getMinuto(){
        return RelogioPonto.minuto;
    }

    public static void setMinuto(int minuto){
        RelogioPonto.minuto = minuto;
    }

    public static int getSegundo(){
        return RelogioPonto.segundo;
    }

    public static void setSegundo(int segundo){
        RelogioPonto.segundo = segundo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public static void main(String[]args){
        RelogioPonto filialCentro = new RelogioPonto(1, "Centro");
        RelogioPonto filialCaico = new RelogioPonto(2, "Caicó");
        RelogioPonto filialBrasilia = new RelogioPonto(3, "Brasilia");

        RelogioPonto.setHora(15);
        RelogioPonto.setMinuto(52);
        RelogioPonto.setSegundo(20);


        System.out.println("" +
                "Hora:"+filialCentro.getHora()+
                "\nMinuto:"+filialCentro.getMinuto()+
                "\nSegundo:"+filialCentro.getSegundo());
        System.out.println();
        System.out.println("" +
                "Hora:"+filialCaico.getHora()+
                "\nMinuto:"+filialCaico.getMinuto()+
                "\nSegundo:"+filialCaico.getSegundo());
        System.out.println();
        System.out.println("" +
                "Hora:"+filialBrasilia.getHora()+
                "\nMinuto:"+filialBrasilia.getMinuto()+
                "\nSegundo:"+filialBrasilia.getSegundo());
    }
}
