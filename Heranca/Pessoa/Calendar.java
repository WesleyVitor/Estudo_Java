package Heranca.Pessoa;

public class Calendar {
    private int dia;
    private int mes;
    private int ano;

    public Calendar(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void mostrar_data(){
        System.out.printf("%d/%d/%d",dia, mes, ano);
        System.out.println();
    }
}
