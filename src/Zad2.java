import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {

        System.out.println("Введите время:");
        int time;
        Scanner scanner = new Scanner(System.in);
        time = scanner.nextInt();

        if (time>0 & time<12){
            System.out.println("Доброе утро!");
        }
        if (time>=12 & time<18){
            System.out.println("Добрый день!");
        }
        if (time>=18& time<24){
            System.out.println("Добрый вечер!");
        }

    }
}
