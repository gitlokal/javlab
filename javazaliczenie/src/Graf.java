/*
 * 
 */

/**
 *
 * @author lokal
 */
public class Graf {
    private int size = 0;
    private int[][] tab;
    
    public Graf(int v){
        size = v;
        tab = new int[size][size];
        
    }
    public Graf(int[][] matrix){
        tab = matrix;
    }
    
    /** 
     *in Adjacency matrix(matrix of matrices) all dimension are equal
     *thus we can get size of any row/column by randomly
     *picking any matrix in tab[](see "for" loops)
     */
   public void show(){
       for(int x  :tab[0]){
           for(int y :tab[1])
               System.out.print(tab[x][y]);
           System.out.println();
       }                                       
    }
    
}
