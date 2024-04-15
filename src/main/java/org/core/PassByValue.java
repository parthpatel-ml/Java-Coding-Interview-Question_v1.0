package org.core;

import java.util.ArrayList;
import java.util.List;

public class PassByValue {
    public int integerValue = 10;
    public static int intStatic = 20;
    public float a = 10.10F;
    public double b = 20.20;
    PassByValue(){}
    PassByValue(float c, double d) {
        a = c;
        b = d;
    }
    public static void main(String[] args) {
        PassByValue obj = new PassByValue();

        List<Integer> intList = new ArrayList<>(10);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        System.out.println(intList);
        System.out.println(obj.integerValue);
        System.out.println(intStatic);

        obj.modifyList(intList);
        System.out.println(intList);
        System.out.println(obj.integerValue);
        System.out.println(intStatic);
    }

    public void modifyList(List<Integer> input) {
        input.add(100);
        integerValue = 50;
        intStatic = 60;
    }
}
