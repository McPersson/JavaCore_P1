import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число ");
        double chislo1 = scanner.nextDouble();
        System.out.print("Введите второе число ");
        double chislo2 = scanner.nextDouble();
        System.out.print("Введите желаемую операцию. Доступные примеры: +, -, *, /");
        String znak = scanner.next();

        scanner.close();

        switch (znak) {
            case "+":
                System.out.println("Сумма чисел равна " + (chislo1 + chislo2));
                break;
            case "-":
                System.out.println("Разность чисел равна " + (chislo1 - chislo2));
                break;
            case "*":
                System.out.println("Произведение чисел равно " + (chislo1 * chislo2));
                break;
            case "/":
                if (chislo2 == 0) {
                    System.out.println("Упс, ошибочка! Делить на ноль - нельзя.");
                    break;
                } else {
                    System.out.println("Результат деления чисел равен " + (chislo1 / chislo2));
                }
                break;
            default:
                System.out.println("Вы ввели не тот символ =)");
                break;
        }
    }
}
