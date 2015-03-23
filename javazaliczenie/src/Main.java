/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lokal
 */

public class Main {
    
    public static void main(String[] args){
            
        
        int[][] macierz = new int[][]{ {0, 1, 1, 0, 1, 0},
                                     {1, 0, 1, 1, 0, 1},
                                     {1, 1, 0, 1, 1, 0},
                                     {0, 1, 1, 0, 0, 0},
                                     {1, 0, 1, 0, 0, 0},
                                     {0, 1, 0, 0, 0, 0} 
                                    };
        
        int[][] macierz2 = new int[][]{ {0, 0, 0, 0, 0, 1},
                                     {0, 0, 0, 0, 1, 0},
                                     {0, 0, 0, 0, 0, 1},
                                     {0, 0, 0, 0, 1, 1},
                                     {0, 1, 0, 1, 0, 0},
                                     {1, 0, 1, 1, 0, 0} 
                                    };
        
       Graf graf = new Graf(macierz2);
//     System.out.println(graf.getEdgeSize());
//     graf.show();
       graf.showLL();
//       System.out.println(graf.getSize());
       DFS dfs = new DFS( graf);
       dfs.pobierz(3);
    }
    
}
