package org.example.sort;

import java.rmi.server.RMIClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class BinarySearch {

    public BinarySearch() {
    }

    public int startSearh(ArrayList<Integer> list, int number) {

        Collections.sort(list);
        int start = 1;
        int high = list.size();
        int index = high / 2;

        while (start <= high){

            if (index == number){
                return index - 1;
            }

            if (number > index){
                start = index + 1;
            }
            else high = index - 1;

            index = (start + high) / 2;

        }



        return -1;
    };


}
