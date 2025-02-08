/**
 * Represents an enemy in the game.
 *
 * SOLID Principles Applied:
 * - SRP: Handles enemy attributes and combat interactions.
 * - OCP: New enemy types can be added without modifying this class.
 * - LSP: Different enemy classes (e.g., Dragon, Orc) can extend this class.
 */
class Enemy {
    private String type;
    private int damage;
    private int reward;

    public Enemy(String type, int damage, int reward) {
        this.type = type;
        this.damage = damage;
        this.reward = reward;
    }

    public void attack(Player player) {
        player.takeDamage(damage);
        player.gainExperience(reward);
    }

    public String getType() {
        return type;
    }
}
