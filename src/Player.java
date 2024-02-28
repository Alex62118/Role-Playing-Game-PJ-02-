public abstract class Player {
    public String name;
    public int hp, force, dexter, exp, gold;
    public boolean destroyed = false;

    public Player(String name, int hp, int force, int dexter, int exp, int gold) {
        this.name = name;
        this.force = force;
        this.hp = hp;
        this.dexter = dexter;
        this.exp = exp;
        this.gold = gold;

    }

    public int getForce(){
        return force;
    }

    public boolean isDestroyed(){
        return destroyed;
    }

    public boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Monster " + name + " был уничтожен");
            return true;
        }
        return false;
    }

    abstract public void attack();


}
