import java.util.ArrayList;
import java.util.List;

/**
 * Manages game levels, including enemies and items.
 *
 * SOLID Principles Applied:
 * - SRP: Manages level transitions and enemy/item assignments.
 * - OCP: New level configurations can be added without modifying existing logic.
 * - DIP: Game logic depends on this class rather than hardcoded values.
 */
class LevelManager {
    private int level;
    private List<Enemy> enemies;
    private List<Item> items;

    public LevelManager() {
        level = 1;
        enemies = new ArrayList<>();
        items = new ArrayList<>();
        setupLevel();
    }

    private void setupLevel() {
        enemies.clear();
        items.clear();
        if (level == 1) {
            enemies.add(new Enemy("Skeleton", 10, 20));
            enemies.add(new Enemy("Zombie", 15, 30));
            items.add(new Item("Gold Coin", 5));
            items.add(new Item("Health Elixir", 20));
        } else if (level == 2) {
            enemies.add(new Enemy("Vampire", 25, 50));
            items.add(new Item("Magic Scroll", 15));
        }
    }

    public void nextLevel() {
        level++;
        setupLevel();
    }

    public List<Enemy> getEnemies() { return enemies; }
    public List<Item> getItems() { return items; }
    public int getLevel() { return level; }
}
