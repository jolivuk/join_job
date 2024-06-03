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

    public void append(int item) {
        size++;
        int[] newArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[size - 1] = item;

        array = newArray;
    }

    public void appendRange(int... items) {
        for (int i = 0; i < items.length; i++) {
            append(items[i]);
        }
    }

    public void remove(int item) {
        int pos = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            return;
        }
        removeAt(pos);
    }

    public void removeAt(int position) {
        if(position<0 || position >= size){
            return;
        }
        size--;
        int[] temp = new int[size];

        for (int i = 0; i < position; i++) {
            temp[i] = array[i];
        }
        for (int i = position; i < size; i++) {
            temp[i] = array[i + 1];
        }
        array = temp;
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
