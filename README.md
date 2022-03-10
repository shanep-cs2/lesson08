# lesson08 - Polymorphism

## Overview

Polymorphism is one of the most powerful abstractions that exist in object oriented (OO)
programming. Polymorphism simply means many forms. One way to realized polymorphism is to create a
collection of objects that can consist of several different types that share the same base class.
Thus, the objects all look like they are the same but if you iterate through each of them and call
the same method you can get different results! This may sound really confusing and unnecessarily
complex, but it enables software engineers to write really elegant code and is an incredibly
powerful tool!

## Videos

- [Lab Overview]()

## Learning Objectives

- Create polymorphic code
- Explore how inheritance enables polymorphism
- Create derived classes
- Use an ArrayList to from the Java API

## Task 1 - Write Unit Tests

You need to complete the PlantTest and TreeTest classes to ensure that your code is correct. Once
you have your tests written you can move on to complete the Plant and Tree classes

## Test 2 - Implement a derived class

Given a base Plant class your job is to implement a derived Tree class and complete the methods.

## Task 3 - Implement the App class

Complete the App class (which contains the main method) that will use an
ArrayList collection to store objects that belong to either the Plant class or the
Tree class.

```java
ArrayList<Plant> plants = new ArrayList<Plant>();
```

The code above takes advantage of Java generics to make our code simpler. You are not expected to
understand generics yet, we will formally study generics in a later module. In the App class create
a method called `printAllPlants()`, that will iterate through all the plants in the `plants`
ArrayList and call `printPlant()`.  Finally your program should be able to read plants from standard
input and create either a Plant class or a Tree class.

## Task 3 - System testing

Just as you did in the previous lab you are going to do some system testing using the terminal using
input [redirections](https://www.gnu.org/software/bash/manual/html_node/Redirections.html) to have
our program read from a file without having to type everything in by hand.  There is a sample text
file in your repository that you can use for testing.
