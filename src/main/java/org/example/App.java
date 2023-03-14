package org.example;

import org.example.leetcode.MoveZeros;
import org.example.leetcode.ValidParentheses;
import org.example.sort.HeapSort;
import org.example.structures.DoubleLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addLast("2");
        list.addLast("3");
        list.addFirst("1");
        list.addFirst("0");
        System.out.println(list.getAmount());
        list.putInOrder();
        list.reverse();
        System.out.println();

        list.putInOrder();


    }
}
