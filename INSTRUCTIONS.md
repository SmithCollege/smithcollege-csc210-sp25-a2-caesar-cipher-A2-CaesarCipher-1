# Assignment 2: Caesar Cipher
CSC 210, Spring 2025

For the next two assignments, we are going to build on the prototype for a DynamicArray class that you designed in A1.
For this assignment, you will focus on how we get and set values in an array as well as how we can use an offset to adjust the index.

This week, you will create a Caesar Cipher, a simple cryptographic tool.
Your Caesar Cipher will allow you to encrypt or decrypt each letter in a message using a key.
The key tells you how many letters to offset the alphabet.
For example, if the offset was 1, then we would translate A --> Z, B --> A, and C --> B.
If the offset was 3, we would translate A --> X, B --> Y, C --> Z and D --> A.

![Image of a Casesar Cipher from Geeks for Geeks](caesarCipher-geeksforgeeks.png "Caesar Cipher")

Working through this homework will hopefully allow you to practice many of the Java and object-oriented programming skills you developed in CSC 120.
We will also take some skills, such as writing unit tests, to a new level.

## Part 0: File System Structure

We are introducing a new concept this week: Gradle.
Gradle is a build automation tool designed to support developers in building, testing, and deploying software.
Gradle and a similar tool called Maven are very popular among Java developers in software engineering roles.

For now, to work with Gradle, there are only a few things you'll need to change:
1. You will need to install the `Gradle for Java` extension in VSCode. It is developed by Microsoft and the icon is an elephant. (If you are using a different IDE, it will also have some sort of gradle plugin).
2. Instead of running code using the run arrow at the top of the VSCode menu, you'll need to run it using the Gradle menu on the left-hand side of VSCode (elephant icon). Each time you want to change something in your code, you will need to instruct Gradle to `build` the project. Then, you can ask it to `run` or `test` your code.
3. It is imperative that all of your classes are in the following location within the `A1-Distro` folder (or whatever your main project folder is called): `app/src/main/java/a1template`. The only exception is the classes containing tests, which must be located in `app/src/test/java/a1template`. If you put a file in the wrong place, the project will not build. For this week, you do not need to make any new files, but please start thinking about how you structure file directory and double-checking where you have created a file.

## Part 1: Implement the Interface

Look at the class `IndexAccess.java`.
This interface outlines several of the common operations we discussed that you would need to provide ArrayList-like functionality using a base-type array.
For this assignment, you are asked to implement `IndexAccess` in the class `DynamicArray.java`.
DynamicArray should be written to work for any generic object.
Your first step in doing this week will be to create stubs for all of the methods described in the interface. 

- Stub: A short method definition that has the correct call signature and the minimal implementation required for clean compilation. When you implement an interface, you will need to make sure that every method in the interface is present in your implementation class. Otherwise, your code will fail to compile. Additionally, you'll need to make sure you return something of the correct type. For example, a `stub` of a method that returns an integer could just `return 0;`. As you develop your code, you will replace this with your actual implementation of the method.

By making stubs first, you will be able to run and test your code even if you haven't written all the methods yet. In some places, we have written stubs for you -- as you develop your code, you will want to remove the dummy return statements we included.

### Part 1b: Testing Your Methods

We have provided tests for the DynamicArray methods in `DynamicArrayTests`. 
As you develop your code, make sure you are running these tests to ensure that your methods pass.
It will make your life much, much easier if you make sure that your code passes tests as you write each method, rather than running all the tests at the end.
You can run tests either by clicking the green arrows next to the tests when you open the `DynamicArrayTests` class, or you can also use gradle to run `test`.
You will also see the tests run when you submit your code on GitHub Classroom.

## Part 2: Designing the CaesarCipher Class

Now you will create a class that uses a DynamicArray to implement the Caesar Cipher.
Don't make changes to the DynamicArray class that are specific to what you are doing in the CaesarCipher -- we will continue building on DynamicArray next week for a completely separate task.
Instead, think of DynamicArray like the ArrayList class you have interacted with in the past, and keep all methods specifically related to Caesar Cipher separate.

For this week, we have defined instance variables for you -- but you will need to write a constructor to initialize them.
We have also provided stubs for a minimum set of methods that you would need to implement a Caesar Cipher that can both encode and decode messages.
Please note, when encoding a message, it will be MUCH easier if you keep it in all lowercase.
For an extra challenge, consider adding in the checks needed to ensure that a message is all in lowercase, or even think about how you could add on to your approach to retain the capitalization!

### Part 2b: Testing Your Methods

As you write each method, you should try running the tests provided to make sure you are getting the answers expected.
It can sometimes take a little trial and error to get a method that works in all cases you are likely to encounter.

### Part 2c: Writing Your Own Tests

Can you think of additional `edge cases`, or specific problems that could introduce bugs, that you would also want to test?
Include at least two messages for encoding and two messages for decoding in the class `YourTests.java`.
We will have other students run your tests to see if you get the same answers.
(Make sure to test the tests on your own code first!)
