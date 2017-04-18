package assignment6;

import java.util.*;

public class BinaryTreeNode<T> {

    public T data;
    public BinaryTreeNode<T> leftChild;
    public BinaryTreeNode<T> rightChild;

    public BinaryTreeNode(T data){

        this.data = data;
    }

    /**
     * Create a binary tree
     * @return
     */
    public static BinaryTreeNode createTree(){

        BinaryTreeNode n1 = new BinaryTreeNode(8);
        BinaryTreeNode n2 = new BinaryTreeNode(5);
        BinaryTreeNode n3 = new BinaryTreeNode(4);
        BinaryTreeNode n4 = new BinaryTreeNode(9);
        BinaryTreeNode n5 = new BinaryTreeNode(7);
        BinaryTreeNode n6 = new BinaryTreeNode(11);
        BinaryTreeNode n7 = new BinaryTreeNode(1);
        BinaryTreeNode n8 = new BinaryTreeNode(12);
        BinaryTreeNode n9 = new BinaryTreeNode(3);
        BinaryTreeNode n10 = new BinaryTreeNode(2);

        n1.leftChild = n2;
        n1.rightChild = n3;
        n2.leftChild = n4;
        n2.rightChild = n5;
        n3.rightChild = n6;
        n5.leftChild = n7;
        n5.rightChild = n8;
        n6.leftChild = n9;
        n8.leftChild = n10;
        //			 8
        //         /  \
        //        5     4
        //       / \     \
        //      9   7      11
        //         / \    /
        //        1   12 3
        //           /
        //          2
        
        // Return root node
        return n1;
    }

    /**
     * Implement level-order traversal (Breadth-first search)
     * @param root
     */
    public void bFS(BinaryTreeNode root){

        Queue queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){

            BinaryTreeNode node = (BinaryTreeNode) queue.poll(); // poll(): remove the present head
            System.out.print(node.data + " ");
            if(node.leftChild != null){
                queue.add(node.leftChild);
            }
            if(node.rightChild != null){
                queue.add(node.rightChild);
            }
        }
    }
    
    /**
     * DFS use Stack
     * @param root
     */
    public void dFS(BinaryTreeNode root){
    		
    		if(root == null){
    			return;
    		}
    		
    		Stack stack = new Stack();
    		stack.push(root);
    		
    		while(!stack.empty()){
    			
    			BinaryTreeNode n = (BinaryTreeNode) stack.pop();
    			System.out.print(n.data + " ");
    			
    			if(n.rightChild != null){
    				stack.push(n.rightChild);
    			}
    			if(n.leftChild != null){
    				stack.push(n.leftChild);
    			}
    		}
    }

}
