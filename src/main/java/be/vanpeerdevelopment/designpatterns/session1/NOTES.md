# Session 1 (21/11/2017)
Facilitator: Dieter

## Chapters
0. How to Use This Book: Intro (1-45)
1. Intro to Design Patterns: Welcome to Design Patterns (46-79)

## Agenda
1. Discuss read chapters and handle questions
2. Go over the design toolbox (74): OO basics, 00 principles, OO patterns
3. Refactor the strategy exercise making use of the strategy pattern keeping the tests green
4. Where are these patterns applied/applicable in vdab projects
5. First impressions of the book
6. Plan session 2: date, chapters, facilitator

## Notes
### 0. How to Use This Book: Intro (1-45)
Quite a lot of text and explanation how the book is written and which techniques are applied to let you remember the content more easily.  

### 1. Intro to Design Patterns: Welcome to Design Patterns (46-79)
- *Identify the aspects of your application that vary and separate them from what stays the same*  
  Advantage: avoid that a localized update causes a nonlocal side effect  
  Advantage: promote reuse of code, avoid duplication  
  Advantage: get a good overview of all possible behaviors/strategies; each set of behaviors can be seen as a family of algorithms which can be used interchangeably  
  e.g. the different fly and quack behaviors each get their own class, while the duck class stays the superclass of all ducks the common aspects: swim and display
- *Program to an interface, not an implementation*  
  Advantage: the actual runtime object isn’t locked into the code and can be changed   
  e.g. duck behaviors will live in a separate class that implements a particular behavior interface which can be used in the Duck superclass and be changed at runtime using a setter
- *Favor composition over inheritance*  
  Advantage: promote reuse of code  
  e.g. the initial behavior can be set in the constructor of a concrete duck, and possible overwritten using the setter. Duck will now delegate its flying and quacking behavior, instead of using quacking and flying methods defined in the Duck class (or subclass).
- **Strategy**  
  The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
  
  
Exercise
- extract behavior/strategy in an interface with concrete subclasses
- add the behaviors as a field to the abstract super class, init them in the concrete class constructor
- delegate to the behavior
- add setter to change strategy at runtime 