package JR.tk02.task0216;
/*
Минимум трёх чисел
*/
public class Solution {
    public static int min(int a, int b, int c) {
/*        int q;
        if (b<c)
            q=b;
        else
            q=c;

        if (a<q)

            return a;
        else
            return q;
мое решение
 */
        if (a<=b && a<=c)
            return a;
        if (b<=a && b<=c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
