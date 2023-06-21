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
                System.out.println("Хрю-Хрю");
                break;
            case 4:
                System.out.println("Ква-Ква");
                break;
            case 5:
                System.out.println("Иго-Го");
                break;
            case 6:
                System.out.println("У-У");
                break;
            case 7:
                System.out.println("Кука-Реку");
                break;
            case 8:
                System.out.println("Кря-Кря");
                break;
            case 9:
                System.out.println("Угу-Угу");
                break;
            case 10:
                System.out.println("Чирик-Чирик");
                break;
        }

    }
}
