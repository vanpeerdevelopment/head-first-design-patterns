# Session 2 (05/06/2017)
Facilitator: Matthias

## Chapters
2. The Observer Pattern: Keeping your Objects in the know
3. The Decorator Pattern: Decorating Objects

## Notes
**2. The Observer Pattern**
* _The Observer pattern_ defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.
* Strive for loosely coupled designs between objects that interact.
* Pull vs push
* Observer and Observable in Java API (can be useful, but has some side-effects, so be careful).

**3. The Decorator Pattern**
* _The open-closed principle_: Classes should be open for extension, but closed for modification.
* _The Decorator pattern_ attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
* Caveat:
  * A lot of small classes, e.g. Java I/O libraries.
  * Typing problems: don't introduce decorators in code that is dependent on specific types.
  * Instantiating can be complex, but can be solved with Factory or Builder pattern.

