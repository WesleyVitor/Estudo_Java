package Introducao.Array;

public class calendario {
    public static void main(String[] args) {
        int[][] calendario = new int[4][8];
        int dia = 0;
        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
                dia = dia+1;
                calendario[i][j]= dia;
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
                System.out.printf("%5d",calendario[i][j]);
            }
            System.out.println();
        }
    }
}
