package com.ravi.structural.designpatterns.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterDemo {
    /**
     * Adapter pattern is basically for adapting an older mechanism and providing a new funcitonality
     *
     * When we updated from Arrays to arraylist, the adapter pattern is used to make use of existing legacy code from the array and made
     * available for List
     *
     * There can be multiple adapters we can use for this
     *
     * Best example: A customer wants a functionality called doSomething(), this is not available in the legacy interface,
     * so, in order to support this, we extend the current interface and add the missing functionality
     */


    public static void main(String[] args) {
        Integer[] arrayOfIntegers = new Integer[]{1,2,3,4};
        List<Integer> integers = Arrays.asList(arrayOfIntegers);
        for(Integer i:integers)
        System.out.println(i);
        System.out.println(integers);
    }

    /**
     * Dont complicate
     * Dont add functionality
     * This is best when we use legacy code and apis
     */
}
