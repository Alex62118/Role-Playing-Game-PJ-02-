import java.util.Random;

public class Battle{

    public Player hero;
    public Player monster;
//    final static private int MAX = 5;
//
////    public Entity[] entities;
//    public int n = 0;

    Battle(Player hero, Player monster){
        this.hero = hero;
        this.monster = monster;
    }



    public void run() {
        Random random = new Random();
        Player first;
        Player second;
        if (random.nextInt(2) == 0) {
            first = hero;
            second = monster;
        } else {
            first = monster;
            second = hero;
        }

        while (hero.isDestroyed() != true && monster.isDestroyed() != true) {
            if (first.dexter * random.nextInt(6) + 50 > random.nextInt(101)) {
                second.damage(first.getForce());
                System.out.println(first.name + " атакует " + second.name);
                if (second.isDestroyed()) {
                    System.out.println(second.name + " был уничтожен");
                    break;
                }
            }
            if (second.dexter * random.nextInt(6) + 50 > random.nextInt(101)) {
                first.damage(second.getForce());
                System.out.println(second.name + " атакует " + first.name);
                if (first.isDestroyed()) {
                    System.out.println(first.name + " был уничтожен");
                    break;
                }
            }
        }


    }



//    }

    public void start(){
        run();
    }

}

