package JR.task0309;

/*
Сумма 5 чисел
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}
