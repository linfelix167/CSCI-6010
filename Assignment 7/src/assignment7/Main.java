package assignment7;


public class Main {
    public static void main(String[] args){

        BinaryTreeNode bTree = BinaryTreeNode.creatTree();

        System.out.println("This is pre-order DFS");
        bTree.preOrder(bTree);

        System.out.println();

        // Using recursion to implement BFS level order is more complex and slow,
        // Since time complexity is O(n^2), if using queue is O(n).
        // So, the best way to do BFS is queue.
        System.out.println("This is level-order BFS");
        bTree.levelOrder(bTree);
    }
}
