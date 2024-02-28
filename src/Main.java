import java.util.Scanner;
import java.util.Random;
public class Main {


    public static void main(String[] args) {

        System.out.println("Введите имя игрока");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        Player player1 = new Hero(name, 100, 10, 5, 0, 50);
        System.out.println("Введите число от 1 до 3. 1 - идём к торговцу, 2- идём в тёмный лес, 3- выход из игры");
        int n = console.nextInt();
        Random random = new Random();
        while (n!=3) {
            if (n==2) {
                Player player2;
                if (random.nextInt(2) == 0) {
                    player2 = new Goblin("Bob", 100, 10, 5, 0, 50);
                    System.out.println("Monster Goblin вышел на битву");
                }
                else {
                    player2 = new Skeleton("Jon", 100, 10, 5, 0, 50);
                    System.out.println("Monster Skeleton вышел на битву");
                }
                Battle battle = new Battle(player1, player2);
                battle.start();
                if (player1.isDestroyed() == false) {
                    player1.gold += 100;
                    player1.exp =+ 10;
                    if (player1.dexter < 10) {
                        player1.dexter ++;
                    }
                }
                else {
                    System.out.println("Герой погиб, игра окончена");
                    return;
                }
                System.out.println("Введите число от 1 до 3. 1 - идём к торговцу, 2- идём в тёмный лес, 3- выход из игры");
                n = console.nextInt();
            }
            if (n == 1) {
                player1.hp += player1.gold;
                player1.gold = 0;
            }
            if (n == 3) {
                System.out.println("Game over!!!");
            }
        }





    }
}