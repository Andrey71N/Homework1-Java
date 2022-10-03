package lesson2;

public class HomeworkLesson2 {

    public static void main(String[] args) {
        System.out.println(oneTest1(2, 29));
        System.out.println();twoTest2(10);
        System.out.println(twoTest3(-17));
        System.out.println();fourTest4("Sky", 9);

    }

    public static boolean oneTest1(int a, int b) {

        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

    public static void twoTest2(int y) {
        if (y >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отприцательное");
        }
    }

    public static boolean twoTest3(int q) {
        if (q < 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void fourTest4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }



    }

































