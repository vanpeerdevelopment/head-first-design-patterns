# Session 3 (20/12/2017)
Facilitator: Matthias

## Chapters
4. The Factory Pattern: Baking with OO Goodness
5. The Singleton Pattern: One of a Kind Objects 

## Notes
### 4. The Factory Pattern: Baking with OO Goodness
- By encapsulating object creation in a factory class, object creation is the responsibility of this one class and doesn't need to be scattered all over the code.  
  The factory class is the only place where the `new` keyword needs to be used.
- *Static factory*:  
  Class that has a static method that takes care of object creation. This way you don't need to instantiate an object to be able to use the factory method.   
  But you also don't have the possibility to subclass the factory and override the create method.
- *Simple factory*:  
  Class that takes care of object creation by providing a non-static method. 
- **Factory method**:  
  A factory method handles object creation and encapsulates it in a subclass. This decouples the client code in the superclass from the object creation code in the subclass.
  The abstract creator class contains code that depends on an abstract product. Creation of this abstract product is done by an abstract factory method.
  The concrete creators will subclass the abstract creator and implement the abstract factory method by creating the correct concrete product.
- *Abstract Factory*:  
  Gives us an interface for creating a family of products. By writing code that uses this interface, we decouple our code from the actual factory that creates the products. That allows us to implement a variety of factories that produce products meant for different contexts.
- *Dependency Inversion Principle*: Depend upon abstractions. Do not depend upon concrete classes.  
  No variable should hold a reference to a concrete class.
  No class should derive from a concrete class.
  No method should override an implemented method of any of its base classes.

### 5. The Singleton Pattern: One of a Kind Objects
- *Singleton*: ensures a class has only one instance, and provides a global point of access to it.
- When `getInstance()` is called in different threads it is possible every thread checks the instance is null and creates its own instance.  
  This can be solved:
   - by making `getInstance()` syncrhonized. This will make sure the code is only executed by one thread at once.
   - by creating the instance eagerly
   - by using double checked locking, we first check to see if an instance is created, and if not, then we synchronize