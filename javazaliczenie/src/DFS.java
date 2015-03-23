/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lokal
 */
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class DFS extends PrzegladanieGrafu {
    private static Graf graph;
    private boolean[] visited ; 
    LinkedList<LinkedList<Integer>> adjLists = new LinkedList<LinkedList<Integer>>();
    public static LinkedList listaV = new LinkedList();
   
    public DFS( Graf graph){
        this.graph = graph;
        
         for(int i = 0; i < graph.getSize(); i++){
              adjLists.add(new LinkedList<Integer>());            
         }
       adjLists=graph.getAdjList();
       visited = new boolean[graph.getSize()];
     } 
     
    
    
    
    private static void dfs_rec(LinkedList<LinkedList<Integer>> adjLists, boolean[] visited, int v){
        visited[v] = true;
        listaV.add(v);
        for(int w : adjLists.get(v)){
           
                 if(!visited[w]){
                     
                    dfs_rec(adjLists, visited, w);
            }
        }
    }
    
    public void pobierz(int vStart){
        dfs_rec(adjLists, visited, vStart);
          for(int i=0; i < listaV.size(); i++)
              System.out.println(listaV.get(i));
    };
    
    public void wstaw(int v, Stack stos){
            
    };
}
