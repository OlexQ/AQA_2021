import java.sql.SQLOutput;
import java.util.Scanner;

public class PriceTask {
    //Вывести цену за определенный товар опираясь на его код (предусмотреть возможность введение неверного кода).
    public static void main(String[] args) {

        System.out.print("Please, enter code (e.g. 111 or 222 or 333) ");
        Scanner scan = new Scanner(System.in);
        int code = scan.nextInt();

        double price = getPrice(code);
        if (price != -1.0) {
            System.out.println("Price of the product is " + price);
        }
        else {
            System.out.println("Invalid value");
        }
    }

    private static double getPrice(int code) {
        switch (code) {
            case 111: return 10.5;
            case 222: return 20.5;
            case 333: return 30.5;
            default: return -1.0;
        }
    }
}


