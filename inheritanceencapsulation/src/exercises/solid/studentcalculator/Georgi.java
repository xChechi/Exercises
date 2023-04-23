package exercises.solid.studentcalculator;

import java.util.Arrays;

public class Georgi implements Calculations {


    @Override
    public int sum(int[] num) {
        int temp = 0;
        for (int i : num) {
            if (i % 2 != 0) {
                temp = temp + i;
            }
        }
        return temp;
    }

    @Override
    public int biggestNum(int[] num) {
        int biggest = Arrays.stream(num).findFirst().getAsInt();
        return biggest;
    }
}
