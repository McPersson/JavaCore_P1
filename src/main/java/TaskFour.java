import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число ");
        double chislo1 = scanner.nextDouble();
        System.out.print("Введите второе число ");
        double chislo2 = scanner.nextDouble();

        scanner.close();

        if (chislo1 == chislo2) {
            System.out.println("Числа равны");
        }
        else if (chislo1 > chislo2) {
            System.out.println("Первое число больше второго");
        }
        else {
            System.out.println("Первое число меньше второго");
        }
    }
}
