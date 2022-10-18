package JR.task0303;

/*
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        double usd1 = convertEurToUsd(20, 0.9);
        double usd2 = convertEurToUsd(55, 0.9);
        System.out.println (usd1);
        System.out.println (usd2);

    }
    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;

    }
}