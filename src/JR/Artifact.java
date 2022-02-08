package JR;

public class Artifact {
    static int count = 212121;
    int number;
    String culture;
    int century;

    public Artifact () {
        count++;
        this.number = number + count;
        }

    public Artifact (String culture) {
        count++;
        this.number = number + count;
        this.culture = culture;
    }

    public Artifact (String culture, int century) {
        count++;
        this.number = number + count;
        this.culture = culture;
        this.century = century;
    }

    public static void main (String [] args) {
        Artifact art01 = new Artifact();
        Artifact art02 = new Artifact("aztec");
        Artifact art03 = new Artifact("maya", 5);

        System.out.println("Артефакт №" + art01.number + ", Культура: " + art01.culture + ", Век: " + art01.century);
        System.out.println("Артефакт №" + art02.number + ", Культура: " + art02.culture + ", Век: " + art02.century);
        System.out.println("Артефакт №" + art03.number + ", Культура: " + art03.culture + ", Век: " + art03.century);
    }
}
