package com.company;

public class Main {

    public static void main(String[] args) {
        int[] data = {-4, 11, 7, -12, 6, 1};
        boolean changed = true;
        int correct = 0;
        while (changed == true)
        {
            changed = false;
            for (int i = 0; i < data.length - 1 - correct; i++)
            {
                if (data[i] > data[i + 1])
                {
                    swap(data, i, i +1);
                    changed = true;
                }
            }
            correct++;
        }
        for (int n : data)
            System.out.println(n + " ");
        System.out.print(" ");
    }
    static void swap (int[] array, int int1, int int2)
    {
        int tmp = array[int2];
        array[int2] = array[int1];
        array[int1] = tmp;
    }
}
