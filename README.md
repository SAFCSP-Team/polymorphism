# Polymorphism


**Objective**

In this project, we will learn how to perform a **single action in different ways**.

**Concept**

| Concept   |      Resources |
|----------|:-------------:  |
|What is a Polymorphism |[Java Document Polymorphism](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)|
|Polymorphism in Java|[Polymorphism Concept](https://www.youtube.com/watch?v=jg4MpYr1TBc)|
|Polymorphism Fully Explained |[Polymorphism (Tutorial)](https://www.youtube.com/watch?v=jhDUxynEQRI)|


**Problem**

Create `Bank` class that has a method called `getRateOfInterest()` and apply the concept of polymorphism to perform the method in different ways possible

**Implementation**

* Create a superclass named `Bank` class that has a method called `getRateOfInterest()`.
* Subclasses of `Bank` can be `SNB` and `SAB`.
* Each subclass has its way of calculating the rate of interest.
* The subclasses can use the `getRateOfInterest()` method to find the rate for that bank.
* Print the rate of interest for each bank in the main method.

```java
class Main {
  public static void main(String[] args) {
          /* your code here */
  }
}
```
