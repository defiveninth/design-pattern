import java.util.ArrayList;
import java.util.List;

/**
 * Represents a player in the adventure game.
 *
 * SOLID Principles Applied:
 * - SRP: Manages player attributes (health, experience, inventory).
 * - OCP: Can be extended with new player attributes without modifying existing code.
 * - LSP: Can be extended to different player types (e.g., Mage, Warrior).
 */
class Player {
    private String name;
    private int health;
    private int experience;
    private List<String> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void gainExperience(int exp) {
        experience += exp;
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void restoreHealth() {
        health = 100;
    }

    public int getHealth() { return health; }
    public int getExperience() { return experience; }
}
