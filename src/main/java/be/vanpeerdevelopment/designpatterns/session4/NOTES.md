# Session 4 (16/01/2018)
Facilitator: Thomas

## Chapters
6. The Command Pattern: Encapsulating Invocation
7. The Adapter and Facade Patterns: Being Adaptive

## Notes
### 6. The Command Pattern: Encapsulating Invocation
- Separate an object making a request from the objects that receive and execute those requests.
- *Client* creates the *command*. *Command* binds together the *actions* and the *receiver*. The client *sets the command* on an *invoker*. The invoker *executes* the command object at some point which will result in the actions being invoked on the receiver.
- **Command Pattern**:  
  Encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.
- **Null object**:  
  Useful when you don’t have a meaningful object to return, and yet you want to remove the responsibility for handling null from the client.
- **Macro command**:  
  Command that holds a list of other commands and can execute and undo them.
- Command objects can be replaced by lambdas or even function references to avoid having to create all command classes. Only possible when the command interface has only one method. The parameters and return value of the lambda have to match those of the interface.

### 7. The Adapter and Facade Patterns: Being Adaptive
- **Object Adapter**:  
  Converts the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interface. Can adapt any adaptee subclass.
- **Class Adapter** (needs multiple inheritance):  
  Subclass the Target and the Adaptee, while with object adapter we use composition to pass requests to an Adaptee. Can only adapt one adaptee subclass.
- **Facade**:  
  Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
  Avoid tight coupling between clients and subsystems.
  The facade provides a simplified interface while still exposing the full functionality of the system to those who may need it.
- *Principle of Least Knowledge a.k.a. Law of Demeter*:  
  Talk only to your immediate friends.
  Only invoke methods that belong to the object itself, objects passed in as paramater to the method or an object the methode creates.
  Prevents us from creating designs that have a large number of classes coupled together so that changes in one part of the system cascade to other parts.
  Not to call methods on objects that were returned from calling other methods.