import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        System.out.println("Введите координату X:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Введите координату Y:");
        int y = scanner.nextInt();

        if (x > 0 & y > 0) System.out.println("Точка находится в I четверти");
        if (x < 0 & y > 0) System.out.println("Точка находится во II четверти");
        if (x < 0 & y < 0) System.out.println("Точка находится в III четверти");
        if (x > 0 & y < 0) System.out.println("Точка находится в IV четверти");
        if (x == 0 & y == 0) System.out.println("Вы ввели нулевую точку");
    }
}
