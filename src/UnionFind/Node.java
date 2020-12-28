/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnionFind;

/**
 * Node class represent the element of each set.
 * It has four instances-
 * 1. ID - each node has a unique id.
 * 2. Value - each node has a value.
 * 3. Rank - each node has a rank. Default is zero. It changes with a higher rank after the merge.
 * 4. Parent - It keeps the information about the parent node. Initially each node will be considered as it's own parent.
 * 
 * @author KD
 */

public class Node {
    private int id;
    private int value;
    private int rank;
    private Node parent;

    /**
     * Initializing all the variables through constructor
     * 
     * @param id - each node has a unique id.
     * @param value - each node has a value.
     */
    public Node(int id, int value) {
        this.id = id;
        this.value = value;
        this.rank = 0; // initally zero
        // intially each node will be considered as it's own parent.
        this.parent = this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

}
