public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "разносторонний", "легкообучаемый", "труднопроизносимый", "вспыльчивый","развратный","обдолбленный","тупой"};
        String[] wordListTwo = {"женственный", "голубой", "мужественный", "сильный", "слабый","посредственный","классический","консервативный"};
        String[] wordListThree = {"дурак", "хомяк", "простак", "чудак", "властелин","нищеброд","слесарь","Игорь"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Все, что нам нужно, - это " + phrase);

        int x = (int) 29.7;
        System.out.println(x);
    }
}
