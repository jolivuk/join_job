package org.taskRubberArray;

public class RubberArray {

    private int size;
    private int[] array;

    public RubberArray() {
        this.array = new int[0];
        this.size = 0;
    }



    public void append (int item){
        this.size++;
        int[] newArray = new int[this.size];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[this.size-1] = item;
        this.array = newArray;
    }

    public void appendRange (int ... items){
        for (int i = 0; i < items.length; i++) {
            append(items[i]);
        }
    }

    @Override
    public String toString() {
        String strArray = "";
        for (int num: array)
        {
            strArray += num + " ";
        }
        return "[" + strArray.trim() + "]";
    }
}
