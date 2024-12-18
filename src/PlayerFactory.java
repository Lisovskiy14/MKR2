public class PlayerFactory {
    public static Player createPlayer(String type, String name) {
        switch (type.toLowerCase()) {
            case "warrior":
                return new Warrior(name, 150, 20);
            case "mage":
                return new Mage(name, 100, 40);
            case "archer":
                return new Archer(name, 120, 30);
            default:
                throw new IllegalArgumentException("Невідомий тип персонажа: " + type);
        }
    }
}
