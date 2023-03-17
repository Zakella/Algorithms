package org.example;

import org.example.structures.RedBlackTree;

public class App 
{
    public static void main( String[] args )
    {

        RedBlackTree<Integer> tree = new RedBlackTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        tree.inorderTraversal(tree.getRoot());


    }





}
