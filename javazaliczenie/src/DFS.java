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
    private int vStart = 0;
    private static Graf graph;
    private boolean[] visited ; 
//  ArrayList<ArrayList<Integer>> adjLists = new ArrayList<ArrayList<Integer>>();
    LinkedList<LinkedList<Integer>> adjLists = new LinkedList<LinkedList<Integer>>();
    public static LinkedList listaV = new LinkedList();
//    ListIterator<int> listIterator = adjLists.listIterator();
   
  
    public DFS(int start, Graf graph){
        vStart = start;
        this.graph = graph;
        
         for(int i = 0; i < graph.getSize(); i++){
//            adjLists.add(new ArrayList<Integer>());
              adjLists.add(new LinkedList<Integer>());            
         }
       adjLists=graph.getAdjList();
       visited = new boolean[graph.getSize()];
     } 
     
//    private static void dfs_rec(ArrayList<ArrayList<Integer>> adjLists, boolean[] visited, int v){
//        visited[v] = true;
//        listaV.add(v);
//        for(int w : adjLists.get(v)){
//            if(!visited[w]){
//                dfs_rec(adjLists, visited, w);
//            }
//        }
//    }
    
    
    private static void dfs_rec(LinkedList<LinkedList<Integer>> adjLists, boolean[] visited, int v){
        visited[v] = true;
        listaV.add(v);
        for(int w : adjLists.get(v)){
            for(int i=0; i < adjLists.get(w).size();i++)
                 if(!visited[adjLists.get(w).get(i)]){
                     
                    dfs_rec(adjLists, visited, adjLists.get(w).get(i));
            }
        }
    }
    
    public void pobierz(){
        dfs_rec(adjLists, visited, vStart);
          for(int i=0; i < listaV.size(); i++)
              System.out.println(listaV.get(i));
    };
    
    public void wstaw(int v, Stack stos){
            
    };
}
