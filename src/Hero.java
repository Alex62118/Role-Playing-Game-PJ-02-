public class Hero extends Player {
    public Hero(String name, int hp, int force, int dexter, int exp, int gold) {
        super(name , hp, force, dexter, exp, gold);
    }



    @Override
    public void attack(){
        super.damage(5);

    }
}
