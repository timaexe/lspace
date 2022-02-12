package JR;
public class User {

    String name;
    short age;
    int height;

    public User (String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User (short age, String name, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User (String name, int height, short age) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User (short age, int height, String name) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User (int height, String name, short age) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User (int height, short age, String name) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        User user01 = new User (180,(short) 32, "Юра");
        User user02 = new User ("Петя", (short) 22, 162);
        User user03 = new User ((short) 23, 155, "Вася");

        System.out.println ("Имя пользователя: " + user01.name + ", возраст: " + user01.age + ", рост: " + user01.height);
        System.out.println ("Имя пользователя: " + user02.name + ", возраст: " + user02.age + ", рост: " + user02.height);
        System.out.println ("Имя пользователя: " + user03.name + ", возраст: " + user03.age + ", рост: " + user03.height);



    }
}