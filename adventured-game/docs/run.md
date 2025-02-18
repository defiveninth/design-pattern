# How to Compile and Run the Adventure Game

## Prerequisites
- Ensure you have **Java 8 or higher** installed.
- Add Java to your system's `PATH` if not already configured.

## Compilation Steps
1. Open a terminal or command prompt.
2. Navigate to the project directory:
   ```sh
   cd path/to/adventured-game/src
   ```
3. Compile all `.java` files:
   ```sh
   javac -d ../bin $(find . -name "*.java")
   ```

## Running the Game
1. Navigate to the `bin` directory where the compiled files are located:
   ```sh
   cd ../bin
   ```
2. Run the game:
   ```sh
   java Main
   ```

Enjoy the game!