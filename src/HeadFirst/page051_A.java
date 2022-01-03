package HeadFirst;

public class page051_A {
    public static void main (String [] args) {
        int x = 1;
        while (x < 10) {
             //можно здесь x = x + 1; вместо x++
            if (x++ > 3) {
                System.out.println("большой икс");
            }
        }
    }
}
