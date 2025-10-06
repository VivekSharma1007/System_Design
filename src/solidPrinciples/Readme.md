## Solid-Principles

These are set of 5 design principles which aims for maintainability, 
scalability and robustness of the object-oriented code.

### S -> Single Responsibility Principle: 
- The class should only be responsible for one change only.
- That means class should have only one responsibility and one purpose only.

Real Life Example: Chef is cooking, cleaning, and serving,
Instead he must be responsible for only cooking.

#### SRP is not just applicable on classes, its applicable to methods, modules, microservices, and entire systems.

#### Key concept is every component has the single responsibility and changes do not affect other things.

### O -> Open Closed Principle:
- Software entities (classes, modules, functions) should be open for extension and closed for 
modifications.
- This means the behaviour of the entity is that its open for extending the behaviour, 
but it should not break the current functionality so that it won't break the existing systems.

Real life example: You travel to UK, but your phone charger doesn't work in UK Sockets, 
so you buy the adaptor to work with your charger in UK sockets.
Here we do not change the charger but extended the use of it to work in UK.

#### When to use:
- When there will be changes required in technical requirements, when business evolves.
- There will be need to modify functionalities without changing the already tested code.
- While building frameworks, plugins, or extensible systems, billing engines, tax calculators, 
UI components.

### Liskov Substitution Principle:

- Any base class should be substitutable to its base(parent) class without breaking the 
correctness of the program.
- T is parent clas, S is child class 
Generally T obj = new T();
with LSP: T obj = new S(); should also work without breaking the functionalities or correctness of program
- This principle ensures that derived classes extend the base class without changing its
behaviour.
- And if the parent reference is used for the child object, the functionality should not break.

- e.g: Payment class with processPayment() and another classes like UPI, CreditCard
Payment pay = new UPI();

### Interface Segregation Principle:

- A class should not be forced to implement interface that it don't use.
- Rather than having large, monolithic interfaces, we should have smaller and more specific interfaces.
- This prevents unnecessary implementation in classes that they don't need.

#### When to use:

- When classes are implementing irrelevant functionalities.
- When modification in one method of interface, force the changes in non-related classes.

### Dependency Inversion Principle: 

- High level modules should not depend on low level modules.
- Both should depend on abstractions.
- Abstraction should not depend upon details.
- Details should not depend upon abstractions.
- High-Level Modules: The parts of your code that contain the core logic.
- Low-Level Modules: The ones that handle the details — like talking to a database, making API calls, reading files, or providing data.