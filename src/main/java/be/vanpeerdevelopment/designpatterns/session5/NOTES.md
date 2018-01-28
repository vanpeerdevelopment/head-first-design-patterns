# Session 5 (30/01/2018)
Facilitator: Sander

## Chapters
9. The Iterator and Composite Patterns: Well-Managed Collections

## Notes
### 9. The Iterator and Composite Patterns: Well-Managed Collections
- **Iterator**:  
  Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation. Iterators imply no ordering or uniqueness.
- *java.util.Iterator*  
  - `hasNext()`
  - `next()`
  - `remove()`: optional, can throw an `UnsupportedOperationException`
- *java.util.Iterable*
  - `iterator`
- *Single responsibility*  
  A class should have only one reason to change.
- **Composite Pattern**:  
  Allows you to compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
- A composite contains components. A component can be a leaf or composite. All components must implement the Component interface; however, because leaves and nodes have different roles we can’t always define a default implementation for each method that makes sense. Sometimes the best you can do is throw a runtime exception.