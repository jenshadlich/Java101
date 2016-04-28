# Java 101
Some basics.

## What is Java?

* General purpose programming language
* Object-oriented
* Class-based
* "Write once, run anywhere"
    * Compiled to bytecode, runs on a Java Virtual Machine (JVM)
* Automatic memory management
* Syntax similar to C++

## The origins of Java and it's meaning today

* Designed by James Gosling at Sun Microsystems (acquired by Oracle)
* JDK 1.0 was released on January 23, 1996 (Beta in 1995)
* "Oak"
* Java Applets
* Today
    * most popular programming language together with C
    * currently Java 8 (6 + 7 still widely used)
    * Android

## Simple declarations

```
int i, j;
boolean b;
double d;
char c;
```

```
float f;
long l;
```

## Expressions and assignments

```
i = 1 * (2 + 3);
b = true;
d = 2.0;
ch = 'j';
```

```
String s = "Hello World!"; // declaration and assignment
```
Strings are not arrays of char in Java (unlike C).

## Classes

* Object-oriented programming
* `class`
* `new`
* Single inheritance
* `extends`

```
public class Apple {
}
```

```
Apple apple = new Apple(); // create an instance of Apple
```

Add a base class Fruit:
```
public class Fruit { // base class
  private String name; // name 'attribute'
}
```

Make Apple inherit from Fruit
```
public class Apple extends Fruit { // sub-class
}
```

```
Fruit fruit = new Apple();
```

```
public class Fruit {

  public Fruit(String name) { // constructor with parameter
    this.name = name;
  }

}
```


## Visibility

* Access level modifiers
    * `public`
    * `private`
    * `protected`
    * `package`
* Only one public class per file

## Interfaces

* `interface`
* `implements`
* One class can implement multiple interfaces
* Side discussion
    * "Strategy" design pattern
    * Dependency injection

## Comments

```
// single line comment
```

```
/*
  block comment 
 */
```

## Variables

* Instance variables
* Class variables
* Local variables
* Naming
    * case-sensitive
    * must start with letter, underscore or `$` sign
    * unlimited-length sequence of Unicode letters and digits
* convention: camelCase

```
public class DifferentKindOfVariables {

    private int foo = 0;        // instance variable
    private static int BAR = 0; // class variable

    public void someMethod() {
        int fooBar = foo + BAR; // local variable
   }

}
```

## Flow control

### Loops

* `for`, `while`, `do`/`while`, `for`(each)
* `break`, `continue`

```
for (int i = 0; i < 10; i++) {
  // ...
}
```

```
boolean condition = true;
do {
  // ...
} while(condition);
```

```
boolean condition = true;
while (condition) {
  // ...
}
```

### Switch

* `switch`, `case`, `default`

```
String var = "someValue";
switch (var) {
  case "firstCase":
    // ...
    break;
  case "someOtherCase":
    // ...
    break;
  default:
    // ...
}
```

## Exceptions

* Error != Exception
* Exception (checked)
* RuntimeException (unchecked)
* `throws`
* `try`, `catch`, (`finally`)

```
try {
  // some exception could occur
} catch(Exception e) {
  // handle the exception
}
```

```
public class MyException extends Exception {
  // ...
}
```

## The Java ecosystem

### Maven
* https://maven.apache.org/
* `pom.xml` file
* artifacts and dependencies
* plugins

```
mvn clean install
```

### Libraries and frameworks

* Spring Framework
* Apache Commons
* Guava
* JUnit
* Eclipse RCP

### Other JVM languages

* Scala
* Clojure
* JRuby
* Kotlin

## Getting started

* Get JDK
* Get IDE, e.g. IntelliJ IDEA

## Further information

* https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html
* http://openbook.rheinwerk-verlag.de/javainsel/
