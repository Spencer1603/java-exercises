package org.launchcode.java.inClass;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main (String[] args){
        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(3);
        first.add(4);
        first.add(5);
        first.add(1);

        ArrayList<Integer> second = new ArrayList<Integer>();
        first.add(1);
        first.add(6);

        ArrayList<Integer> answer  = addLists(first, second);
        System.out.println(answer);
    }

    public static ArrayList<Integer> addLists(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> results = new ArrayList<Integer>();
        //get length of both lists
        int length1 = list1.size();
        int length2 = list2.size();

        ArrayList<Integer> smaller = list1;
        ArrayList<Integer> larger = list2;

        //see which list is larger
        if(length1 > length2) {
            larger = list1;
            smaller = list2;
        }

        //for each value in the smaller list
        for(int i = 0; i < smaller.size(); i++){
            //add values from both lists
            int sum = smaller.get(i) + larger.get(i);
            results.add(sum);
        }

        // for the remaining values in the longer list
        for(int j = smaller.size(); j = larger.size(); j++) {
            //copy values
            results.add(larger.get(j));
        }

        //return results
        return results;

    }
}
