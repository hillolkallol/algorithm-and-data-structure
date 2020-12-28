/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnionFind;

/**
 * Union Find stores the collection of disjoint sets.
 * It has two main characteristics-
 * 1. Union - Merge two disjoint set.
 * 2. Find - Find the parent of any nodes.
 * 
 * @author KD
 */
public class UnionFind {
    /**
     * Union two nodes.
     * Steps-
     * 1. Find the root of both of the nodes
     * 2. If both of the nodes belong to the same set, doesn't need to do anything. Return.
     * 3. If root1 has higher rank, that means it's larger than the other set. Merge with this set
     * 4. Otherwise merge with the second set.
     * 
     * @param node1
     * @param node2 
     */
    public void union (Node node1, Node node2) {
        Node root1 = find (node1);
        Node root2 = find (node2);
        
        // both of the nodes belong to the same set. Doesn't need to do anything.
        if (root1 == root2) return;
        
        if (root1.getRank() >= root2.getRank()) {
            root2.setParent(root1);
            root1.setRank(root1.getRank() + 1);
        }
        else {
            root1.setParent(root2);
            root2.setRank(root2.getRank() + 1);
        }
    }
    
    /**
     * Find the root of the node. 
     * Steps-
     *  1. Check if the parent of the node is equal to the node.
     *  2. If yes, this is the root, because only the root node's parent will point to itself.
     *  3. If not, go to it's parent node and perform the step 1 again.
     * 
     * Next do the "Path Compression".
     * Compress the path so that each of the nodes directly point to the root node.
     * It provides amortized constant time complexity.
     * Steps-
     *  1. Check if node is the root
     *  2. If yes, break.
     *  3. Else set the root node as it parent node and go to it's parent node and perform step 1.
     * 
     * @param node - find the root of the given node in the parameter.
     * @return  return the root of the given node
     */
    public Node find (Node node) {
        Node root = node;
        // Find the root of the node. 
        while (root != root.getParent()) {
            root = root.getParent();
        }
        
        /**
         * Path Compression.
         * Compress the path so that each of the nodes directly point to the root node.
         * It provides amortized constant time complexity.
         */
        while (node != root) {
            Node nextNode = node.getParent();
            node.setParent(root);
            node = nextNode;
        }
        
        return root;
    }
}
