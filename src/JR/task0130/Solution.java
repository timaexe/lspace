package JR.task0130;

/*
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        double tf = 9 / 5.0 * celsius + 32;

        return tf;
    }
}