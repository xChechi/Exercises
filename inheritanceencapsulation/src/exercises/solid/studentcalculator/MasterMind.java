package exercises.solid.studentcalculator;

import java.util.Arrays;

public class MasterMind implements Calculations {


    @Override
    public int sum(int[] num) {
        int temp = 0;
        for (int i : num) {
                temp = temp + i;
        }
        return temp;
    }

    @Override
    public int biggestNum(int[] num) {
        return Arrays.stream(num).max().getAsInt();
    }
}
