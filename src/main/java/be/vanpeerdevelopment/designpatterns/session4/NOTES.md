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