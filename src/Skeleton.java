public class Skeleton extends Player {
    public Skeleton(String name, int hp, int force, int dexter, int exp, int gold) {
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
