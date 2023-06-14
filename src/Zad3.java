import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args){

        System.out.println("Выберите животное из списска:");
        int chain;
        System.out.println("1- Кошка\n2- Собака\n3- Свинка\n4- Лягушка\n5- Лошадка ");
        System.out.println("6- Улитка\n7- Пятух\n8- Утка\n9- Филин\n10- Птичка ");
        Scanner scanner = new Scanner(System.in);
        chain = scanner.nextInt();

        switch (chain){
            case 1:
                System.out.println("Мяу-Мяу");
                break;
            case 2:
                System.out.println("Гав-Гав");
                break;
            case 3:
                System.out.println("Мяу-Мяу");
                break;
            case 4:
                System.out.println("Хрю-Хрю");
                break;
            case 5:
                System.out.println("Мяу-Мяу");
                break;
            case 6:
                System.out.println("Мяу-Мяу");
                break;
            case 7:
                System.out.println("Мяу-Мяу");
                break;
            case 8:
                System.out.println("Мяу-Мяу");
                break;
            case 9:
                System.out.println("Мяу-Мяу");
                break;
            case 10:
                System.out.println("Мяу-Мяу");
                break;
        }

    }
}
