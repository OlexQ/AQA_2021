import com.sun.deploy.net.MessageHeader;

import java.util.Scanner;
import java.util.StringJoiner;

public class SampleTasks {

    public static void main(String[] args) {

/*        System.out.println("Среднее арифметическое " + getAverage());
        System.out.println("Факториал числа " + getFactorial(4));
        System.out.print("Ввведите любое число ") ;
        printEvenNumber();
        String stringArray = arrayToString();
        stringToArray(stringArray);
        updateArrayWithHello();*/
        printAction();
    }

    //Посчитать Факториал числа.
    public static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;

    }

    //Посчитать среднее арифметическое массива.
    public static double getAverage() {
        int sum = 0;

        int[] array = {3, 2, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            sum += array[i];
        }
        return sum / array.length;
    }

    //Вывести на экран информацию о том является ли целое число записанное в переменную n, чётным либо нечётным.
    public static void printEvenNumber() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 0) {
            System.out.println("Не должно быть ноль, только целые числа");
        } else if ((n % 2) == 0) {
            System.out.println("Число " + n + " четное ");
        } else {
            System.out.println("Число " + n + " не четное ");
        }
    }

// Перобразовать массив в строку и обратно в массив

    public static String arrayToString() {
        int[] array = new int[]{3, 25, 5};
        StringJoiner stringArray = new StringJoiner(",");
        for (int item : array) {
            stringArray.add(String.valueOf(item));
        }
        System.out.println(stringArray);
        return stringArray.toString();
    }

    public static void stringToArray(String stringArray) {
        String[] array = stringArray.split(",");
        int[] arrayInt = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            String item = array[i];
            int number = Integer.parseInt(item);
            arrayInt[i] = number;
        }
        for (int item : arrayInt) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Добавить к каждому элементу массива слова hello
    public static void updateArrayWithHello() {
        String[] array = new String[]{"Kate", "Peter", "Marry"};
        for (int i = 0; i < array.length; i++) {
            array[i] = "hello " + array[i];
        }
        for (String item : array) {
            System.out.println(item);
        }
    }

// Преобразовать числовой массив в boolean


//    Создать программу которае решает проблему
//       Если время от 8 до 12 и денег больше 10 то идем в магазин,
//       если время больше 12 и денег больше 50 идем в кафе
//       если денег меьше 50 и время меньше 19 то идем к соседу,
//       если  время больше 19 и меньше 22 то смотрим телевизор,
//       если больше 22 то идем спать
//       Результат выводим в консоль

    public static void printAction() {
        Scanner scanHours = new Scanner(System.in);
        System.out.println("What is the current time?");
        int hours = scanHours.nextInt();

        System.out.println("Enter summ of the money you have?");
        Scanner scanMoney = new Scanner(System.in);
        int money = scanMoney.nextInt();

        if (hours >= 8 && hours <= 12 && money >= 10) {
            System.out.println("go to the market");
        } else if (hours > 12 && money >= 50) {
            System.out.println("go to the caffe");
        } else if (hours >= 12 && hours < 19 && money <=50) {
            System.out.println("go to the neighbour");
        } else if (hours >= 19 && hours < 22) {
            System.out.println("watch TV");
        } else if ((hours >= 22 && hours < 24) || (hours >= 0 && hours < 8)) {
            System.out.println("go to bed");
        } else {
            System.out.println("I don't know what you have to do");
        }

    }
}