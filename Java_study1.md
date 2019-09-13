# Java study (the first week)

### 1. My first program

````java
public class HelloWorld{
    public static void main(String args[]){
        System.out.println("HelloWorld!");
    }
}
````

### 2. Relationship between basic data types and packages

>  initial:
>
> ```java
> Integer vari = new Integer(5)
> ```
>
> boxing:
>
> ```java
> int a = Integer.parseInt("123")
> String s = String.valueOf(123) //save String
> ```
>
> + Integer: 
>
>   byteValue() : return byte     
>
>   shortValue(): return short

### 3. Math method

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

Q1. why i=-15?

```java
int i=0xFFFFFFF1
System.out.println("i")
```

Q2.  in updated JDK,the expression's return could be int, double, String, other data Packages.

```java
switch(expression){
    case value1: statement1;
    break;
}
```



