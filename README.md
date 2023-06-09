# Design-Patterns
A design pattern is a reusable solution to a commonly occurring problem in software design. It is a general solution that can be adapted and applied to a wide range of different situations.

Design patterns provide a way to communicate and share knowledge about common software design problems and their solutions. They can help to ensure that your software is flexible, maintainable, and easy to understand by providing proven solutions to common problems.

Design patterns provide a way to communicate and share knowledge about common software design problems and their solutions. They can help to ensure that your software is flexible, maintainable, and easy to understand by providing proven solutions to common problems.

<h1>Creational Patterns:</h1>

<h3>1. Abstract Factory</h3> 
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
<h3>2. Builder</h3> 
Separates the construction of a complex object from its representation so that the same construction process can create different representations.
<h3>3. Factory Method</h3> 
Defines an interface for creating objects but allows subclasses to decide which class to instantiate.
<h3>4. Prototype</h3> 
Creates new objects by cloning existing ones.
<h3>5. Singleton</h3>
Ensures that a class has only one instance, and provides a global point of access to it.

<h1>Structural Patterns</h1>
<h3>6. Adapter</h3>
Converts the interface of a class into another interface clients expect.
<h3>7. Bridge</h3>
Decouples an abstraction from its implementation so that the two can vary independently.
<h3>8. Composite</h3>
Composes objects into tree structures to represent part-whole hierarchies.
<h3>9. Decorator</h3>
Attaches additional responsibilities to an object dynamically.
<h3>10. Facade</h3>
Provides a unified interface to a set of interfaces in a subsystem.
<h3>11. Flyweight</h3> 
Reduces the cost of creating and manipulating large numbers of similar objects.
<h3>12. Proxy</h3>
Provides a surrogate or placeholder for another object to control access to it.

<h1>Behavioral Patterns</h1>
<h3>13. Chain of Responsibility</h3>
Avoids coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.
<h3>14. Command</h3>
Encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
<h3>15. Interpreter</h3>
Defines a representation for a grammar as well as the mechanism to interpret the grammar.
<h3>16. Iterator</h3>
Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
<h3>17. Mediator</h3>
Defines an object that encapsulates how a set of objects interact.
<h3>18. Memento</h3> 
Captures and externalizes an object's internal state so that it can be restored later, all without violating encapsulation.
<h3>19. Observer</h3> 
Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
<h3>20. State</h3> 
Allows an object to alter its behavior when its internal state changes.
<h3>21. Strategy</h3> 
Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
<h3>22. Template Method</h3> 
Defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
<h3>23. Visitor</h3>
Defines a new operation to a class without changing the class by putting the operation in a separate object.


**********************
<pre>
├── src 
     |
    main
     |
   kotlin
     |
 Behavioral
     ├── Chain of responsibility
     ├── Command
     ├── Interpreter
     ├── Iterator
     ├── Mediator
     ├── Memento
     ├── Observer
     ├── State
     ├── Strategy
     ├── Template method
     ├── Visitor
     |
  Cerational   
     ├── Builder
     ├── Factory and abstract factory
     ├── Prototype
     ├── Singleton
     |
  Stractural 
     ├── Bridge
     ├── Adapter
     ├── Composite
     ├── Decorator
     ├── Facade
     ├── Fly weight
     └── Proxy
<pre/>
