package com.company.Java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingListWithoutLambda {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(56);
        list.add(17);

        System.out.println(list);

        Collections.sort(list, (o1,o2)-> {
            if(o1>o2){
                return -1;
            }
            else if (o1<o2){
                return +1;
            }
            else
                return 0;
        });
        System.out.println(list);
    }
}


class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1>o2){
            return -1;
        }
        else if (o1<o2){
            return +1;
        }
        else
            return 0;
    }
}