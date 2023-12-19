# Observer

The Observer pattern is a behavioral design pattern that defines a one-to-many dependency between objects, so that when one object (the subject) changes state, all its dependents (observers) are notified and updated automatically. This pattern is commonly used to implement distributed event handling systems.

Let's break down the key components and concepts of the Observer pattern:

1. Subject:
   The subject is the object that holds the state and triggers the notifications to observers when its state changes.
   The subject maintains a collection of observers and provides methods to add, remove, and notify observers.

2. Observer:
   The observer is an interface or an abstract class that defines the contract for objects that want to be notified of changes in the subject.
   Observers register themselves with the subject to receive updates.

3. ConcreteSubject:
   The concrete subject is an implementation of the subject interface. It maintains the state and sends notifications to observers when the state changes.

4. ConcreteObserver:
   The concrete observer is an implementation of the observer interface. It registers with the subject to receive notifications and updates its state accordingly.

## Flow of Observer Usage

1. The client code creates instances of the subject and observers.

2. Observers register themselves with the subject to receive updates.

3. When the state of the subject changes, it notifies all registered observers.

4. Observers react to the notification and update their state or perform other actions.

## Benefits of Observer

- Loose Coupling:
  The Observer pattern promotes loose coupling between subjects and observers. Subjects don't need to know the specific classes of their observers.

- Extensibility:
  It allows for easy extensibility. New observers can be added without modifying the subject.

- Decentralized Communication:
  Observers communicate with the subject in a decentralized manner, allowing for a more flexible and scalable system.

The Observer pattern promotes loose coupling between the subject and observers, allowing for a flexible and scalable design where multiple observers can respond to changes in the subject independently.

Pola Pengamat adalah pola desain perilaku yang mendefinisikan ketergantungan satu-ke-banyak antara objek, sehingga ketika satu objek (subjek) mengubah status, semua tanggungannya (pengamat) diberitahu dan diperbarui secara otomatis. Pola ini biasanya digunakan untuk mengimplementasikan sistem penanganan kejadian terdistribusi.

### Conclusion

The Observer pattern is a powerful tool for building systems where multiple objects need to react to changes in the state of another object. It enhances flexibility, maintainability, and scalability by promoting loose coupling between components.
