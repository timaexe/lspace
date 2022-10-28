package JR.task0312;

/*
Конвертируем время
*/

public class Solution {
    public static int convertToSecond(int hour) {
        return hour * 60 * 60;
    }

    public static void main(String[] args) {
        System.out.println(convertToSecond(2));
        System.out.println(convertToSecond(5));

    }
}
