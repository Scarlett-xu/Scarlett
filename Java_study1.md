<!-- vscode-markdown-toc -->
* 1. [My first program](#Myfirstprogram)
* 2. [ Data types:](#Datatypes:)
* 3. [Math method](#Mathmethod)
* 4. [ Creating object in java or C++:](#CreatingobjectinjavaorC:)
	* 4.1. [ *what is References to Objects in java?*](#whatisReferencestoObjectsinjava)
	* 4.2. [ NOTE](#NOTE)
	* 4.3. [ My feelings in first week:](#Myfeelingsinfirstweek:)

<!-- vscode-markdown-toc-config
	numbering=true
	autoSave=true
	/vscode-markdown-toc-config -->
<!-- /vscode-markdown-toc --># Java study (1)

##  1. <a name='Myfirstprogram'></a>My first program

````java
public class HelloWorld{
    public static void main(String args[]){
        System.out.println("HelloWorld!");
    }
}
````

##  2. <a name='Datatypes:'></a> Data types:

> **Data types specify the different sizes and values that can be stored in the variable. There are two types of data types in Java:**

![RUNOOB 图标](https://static.javatpoint.com/images/java-data-types.png)

>  Initial:
>
> ```java
> Integer vari = new Integer(5)
> ```
>
> Boxing:
>
> ```java
> int a = Integer.parseInt("123")
> String s = String.valueOf(123) //save String
> ```
>
> + Integer: 
>
>   `byteValue()` : return byte     
>
>   `shortValue()`: return short

##  3. <a name='Mathmethod'></a>Math method

``` java
Math.sqrt()
Math.cbrt() //calculate Cube
Math.pow(a,b)
Math.abs() //The absolute value
Math.ceil()
Math.floor()
Math.random() //get a num greater than 0 and less than 0
```

***

Q1. Why i=-15?

```java
int i=0xFFFFFFF1
System.out.println("i")
```

Q2.  In updated JDK, **`int, double, String, other classes`** could be used in the switch statement's expression.

```java
switch(expression){
    case value1: statement1;
    break;
}
```

***

##  4. <a name='CreatingobjectinjavaorC:'></a> Creating object in java or C++:

> In C++, we do not need to create ,using:
>
> ```c++
> Node i(t); //which means to create an object and initial it;
> ```
>
> In java, we use two statements:
>
> ```java
> FighterPlane fp;
> fp = new FighterPlane();
> ```
>
> Using `FighterPlane fp` to create a reference, which is saved on the **stack**; before we use this object reference, we have to assign an value or initial it, such as the second statement, `fp` is pointed to a new object's address, which is saved on the **heap**.
>
> After that, we can directly using `fp` to manipulate the new object.

###  4.1. <a name='whatisReferencestoObjectsinjava'></a> *what is References to Objects in java?* 

To understand this question, I list a text:

```java
import java.awt.Point;
 class ReferencesTest {
   public static void main(String[] arguments) {
     Point pt1, pt2;  //Two Point variables are created.
     pt1 = new Point(100, 100); //A new Point object is assigned to pt1. 
     pt2 = pt1;   //The value of pt1 is assigned to pt2.
     pt1.x = 200;
     pt1.y = 200;
     System.out.println("Point1: " + pt1.x + ", " + pt1.y);
     System.out.println("Point2: " + pt2.x + ", " + pt2.y);
   }
 }
```

The program's output:

```java
Point1: 200, 200
Point2: 200, 200
```

`pt2` is a reference to the same object as `pt1`. Either variable can be used to refer to the object or to change its variables.

###  4.2. <a name='NOTE'></a> NOTE

- A *reference* is an address that indicates where an object's variables and methods are stored. You aren't actually using objects when you assign an object to a variable or pass an object to a method as an argument. You aren't even using copies of the objects. Instead, you're using references to those objects.
- There are no explicit pointers or pointer arithmetic in Java, as there are in C and C++. By using references and Java arrays, however, most pointer capabilities are duplicated without many of their drawbacks.

***

###  4.3. <a name='Myfeelingsinfirstweek:'></a> My feelings in first week:

Firstly, I learned three features of java: **encapsulation, inheritance, polymorphism**. I also learned how to code a java program. There are something different between java and C++. I think Java's grammar is more  precise. I hope in next week I will have a further learning in array and class.

