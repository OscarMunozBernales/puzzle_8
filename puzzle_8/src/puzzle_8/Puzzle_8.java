/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle_8;

//import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Oscar Muñoz Bernales
 */
public class Puzzle_8 {

    /**
     * @param args the command line arguments
     */
    public static void GenerarMatriz(int [][] M,int n){
        int init = 1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j == 2 && i == 2){
                    M[i][j] = 0;
                }
                else{
                    M[i][j] = init;
                }
                init++;
            }
        }
    }
    public static void GenerarMatrizAleatoria(int [][] M,int n){
        Random rnd = new Random();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                M[i][j] = rnd.nextInt()*9+0;
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] M1 = new int[3][3];
        int [][] M2 = new int[3][3];
        //GenerarMatriz(M1,3);
        //puzzle tabla_final = new puzzle(M1,3);
        GenerarMatrizAleatoria(M2,3);
        puzzle tabla_inicial = new puzzle(M2,3);
        System.out.print(tabla_inicial.toString());
        
    }
    
}
