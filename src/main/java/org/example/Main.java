package org.example;

import org.taskRubberArray.RubberArray;

public class Main {
    public static void main(String[] args) {
        RubberArray rubberArray = new RubberArray();
        System.out.println(rubberArray);

        rubberArray.append(2);
        System.out.println(rubberArray);

        rubberArray.append(3);
        System.out.println(rubberArray);

        rubberArray.appendRange(new int[] { 6, 4, 5 });
        rubberArray.appendRange( 99,44,22);
        System.out.println(rubberArray);
    }
}