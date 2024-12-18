
public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena();

        Player warrior = PlayerFactory.createPlayer("warrior", "Воїн");
        Player mage = PlayerFactory.createPlayer("mage", "Маг");
        Player archer = PlayerFactory.createPlayer("archer", "Лучник");

        arena.addPlayer(warrior);
        arena.addPlayer(mage);
        arena.addPlayer(archer);

        arena.attack(warrior, mage);
        arena.attack(mage, archer);
        arena.attack(archer, warrior);

        arena.movePlayer(warrior, "up");
        arena.movePlayer(archer, "left");
        arena.movePlayer(mage, "down");
    }
}