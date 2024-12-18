public class Mage extends Player {
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack(Player target) {
        target.health -= attackPower;
    }
}
