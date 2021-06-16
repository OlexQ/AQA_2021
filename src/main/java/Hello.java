public class Hello {

    //создадим массив 10 случайных чисел и выведем в консоль среднее арифметическое
    public static void main(String[] args) {
        double average = 0;

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
            average += array[i];
        }

        System.out.println("Среднее арифметическое " + average / array.length);
    }

}
