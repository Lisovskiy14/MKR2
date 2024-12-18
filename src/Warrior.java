
public class Warrior extends Player {
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack(Player target) {
        target.health -= attackPower;
    }
}
