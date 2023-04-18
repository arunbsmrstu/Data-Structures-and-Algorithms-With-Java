package com.ds.algorithm.bst;

public class BinarySearchTree {
    public BinaryNode root;

    //insert value in a binary tree

    private BinaryNode insert(BinaryNode binaryNode,int value){
        if(binaryNode==null){
            BinaryNode newNode= new BinaryNode();
            newNode.value=value;
            System.out.println("Value is successfully inserted !");
            return newNode;
        }else if(value<binaryNode.value){
            binaryNode.left=insert(binaryNode.left,value);
            return binaryNode;
        }else{
            binaryNode.right=insert(binaryNode.right,value);
            return binaryNode;
        }
    }

    public void insert(int value){
        root=insert(root,value);
    }

    public void preOrderTravers(BinaryNode binaryNode){
        if(binaryNode==null)
            return;
        System.out.print(binaryNode.value +" ->");
        preOrderTravers(binaryNode.left);
        preOrderTravers(binaryNode.right);
    }

    public void inOrderTravers(BinaryNode binaryNode){
        if(binaryNode==null)
            return;
        inOrderTravers(binaryNode.left);
        System.out.print(binaryNode.value +" ->");
        inOrderTravers(binaryNode.right);
    }

    public void postOrderTravers(BinaryNode binaryNode){
        if(binaryNode==null)
            return;
        postOrderTravers(binaryNode.left);
        postOrderTravers(binaryNode.right);
        System.out.print(binaryNode.value +" ->");
    }
}
