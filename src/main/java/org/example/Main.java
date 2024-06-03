package org.example;

import org.taskRubberArray.RubberArray;

public class Main {
    public static void main(String[] args) {
        RubberArray rubberArray = new RubberArray();

        rubberArray.append(2);
        rubberArray.append(3);
        rubberArray.append(5);

        rubberArray.appendRange(new int[]{3,4,5});
        rubberArray.appendRange(99,45,5);

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