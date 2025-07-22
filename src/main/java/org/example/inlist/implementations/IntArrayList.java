package org.example.inlist.implementations;
import org.example.inlist.IntList;

public class IntArrayList implements IntList {
    private int[] array;
    private int size;

    public IntArrayList() {
        array = new int[10]; // 10, default
        size = 0;
    }

    // Getter size
    public int getSize() {
        return size;
    }

    @Override
    public void add(int number) {
        // If array is full, + 50%
        if (size == array.length) {
            int newSize = (int)(array.length * 1.5);
            int[] newArray = new int[newSize];
            // Copy elements
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray; // Point to new array
        }
        // Add each number
        array[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        // Validate index
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index: " + id + " is out of bounds!");
        }
        return array[id];
    }
}
