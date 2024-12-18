public class Archer extends Player {
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack(Player target) {
        target.health -= attackPower;
    }
}
