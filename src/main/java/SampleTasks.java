public class SampleTasks {

    public static void main(String[] args) {

        System.out.println("Среднее арифметическое " + getAverage());
        System.out.println("Факториал числа " + getFactorial(4));
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
}
