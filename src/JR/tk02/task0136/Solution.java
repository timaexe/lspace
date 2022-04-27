package JR.tk02.task0136;
/*
Да хоть на Луну!
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double moonWeight = earthWeight * 0.17;
        return moonWeight;
    }
}