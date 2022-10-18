package JR.task0307;

/*
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {

        Zerg zg1 = new Zerg();
        Zerg zg2 = new Zerg();
        Zerg zg3 = new Zerg();
        Zerg zg4 = new Zerg();
        Zerg zg5 = new Zerg();
        zg1.name = "Zerg1";
        zg2.name = "Zerg2";
        zg3.name = "Zerg3";
        zg4.name = "Zerg4";
        zg5.name = "Zerg5";

        Protoss ps1 = new Protoss();
        Protoss ps2 = new Protoss();
        Protoss ps3 = new Protoss();
        ps1.name = "Protoss1";
        ps2.name = "Protoss2";
        ps3.name = "Protoss3";

        Terran tn1 = new Terran();
        Terran tn2 = new Terran();
        Terran tn3 = new Terran();
        Terran tn4 = new Terran();
        tn1.name = "Terran1";
        tn2.name = "Terran2";
        tn3.name = "Terran3";
        tn4.name = "Terran4";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
