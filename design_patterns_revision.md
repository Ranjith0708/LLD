# Design Patterns

## What is a Design Pattern?
A design pattern is a general, reusable solution to a commonly occurring problem within a given context in software design. It is not a finished design that can be directly transformed into code, but rather a template for how to solve a problem in various situations. Design patterns help improve code readability, reusability, and maintainability.

## Types of Design Patterns
Design patterns are generally classified into three main categories:

### 1. Creational Patterns
- **Purpose:** Deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.
- **Examples:** Singleton, Factory Method, Abstract Factory, Builder, Prototype

### 2. Structural Patterns
- **Purpose:** Concerned with how classes and objects are composed to form larger structures.
- **Examples:** Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy

### 3. Behavioral Patterns
- **Purpose:** Focus on communication between objects, what goes on between objects and how they operate together.
- **Examples:** Observer, Strategy, Command, Iterator, Mediator, Memento, State, Template Method, Visitor, Chain of Responsibility, Interpreter

---

## Factory Design Pattern (Creational)
The Factory Design Pattern is a creational pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. It is used when the exact type of the object to be created is determined at runtime.

### Example (Java)
Suppose you have an interface `Shape` and multiple implementations like `Circle` and `Rectangle`. The Factory Pattern can be used to create objects of these classes without exposing the instantiation logic to the client.

```java
// Shape.java
public interface Shape {
    void draw();
}

// Circle.java
public class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

// Rectangle.java
public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// ShapeFactory.java
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}

// Usage
ShapeFactory shapeFactory = new ShapeFactory();
Shape shape1 = shapeFactory.getShape("CIRCLE");
shape1.draw(); // Output: Drawing Circle
Shape shape2 = shapeFactory.getShape("RECTANGLE");
shape2.draw(); // Output: Drawing Rectangle
```

### When to Use?
- When the exact type of object to create is not known until runtime.
- When you want to centralize object creation logic to improve code maintainability.

---
This file is for quick revision of design patterns, their types, and the Factory Design Pattern.
