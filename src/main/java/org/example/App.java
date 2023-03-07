package org.example;

import org.example.leetcode.MoveZeros;
import org.example.leetcode.ValidParentheses;

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

//        BinarySearch bs = new BinarySearch();
//
//        ArrayList<Integer> list = new ArrayList<>(
//                Arrays.asList(1, 5, 4 , 8 , 7, 3, 2 ,6));
//
//        int index = bs.startSearh(list, 1);
//
//        System.out.println(index);

//        boolean valid = ValidParentheses.isValid("([])");
//        System.out.println(valid);
//


        int[]array  = {0};
        MoveZeros moveZeros = new MoveZeros();
       moveZeros.moveZeroes(array);

    }
}
