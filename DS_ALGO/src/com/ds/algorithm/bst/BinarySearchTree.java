package com.ds.algorithm.bst;

import java.util.LinkedList;
import java.util.Queue;

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

    public void levelOrderTravers(BinaryNode binaryNode){
        if(binaryNode==null)
            return;
        Queue<BinaryNode> queue= new LinkedList<>();
        queue.add(binaryNode);
        while (!queue.isEmpty()){
            BinaryNode temp=queue.remove();
            System.out.print(temp.value+"->");
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }

        }
    }

    public BinaryNode search(BinaryNode binaryNode,int value){
        if(binaryNode==null){
            System.out.println("Value : "+value+" is not found in BST !");
            return null;
        }
        if(binaryNode.value==value){
            System.out.println("Value : "+value+" is found in BST !");
            return binaryNode;
        }

        if(value<binaryNode.value){
           return search(binaryNode.left,value);
        }else{
            return  search(binaryNode.right,value);
        }
    }

    private BinaryNode minimumNode(BinaryNode binaryNode){
        if(binaryNode.left==null)
            return binaryNode;
        else
            return minimumNode(binaryNode.left);
    }

    public BinaryNode deleteNode(BinaryNode root,int value){
        if(root==null){
            System.out.println(value +" is not found in bst");
        }
        if(value<root.value){
            root.left=deleteNode(root.left,value);
        }else if(value>root.value){
            root.right=deleteNode(root.right,value);
        }else{
            if(root.left!=null && root.right!=null){
                BinaryNode temp=root;
                BinaryNode minimumNode=minimumNode(temp.right);
                root.value=minimumNode.value;
                root.right=deleteNode(root.right,minimumNode.value);
            }else if(root.left!=null){
                root=root.left;
            }else if(root.right!=null){
                root=root.right;
            }else{
                root=null;
            }
        }
        return root;
    }

    public void levelWisePrint(BinaryNode root){
        if(root==null)
            return;
        Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
        queue.add(root);
        int level=0;
        while (!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                BinaryNode temp= queue.remove();
                System.out.println("Level :"+level+" value: "+temp.value);
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
            level++;
        }
    }
}
