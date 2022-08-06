package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {

        //throw new UnsupportedOperationException();
        int mx = values[0];

        for (int i : values) {
            if (i > mx) {
                mx = i;
            }
        }
        return mx;
    }
}
