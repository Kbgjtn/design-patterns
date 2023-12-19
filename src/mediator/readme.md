# Mediator Design Pattern

The Mediator pattern is a behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object. This promotes a more structured and modular system by centralizing communication logic.

## Key Components

1. **Mediator:**

   - The mediator is an interface or an abstract class that defines the contract for communication between objects.
   - It encapsulates the interaction logic and maintains references to the objects it mediates.

2. **ConcreteMediator:**

   - The concrete mediator is an implementation of the mediator interface. It coordinates communication between objects and manages their interactions.

3. **Colleague:**

   - The colleague is an interface or an abstract class that defines the contract for objects that need to communicate with each other.
   - Colleagues don't communicate directly; instead, they communicate through the mediator.

4. **ConcreteColleague:**
   - The concrete colleague is an implementation of the colleague interface. It interacts with the mediator to communicate with other colleagues.

## Flow of Mediator Usage

1. Colleagues register themselves with the mediator.

2. When a colleague needs to communicate with another colleague, it sends a message to the mediator.

3. The mediator processes the message and communicates with the appropriate colleague or colleagues.

4. Colleagues react to the mediated communication and perform necessary actions.

## Example Use Case: Air Traffic Control System

Consider an air traffic control (ATC) system where planes (colleagues) need to communicate with each other to avoid collisions. The ATC tower (mediator) coordinates communication between planes, ensuring safe and organized air traffic.

```java
// Mediator (ATC Tower)
class AirTrafficControl {
    // ... implementation details
}

// Colleague (Aircraft)
interface Aircraft {
    // ... methods for communication with the mediator
}

// Concrete Colleague (Airplane)
class Airplane implements Aircraft {
    // ... implementation details
}

// Another Concrete Colleague (Helicopter)
class Helicopter implements Aircraft {
    // ... implementation details
}
```
