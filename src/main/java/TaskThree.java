import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        System.out.println("Периметр прямоугольника равен: " + perimeterCalculator(length, width));
        System.out.println("Длина диагонали равна: " + diagonalCalculator(length, width));

        scanner.close();
    }

    public static double perimeterCalculator(double length, double width) {
        return (length + width) * 2;
    }

    public static double diagonalCalculator(double length, double width) {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }
}
