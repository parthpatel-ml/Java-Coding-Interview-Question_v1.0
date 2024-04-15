package org.collections.arraylist;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.BiFunction;

/**
 * ArrayListClassTest
 * Version information 1.0
 * 7th March 2024
 * Copyright notice
 **/
public class ArrayListClassTest {
    @Test
    public void basics() {
        List<Integer> integers = new java.util.ArrayList<>(5);
        /* Add elements using loop */
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        System.out.println(integers.size());
        System.out.println("Print using for loop");
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
        System.out.println("Print using enhance for loop");
        for (Integer i : integers) {
            System.out.println(i);
        }

        /** Question 1:
         * All collection classes of java store memory location of the objects they collect.
         * The primitive values do not fit in to the same definition.
         * List<int> int = new java.util.ArrayList<>(5);
         * */

        BiFunction<Float,Float,Float> abc= (a,b)-> a+b;
        System.out.println(abc.apply(10f,10f));
    }
}
