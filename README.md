**Design Patterns**

Design Patterns offer reusable solutions to common problems.
It provides fail safe solutions for the problem.
While Design Principles ensure a flexible and adaptable codebase.

It can be broadly classified into 3 parts - 


1. Creational
2. Structural
3. Behavioural




<u>**1. Creational Design Pattern**</u>

Ways of creating objects.
These patterns helps us to identify the correct process how the object should create while instantiating the class.Ex =>
List<Integer> list = new ArrayList<>();

Using new keyword also falls under Creational Design Pattern









**1. Factory Pattern**


In Factory Class as we can see, the main class basically the client. Doesn’t require to know which object it need to create. It will ask the factory for an object. And it the duty of factory to provide the object to the client class.

For Code Reference - 
[Factory Pattern Implementation](https://github.com/arkadip302/Design-Pattern-Implementaions/tree/main/Cretaional_Design_Pattern/Factory_Design_Pattern)

It is also known as virtual Contructor. 










**2. Abstract Factory Pattern**

Abstract Factory is basically a factory of factories.
Main class will first call a factory of factories. To get the right factory.
Factory Producer decides which Factory to provide based on business condition.
Then factory will provide the instance of the actually class.

For Code Reference - 
[Abstract_Design_Pattern](https://github.com/arkadip302/Design-Pattern-Implementaions/tree/main/Cretaional_Design_Pattern/Abstract_Design_Pattern)



**3. Singleton Pattern**

Singleton Pattern solidifies the idea of creating a single instance of any class and using it everywhere.

Idea behind is that, having a single instance decreases the load of object management and all the states will be updated to one and only object.

For Code Reference - 
[Singleton Design Pattern](https://github.com/arkadip302/Design-Pattern-Implementaions/tree/main/Cretaional_Design_Pattern/Singleton_Design_Pattern)


**4. Prototype Pattern**



Prototype Pattern works on the idea of having a cloned instance of an object keeping performance in mind, as sometime creating a new object with NEW keyword is costly.
Mainly used in caching purpose.

EX=> we are calling a database and trying to fetch objects and its a hardcoded query that provides same response everytime. We can create one object and the same time create a clone object and use that clone one from next time onwards.



For Code Reference - 
[Prototype_Design_Pattern](https://github.com/arkadip302/Design-Pattern-Implementaions/tree/main/Cretaional_Design_Pattern/Prototype_Design_Pattern)


**5. Builder Pattern**

Builder pattern helps to break down complex objects to different levels. So that, each level can be worked on in a singular level.

Builder - Provides Basic Infomation.<br>
Concrete Builder - Takes care of bit more complex actions than Builder. It’s a layer over Builder to provide extra functionality to builder.

Director - Job is to contact the right concrete builder and return the complex object to the client.

For Code Reference - 
[Builder_Design_Pattern](https://github.com/arkadip302/Design-Pattern-Implementaions/tree/main/Cretaional_Design_Pattern/Builder_Design_Pattern)
