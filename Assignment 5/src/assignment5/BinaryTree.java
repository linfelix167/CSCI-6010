package assignment5;

public class BinaryTree {

   public static void main(String[] args){

       BinaryTreeNode bTree = BinaryTreeNode.createTree();

       System.out.println("This is pre-order DFS");
       bTree.preorder(bTree);

       System.out.println();

       System.out.println("This is level-order BFS");
       bTree.bFS(bTree);
   }

}
