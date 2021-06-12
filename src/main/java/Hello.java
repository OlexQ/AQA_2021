public class Hello {
    //создадим массив 10 случайных чисел и выведем в консоль среднее арифметическое
    public static void main(String[] args) {
        int[] Array = new int[10];
        for ( int i = 0; i < Array.length; i++) {
            Array[i] = (int) (Math.random() * 100);
            System.out.println(Array[(int) i]);
        }
        double sum = 0;

        for (double i = 0; i < Array.length; i++) {
            sum += Array[(int) i];
        }
        System.out.println("Среднее арифметическое " + sum / Array.length);
    }
}
