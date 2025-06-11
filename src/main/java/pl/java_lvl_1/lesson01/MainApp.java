package pl.java_lvl_1.lesson01;

// 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
public class MainApp {

    public static void main(String[] args) {

        // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte a = 1;
        short b = 2;
        int c = 13;
        long d = 1000000000000L;
        float e = 98.05f;
        double f = 20.234;
        char g = '*';
        boolean h = true;
        String phrase = "Hello, World!";

        // Exercise 3
        System.out.println(calculateFunction(2, 5, 7, 3));

        // Exercise 4
        System.out.println(checkingNumbersSum(2,10));

        // Exercise 5
        int number1 = -2;
        int number2 = 6;
        isNumberPositive(number1);
        isNumberPositive(number2);

        // Exercise 6
        System.out.println(isNegative(-3));

        // Exercise 7
        helloString("Piotr");

        // Exercise 8
        System.out.println(isYearLeap(2024));
    }

    public static float calculateFunction(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // 4. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.

    public static boolean checkingNumbersSum(int a, int b) {
        int res = a+b;
        if (res >= 10 && res <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // 5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void isNumberPositive(int num) {
        if (num >= 0) {
            System.out.println("This number is positive: " + num);
        } else {
            System.out.println("This number is negative: " + num);
        }
    }

    // 6. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNegative (int num) {
        return num < 0;
    }

    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void helloString(String username){
        System.out.println("Hello, " + username + ". Welcome!");
    }

    // 8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static boolean isYearLeap(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}