# Adventure Game

Adventure Game is a simple text-based RPG written in Java. The game allows a player to battle different types of enemies, earn experience points, and collect items.

## Features
- Player fights different enemies such as Skeletons, Zombies, and Vampires.
- Combat system where players and enemies take turns attacking.
- Experience points system for the player.
- Item system with collectible and usable items.
- Level management with randomized enemy encounters.

## Project Structure
```
/adventured-game
│── /src
│   ├── Main.java
│   ├── /combat
│   │   └── CombatManager.java
│   ├── /enemies
│   │   ├── Enemy.java
│   │   ├── Skeleton.java
│   │   ├── Vampire.java
│   │   ├── Zombie.java
│   ├── /items
│   │   ├── Item.java
│   │   ├── GoldCoin.java
│   │   ├── HealthElixir.java
│   ├── /level
│   │   └── LevelManager.java
│   ├── /player
│   │   └── Player.java
│   ├── /score
│   │   └── ScoreManager.java
│── .gitignore
│── adventured-game.iml
│── .idea/
```

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/defiveninth/design-pattern.git
   ```
2. Open the project in an IDE like IntelliJ IDEA or Eclipse.
3. Ensure Java is installed (Java 8 or higher recommended).
4. Run `Main.java` to start the game.

## How to Play
- The player starts with 100 health and 0 experience points.
- The game randomly spawns an enemy from Skeleton, Zombie, or Vampire.
- The player and enemy take turns attacking each other until one is defeated.
- If the player wins, they gain experience points based on the enemy defeated.
- Items like `Health Elixir` can be used to restore health.

## Contributing
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.

## License
This project is open-source and available under the MIT License.

## Author
Developed by XBDURRXUF I.
