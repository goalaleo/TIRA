
package domain;


public class Node implements Comparable<Node>{
    
    private int h_score;
    private int g_score;
    private int f_score;
    private int weight;
    private Node parent;
    private boolean traverseable = true;
    private final int x;
    private final int y;
    
    public Node(int x, int y){
        weight = 1;
        this.x = x;
        this.y = y;
    }
    
    public Node(int x, int y, int weight){
        this.weight = weight;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getH_score() {
        return h_score;
    }

    public int getG_score() {
        return g_score;
    }

    public int getF_score() {
        return f_score;
    }
            

    @Override
    public int compareTo(Node o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
