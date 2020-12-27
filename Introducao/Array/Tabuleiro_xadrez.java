package Introducao.Array;

public class Tabuleiro_xadrez {
    public static void main(String[] args) {
        String[][] tabuleiro = new String[8][8];
        int cont=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(cont==0){
                    tabuleiro[i][j]="[]";
                    cont=1;
                }else{
                    tabuleiro[i][j]="[X]";
                    cont=0;
                }
            }
            if(cont==0){
                cont=1;
            }else if(cont==1){
                cont=0;
            }
        }

        System.out.println("Mostrar tabuleiro:");
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println();
        }
    }
}
