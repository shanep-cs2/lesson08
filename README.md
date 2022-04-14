# lesson08 - Polymorphism

## Overview

Polymorphism is one of the most powerful abstractions that exist in object oriented (OO)
programming. Polymorphism simply means many forms. One way to realized polymorphism is to create a
collection of objects that can consist of several different types that share the same base class or
implement the same interface. Thus, the objects all look like they are the same but if you iterate
through each of them and call the same method you can get different results! This may sound really
confusing and unnecessarily complex, but it enables software engineers to write really elegant code
and is an incredibly powerful tool!

## Important links

- [Lab Overview]()
- [Class Coding standards](https://shanep-cs2.github.io/docs/coding-standards.html)
- [Cloning and Submitting](https://shanep-cs2.github.io/docs/github.html)

## Learning Objectives

- Create polymorphic code
- Explore how inheritance enables polymorphism
- Create derived classes
- Use an ArrayList to from the Java API

## Test 1 - Implement a derived class

You are given an interface named **Student.java** and need to implement the classes CollegeStudent,
and GradeSchoolStudent. Each class will need to have a constructor created that will take **one**
argument to set the name of the student.

## Task 2 - Write Unit Tests

You need to complete the StudentTest Class with a few tests to your code is correct.

## Task 3 - Explore the App class

Explore the App class (which contains the main method) that will use an ArrayList collection to
store objects of the Student type. Note how each object **knows** what class it is even though the
ArrayList thinks it only has Students!

## Task 4 - Complete the Retrospective

Once you have completed all the tasks open the file **Retrospective.md** and complete each section
with a TODO comment. 

## Task 5 - Add, Commit, Push your code

Once you are finished you need to make sure that you have pushed all your code to GitHub for
grading!
