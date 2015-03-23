/*
 * 
 */

/**
 *
 * @author lokal
 */
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Arrays;
public class Graf {
    private int size = 0;
    private int egdeSize =0;
    private int[][] tab;
    private LinkedList<LinkedList<Integer>> adjLists = new LinkedList<LinkedList<Integer>>();
//    public Graf(int v){
//        size = v;
//        tab = new int[size][size];
//        
//    }
    
    
    public Graf(int[][] matrix){
         tab=Arrays.copyOf(matrix, matrix.length);
        for(int i = 0; i < matrix[0].length; i++){
              adjLists.add(new LinkedList<Integer>());            
        }
         
        for(int x=0; x < tab[0].length; x++){
           for(int y=x+1; y < tab[0].length; y++){
               if(tab[x][y] == 1){
                   egdeSize++;
                
               }
           }              
        }
        
        for(int x=0; x < tab[0].length; x++){
           for(int y=0; y < tab[0].length; y++)
                    if(tab[x][y] == 1){
                         adjLists.get(y).add(x);
                    }
        }
        size=matrix[0].length;
       
           
    }
    

   public void show(){
       for(int x=0; x < tab[0].length; x++){
           for(int y=0; y < tab[x].length; y++)
               System.out.print(tab[x][y]+ " ");
           System.out.println();
       }                                       
    }
   
   public void showLL(){
       for(int x=0; x < adjLists.size(); x++){
            System.out.println(adjLists.get(x));
                                 }
   }
       
   
   
    public void getAdjList(){
        
    }
    public int getSize(){
        return size;
    }
    
    public int getEdgeSize(){
        return egdeSize;
    }
}
