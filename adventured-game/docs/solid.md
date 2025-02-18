# SOLID Principles in Object-Oriented Design

SOLID is a set of five design principles that help in creating more maintainable, flexible, and scalable software.

## 1. Single Responsibility Principle (SRP)
**A class should have only one reason to change.**
- Each class should only focus on a single responsibility.
- Example: A `Player` class should handle player-specific logic, while a `ScoreManager` should handle scoring.

## 2. Open/Closed Principle (OCP)
**Software entities should be open for extension but closed for modification.**
- New functionality should be added through extensions rather than modifying existing code.
- Example: Using polymorphism, new enemy types can be added without modifying the base `Enemy` class.

## 3. Liskov Substitution Principle (LSP)
**Objects of a superclass should be replaceable with objects of a subclass without altering correctness.**
- A subclass should maintain the behavior expected from the parent class.
- Example: A `Vampire` should behave like a general `Enemy` without breaking functionality.

## 4. Interface Segregation Principle (ISP)
**Clients should not be forced to depend on interfaces they do not use.**
- Large interfaces should be split into smaller, more specific ones.
- Example: Instead of a `Character` interface with unrelated methods, separate interfaces for `Attacker` and `Healer` can be created.

## 5. Dependency Inversion Principle (DIP)
**High-level modules should not depend on low-level modules. Both should depend on abstractions.**
- Code should rely on abstractions rather than concrete implementations.
- Example: Instead of `LevelManager` directly creating `Skeleton`, `Zombie`, etc., it should depend on an `EnemyFactory` interface.

Following these principles helps in writing cleaner, modular, and testable code.

