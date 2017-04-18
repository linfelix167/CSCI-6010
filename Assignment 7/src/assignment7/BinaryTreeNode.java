package assignment7;

import java.io.*;
import java.util.*;

public class BinaryTreeNode<T> {
    public T data;

    public BinaryTreeNode<T> leftChild;

    public BinaryTreeNode<T> rightChild;

    public BinaryTreeNode(T data) {

        this.data = data;

    }

    /**
     * Create a binary tree
     * @return
     */
    public static BinaryTreeNode creatTree(){

        BinaryTreeNode n1 = new BinaryTreeNode(6);
        BinaryTreeNode n2 = new BinaryTreeNode(8);
        BinaryTreeNode n3 = new BinaryTreeNode(2);
        BinaryTreeNode n4 = new BinaryTreeNode(1);
        BinaryTreeNode n5 = new BinaryTreeNode(3);
        BinaryTreeNode n6 = new BinaryTreeNode(5);
        BinaryTreeNode n7 = new BinaryTreeNode(4);
        BinaryTreeNode n8 = new BinaryTreeNode(7);

        n1.leftChild = n2;
        n1.rightChild = n3;
        n2.leftChild = n4;
        n3.leftChild = n5;
        n3.rightChild = n6;
        n4.leftChild = n7;
        n4.rightChild = n8;
        //        6
        //       / \
        //      8   2
        //     /   / \
        //    1   3   5
        //   / \
        //  4   7

        // Return root node
        return n1;
    }

    /**
     * Implement pre-order traversal (Depth-first search)
     * @param root
     */
    public void preOrder(BinaryTreeNode root){

        if(root == null){
            return;
        }

        if(root != null){
            System.out.print(root.data + " ");
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }

    /**
     * Get height of the tree
     * @param parent
     * @return
     */
    public int height(BinaryTreeNode parent){

        if(parent == null){
            return 0;
        }
        else{
            int leftH = height(parent.leftChild);
            int rightH = height(parent.rightChild);

            if(leftH > rightH){
                return (leftH+1);
            }else{
                return (rightH +1);
            }
        }
    }

    /**
     * Get nodes at level
     * @param parent
     * @param high
     */
    public void getLevel(BinaryTreeNode parent, int high){

        if(parent == null){
            return;
        }
        if(high == 1){
            System.out.print(parent.data + " ");
        }
        else if(high > 1){

            getLevel(parent.leftChild, high - 1);
            getLevel(parent.rightChild, high - 1);
        }

    }

    /**
     * BFS level order traversal
     * @param parent
     */
    public void levelOrder(BinaryTreeNode parent){

        int high = height(parent);

        for(int i = 0; i <= high; i++){
            getLevel(parent, i);
        }
    }
}
