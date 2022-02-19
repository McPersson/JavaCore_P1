import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        System.out.println("Вы ввели число: " + num);
        scanner.close();
    }
}
