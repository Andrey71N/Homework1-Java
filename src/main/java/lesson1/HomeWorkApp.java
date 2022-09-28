package lesson1;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {

       System.out.println("Orang");
       System.out.println("Banana");
       System.out.println("Appie");
    }


    private static void checkSumSign() {

        int a = 8;
        int d = 7;
        int s = a + d;
        System.out.println(s);
        if (s >=0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }


    private static void printColor() {
        int value = 4;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }



    private static void compareNumbers() {
        int a = 12;
        int b = 7;

        if (a >=b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }

    }

}




















