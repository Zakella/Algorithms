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

////        BinarySearch bs = new BinarySearch();
////
////        ArrayList<Integer> list = new ArrayList<>(
////               Arrays.asList(1, 5, 4 , 8 , 7, 3, 2 ,6));
////
////        int index = bs.startSearh(list, 1);
////
////        System.out.println(index);
//
////        boolean valid = ValidParentheses.isValid("([])");
////        System.out.println(valid);
////
//
//
//        int[]array  = {1, 5, 4 , 8 , 7, 3, 2 ,6};
//        HeapSort heapSort = new HeapSort();
//        heapSort.sort(array);
//        System.out.println(Arrays.toString(array));
////        MoveZeros moveZeros = new MoveZeros();
////       moveZeros.moveZeroes(array);

        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addFirst("test4");
////
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
        list.addFirst("test3");
        list.addFirst("test2");
        list.addFirst("test1");
        list.addFirst("test0");
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//        System.out.println(list.getAmount());
        list.addLast("last");
        list.addFirst("first");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getAmount());
        list.putInOrder();
        list.reverse();
        list.putInOrder();


    }
}
