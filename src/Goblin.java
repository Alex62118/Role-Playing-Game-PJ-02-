public class Goblin extends Player {
    public Goblin(String name, int hp, int force, int dexter, int exp, int gold) {
        super(name , hp, force, dexter, exp, gold);
    }

    public void growl(){
        System.out.println("Raaaauuughhhh");
    }

    @Override
    public void attack(){
        growl();
    }
}
