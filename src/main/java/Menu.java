import java.util.Scanner;

public class Menu {
    static Army troop;
    static Army menu() {
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Набор армии");
        System.out.println("1.Пехота");
        System.out.println("2.Лучники");
        System.out.println("3.Конница");
        System.out.println("4.Маги");
        i = in.nextInt();
        switch (i) {
            case 1:
                troop = Army.Swordsman;
                break;
            case 2:
                troop = Army.Archer;
                break;
            case 3:
                troop = Army.Horseman;
                break;
            case 4:
                troop = Army.Magician;
                break;
            default:
                System.out.println("Повторите выбор");
                menu();
                break;
        }
        return troop;
    }

    static Army menu(int a) {
        switch (a) {
            case 0:
                troop = Army.Magician;
                break;
            case 1:
                troop = Army.Swordsman;
                break;
            case 2:
                troop = Army.Archer;
                break;
            case 3:
                troop = Army.Horseman;
                break;
            default:
                break;
        }
        return troop;
    }

}
