package assignment6;

public class Main {

    public static void main(String[] args){

        BinaryTreeNode bTree = BinaryTreeNode.createTree();

        System.out.println("This is level-order BFS");
        bTree.bFS(bTree);
        
        System.out.println();
        
        System.out.println("This is pre-order DFS");
        bTree.dFS(bTree);
    }
}
