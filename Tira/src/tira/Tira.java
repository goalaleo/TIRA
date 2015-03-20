package tira;

import domain.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Tira {

    public static void main(String[] args) {
        
        HashMap<String,Node> nodeMap = generateNodeMap(10);
        
        System.out.println(nodeMap.values());

    }

    public static HashMap<String, Node> generateNodeMap(int sideLenght) {
        int x = 1;
        int y = 1;
        HashMap<String, Node> nodeMap = new HashMap<>();

        while (y <= sideLenght) {
            while (x <= sideLenght) {
                nodeMap.put("" + x + "," + y, new Node(x, y));
                x++;
            }
            x = 1;
            y++;
        }
        
//        used to check if there are any duplicates:
//        ArrayList<String> keys= new ArrayList<>(nodeMap.keySet());
//        System.out.println(keys.size());
//        Iterator<String> iter = keys.iterator();
//        while (iter.hasNext()){
//            String str = iter.next();
//            System.out.println(str);
//            iter.remove();
//            if (keys.contains(str)){
//                System.out.println("Duplicate!");
//            }
//        }
        
        return nodeMap;
    }
}
