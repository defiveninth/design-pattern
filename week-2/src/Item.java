/**
 * Represents an item that a player can collect and use.
 *
 * SOLID Principles Applied:
 * - SRP: Handles item properties and effects on the player.
 * - OCP: New item types can be added without modifying this class.
 * - LSP: Can create subclasses for different types of items.
 */
class Item {
    private String name;
    private int effect;

    public Item(String name, int effect) {
        this.name = name;
        this.effect = effect;
    }

    public void applyEffect(Player player) {
        if (name.equals("Health Elixir")) {
            player.restoreHealth();
        } else {
            player.gainExperience(effect);
        }
    }
}
