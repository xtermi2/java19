package com.github.xtermi2.java19.jep405recordpatterns;

public class RecordPatternMatching {

    record Point(int x, int y) {
    }

    static int printSum(Object o) {
        if (o instanceof Point(int x,int y)) {
            final int sum = x + y;
            System.out.println(sum);
            return sum;
        }
        return -1;
    }
}
