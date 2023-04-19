package com.ds.algorithm.bst;

public class Main {
    public static void main(String arg[]){
        BinarySearchTree binarySearchTree= new BinarySearchTree();
        binarySearchTree.insert(70);
        binarySearchTree.insert(50);
        binarySearchTree.insert(90);
        binarySearchTree.insert(30);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);
        binarySearchTree.insert(100);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);
//        System.out.println("\nPre Order Travers");
//        binarySearchTree.preOrderTravers(binarySearchTree.root);
//        System.out.println("\nIn Order Travers");
//        binarySearchTree.inOrderTravers(binarySearchTree.root);
//        System.out.println("\nPost Order Travers");
//        binarySearchTree.postOrderTravers(binarySearchTree.root);
//        System.out.println("\nLevel Order Travers");
//        binarySearchTree.levelOrderTravers(binarySearchTree.root);
//        binarySearchTree.search(binarySearchTree.root,45);

//        System.out.println("\nLevel Order Travers");
//        binarySearchTree.levelOrderTravers(binarySearchTree.root);
//        binarySearchTree.deleteNode(binarySearchTree.root,70);
//        System.out.println("\nLevel Order Travers");
//        binarySearchTree.levelOrderTravers(binarySearchTree.root);

        binarySearchTree.levelWisePrint(binarySearchTree.root);
    }
}
