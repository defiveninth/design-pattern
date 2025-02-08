/**
 * Controls the main game flow and interactions between components.
 *
 * SOLID Principles Applied:
 * - SRP: Manages game flow and interactions.
 * - OCP: New game mechanics (e.g., quests, puzzles) can be added without modifying this class.
 * - DIP: Depends on abstractions like Player, Enemy, Item, and LevelManager.
 */
public class Game {
    private Player player;
    private LevelManager levelManager;

    public Game() {
        player = new Player("Adventurer");
        levelManager = new LevelManager();
    }

    public void play() {
        while (player.isAlive() && levelManager.getLevel() <= 3) {
            System.out.println("=== Level " + levelManager.getLevel() + " ===");
            for (Enemy enemy : levelManager.getEnemies()) {
                System.out.println(player.getHealth() + " HP | Fighting: " + enemy.getType());
                enemy.attack(player);
                if (!player.isAlive()) {
                    System.out.println("Game Over!");
                    return;
                }
            }
            for (Item item : levelManager.getItems()) {
                item.applyEffect(player);
            }
            levelManager.nextLevel();
        }
        System.out.println("Congratulations! Final XP: " + player.getExperience());
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
