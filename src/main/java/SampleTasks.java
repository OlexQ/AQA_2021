import java.util.Scanner;

public class SampleTasks {

    public static void main(String[] args) {

        System.out.println("Среднее арифметическое " + getAverage());
        System.out.println("Факториал числа " + getFactorial(4));
//      System.out.print("Введите код товара от 1 до 10: ");
        System.out.println("Ввведите любое число ") ;
        System.out.println(getEvenNumber());
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
    public static double getAverage(){
    int sum = 0;

    int[] array = {3, 2, 5};
        for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
        sum += array[i];
    }
        return sum/ array.length;
    }

    //Вывести цену за определенный товар опираясь на его код (предусмотреть возможность введение неверного кода).

/*    public static double getPrice() {
        double price;
        Scanner scan = new Scanner(System.in);
        int code = scan.nextInt();

    }
        return price;
} */
    //Вывести на экран информацию о том является ли целое число записанное в переменную n, чётным либо нечётным.
    public static double getEvenNumber(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if ((n%2)==0) {
                System.out.println ("Число " + n + " четное ");
            }
		else
		 if((n%1)==0) {
         System.out.println ("Число " + n + " не четное ");
        }
        return n;

// Перобразовать массив в строку и обртано в массив
        public static double getConvertedString(){


        }
// Добавить к каждому элементу массива слова hello
// Преобразовать числовой массив в boolean
    }





    }
