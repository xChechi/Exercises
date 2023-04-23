package exercises.solid.studentcalculator;

import java.util.Arrays;

public class Ivan implements Calculations {


    @Override
    public int sum(int[] num) {
        int temp = 0;
        for (int i : num) {
            if (i % 2 == 0) {
                temp = temp + i;
            }
        }
        return temp;
    }

    @Override
    public int biggestNum(int[] num) {
        int biggest = Arrays.stream(num).reduce((f, s) -> s).getAsInt();
        return biggest;
    }
}
