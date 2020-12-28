/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnionFind;

/**
 *
 * @author KD
 */
public class MainUI {
    public static void main(String[] args) {
        Node node1 = new Node(1, 1);
        Node node2 = new Node(2, 2);
        Node node3 = new Node(3, 3);
        Node node4 = new Node(4, 4);
        Node node5 = new Node(5, 5);
        Node node6 = new Node(6, 6);
        Node node7 = new Node(7, 7);
        Node node8 = new Node(8, 8);
        Node node9 = new Node(9, 9);
        
        UnionFind unionFind = new UnionFind();
        
        unionFind.union(node1, node2);
        unionFind.union(node2, node3);
        unionFind.union(node3, node4);
        unionFind.union(node4, node5);
        
        unionFind.union(node6, node7);
        unionFind.union(node8, node9);
        unionFind.union(node7, node8);
        unionFind.union(node5, node6);
        
        System.out.println(unionFind.find(node9).getParent().getId());
        System.out.println(unionFind.find(node9).getRank());
    }
}
