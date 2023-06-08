/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    //Creating a map to store the key - values pair of nodes from the original graph and the nodes we are visiting 
    Map <Integer, Node> mapVisited = new HashMap<>();

    public Node cloneGraph(Node node) {
        // return the cloned graph, using the auxiliary function
        return cloneGraph(node, mapVisited);
    }

    // Auxiliary function
    public Node cloneGraph(Node node, Map<Integer, Node> mapVisited) {
        // cover the case of an empty adjacent list passed as input
        if (node == null)
            return null;

        // Check if the node has been visited and if yes, return it.
        if (mapVisited.containsKey(node.val))
            return mapVisited.get(node.val);

        // Create a node with the same value of the node we are at (clone the node)
        Node clone = new Node(node.val, new ArrayList<Node>());

        // Add the new cloned node to our map (value, node cloned)
        mapVisited.put(node.val, clone);

        // check the neighbor of the node with a for loop using the neighbor list
        for (Node neighbor : node.neighbors) {

            // add each neighbor of the note to the list of our clone
            clone.neighbors.add(cloneGraph(neighbor, mapVisited));

        }
        // Returning copy of the given node
        return clone;
    }
}