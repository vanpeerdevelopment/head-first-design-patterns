# Session 2 (05/12/2017)
Facilitator: Matthias

## Chapters
2. The Observer Pattern: Keeping your Objects in the know
3. The Decorator Pattern: Decorating Objects

## Notes
### 2. The Observer Pattern: Keeping your Objects in the know
- The *Observer pattern* is publishers and subscribers. Publishers are called *subjects* and subscribers are called *observers*
- *Loose coupling*  
  When two objects are loosely coupled, they can interact, but have very little knowledge of each other
- *Subject interface*  
  Three methods: `registerObserver(Observer observer)`, `removeObserver(Observer observer)`, `notifyObservers()`
- *Observer interface*  
  One method: `update(...)`
- *Push*: the subject can push all data to the `update(...)` method  
  Not all observers interested in same state  
  Difficult to anticipate all necessary data
- *Pull*: the observers can pull the data they need from the subject  
  Subject has to expose the necessary state
  Observers can get the exact state they are interested in
- *Java built-in support*: `Observer class` and `Observable interface`  
  No generics, passing data as `Object` which can be null and subject as `Observable` without knowing its concrete type
- *Swing*  
  register `Listener`: inner class, anonymous class, lambda    
- **Observer**  
  Defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically 

### 3. The Decorator Pattern: Decorating Objects
- *Classes should be open for extension, but closed for modification*  
  Goal is to allow classes to be easily extended to incorporate new behavior without modifying existing codes
  Following the Open-Closed Principle usually introduces new levels of abstraction, which adds complexity to our code. You want to concentrate on those areas that are most likely to change in your designs and apply the principles there.
- Have a abstract class or interface defining the api. Implement the concrete subclasses. Add a decorator subclass with an instance variable for the decorated abstract class and implement concrete decorators
- Decorators are typically transparent to the client of the component; that is, unless the client is relying on the component’s concrete type
- **Decorator**  
  Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.