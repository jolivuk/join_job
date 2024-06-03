package org.taskRubberArray;

import java.util.Arrays;

public class RubberArray {
    private int size;
    private int[] array;

    public RubberArray() {
        this.size = 0;
        this.array = new int[this.size];
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < array.length; i++) {
            res += String.valueOf(array[i]) + " ";
        }
        return "[" + res.trim() + "]";
    }
}
