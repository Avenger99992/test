import java.util.Scanner;

public class Battle {
    static void startBattle(Army a[], Army b[]) {

        Army battleUnit1, battleUnit2;
        int i;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Ваша армия:");
            for (int j = 0; j < 5; j++) {
                System.out.println(j + 1 + ". " + a[j] + " Hp " + a[j].hp);
            }
            System.out.println("Вражеская Армия:");
            for (int k = 0; k < 5; k++) {
                System.out.println(k + 1 + ". " + b[k] + " Hp " + b[k].hp);
            }
            System.out.println("Выберите Ваш отряд:");
            i = in.nextInt();
            if (i > 5) {
                System.out.println("Повторите выбор:");
                i = in.nextInt();
            }
            battleUnit1 = a[i - 1];

            System.out.println("Выберите отряд, на который будете нападать:");
            i = in.nextInt();
            if (i > 5) {
                System.out.println("Повторите выбор:");
                i = in.nextInt();
            }
            battleUnit2 = b[i - 1];

            Fight.fight(battleUnit1, battleUnit2);
        } while (a != null || b != null);

    }
}