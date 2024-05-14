Behavioural design patterns ensure effective communication between different objects in a system, assign responsibilities to them, and make sure they all have synchronized information.



1. Chain of Responsibility (ATM money withdrawl)
2. Command Pattern           (AirCondition Remote)
3. Iterator Pattern
4. Mediator Pattern          (Auction System)
5. Memento Pattern
6. Observer Pattern          (Amazon Notify Button)
7. State Pattern             (Vending Machine)
8. Strategy Pattern          (Normal Drive, Special Drive)
9. Template Method Pattern
10. Visitor Pattern

1. Chain of Responsibility
    Lets you pass requests along a chain of handlers. Upon recieving a request, each handler
    decide either to process the request or to pass it to the next handler in the chain.

2. Command Pattern
    Turn a request into a stand-alone object that contains all information about the request.
    This information lets you pass requests as a method arguments, delay or queue a request's
    execution, and support undoable operations.

3. Iterator Pattern
    Lets you traverse elements of a collection without exposing its underlying representations
    (list, stack, tree, etc.)

4. Mediator Pattern
    Lets you reduce chaotic dependencies between objects. The pattern restricts direct 
    communications between the objects and forces them to collaborate only via a mediator object

5. Memento Pattern
    Lets you save and restore the previous state of an object without revealing the details of its imlemntation.

6. Observer Pattern
    Lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they're observing.

7. State Pattern
    Lets an object alter its behavior when its internal state changes. It appears as if the oject changes its class

8. Strategy Pattern
    Lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable

9. Template Method
    Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure

10. Visitor Pattern
    Lets you separate algorithm from the objects on which they operate.