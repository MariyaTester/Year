import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        if (year <= 0) {
            System.out.println("Введено неверное значение.");
        } else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год не високосный.");
        }
    }
}
