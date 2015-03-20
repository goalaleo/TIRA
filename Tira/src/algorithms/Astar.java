
package algorithms;
import domain.*;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.PriorityQueue;


public class Astar {
    
    private HashMap<String,Node> nodeMap;
    private PriorityQueue<Node> openList;
    private ArrayList<Node> closedList;
    
    public Astar(HashMap<String,Node> nodeMap){
    this.nodeMap = nodeMap;
    openList = new PriorityQueue<>();
    closedList = new ArrayList<>();
}
    
    public void run(){
//        add the start node to openList

//loop
// current = node in openList with the lowest f_score
// remove current from openList
// add current to closedList
//
// if current is the target node -> path found
//   return
//
//foreach neighbour of the current node
// if neighbour is not traversable or neighbour is in closedList
//   skip to the next neighbour
//
// if new path to neighbour is sorter OR neighbour is not in openList
//  set f_score of neighbour
//  set parent of neighbour to current
//  if neighbour is not in opneList
//    add neighbour to openList
                      
       
    }
}
