public abstract class Player {
    protected String name;
    protected int health;
    protected int attackPower;
    protected Arena arena;
    protected int x;
    protected int y;

    public Player(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.x = 0;
        this.y = 0;
    }

    public abstract void attack(Player target);

    public void move(String direction) {
        switch (direction.toLowerCase()) {
            case "up":
                y += 1;
                break;
            case "down":
                y -= 1;
                break;
            case "left":
                x -= 1;
                break;
            case "right":
                x += 1;
                break;
            default:
                throw new IllegalArgumentException("Невідомий напрямок: " + direction);
        }
    }

    public void attackTarget(Player target) {

    }

    public String getName() {
        return name;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public void receiveMessage(String message) {
        System.out.println(name + " отримав повідомлення: " + message);
    }
}
