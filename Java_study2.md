## java study (2)

### a. System class methods:(to be added)

>`System.gc() ` : This method runs the garbage collector.
>
> `System.arraycopy()`copy the array
>
>```java
>System.gc()
>```
>

### b. My project

```java
public class reverse{
	public static void display(int n) {
		if (n==0)
			return ;
		for(int i=0;i<n;i++) {
			System.out.print(n);
		}System.out.println();
		display(--n);
	}
	public static void main(String args[]) {
		int n = 5;
		display(n);
	}
}
```

### c. Some practice about class

```java
class IntClass{ //don't need "public"?
    int value;
    public IntClass(int val){ //constructer method
        value=val; //do not need "this" for reference?
    }
}
public class IntClassConstructor{
    public static IntClass getInstance(){
        IntClass s = new IntClass(8);
        return 8;
    }
    public static void main(String args[]){
        IntClass a = getInstance();
        System.out.println(a.value);
    }
}
```

- "this" uses when the variable name is the same as the parameter name; normally we do not need to use "this".

- Q. What is the difference between public class and class?

  >*"Unless it's public, the class won't be visible to other code which isn't in the same package. The default accessibility (which can't be specified explicitly) is that a class (or other member) is only visible to other code within the same package."*

### d.  Reference Types and Values

In this chapter, the context is quoted from JDK document.

> There are four kinds of *reference types*: **class types**, **interface types**, **type variables**, and **array types** .
>
> ```java
> class Point {
>     int x, y;
>     Point() { System.out.println("default"); }
>     Point(int x, int y) { this.x = x; this.y = y; }
> 
>     /* A Point instance is explicitly created at 
>        class initialization time: */
>     static Point origin = new Point(0,0);
> 
>     /* A String can be implicitly created 
>        by a + operator: */
>     public String toString() { return "(" + x + "," + y + ")"; }
> }
> 
> class Test {
>     public static void main(String[] args) {
>         /* A Point is explicitly created
>            using newInstance: */
>         Point p = null;
>         try {
>             p = (Point)Class.forName("Point").newInstance();
>         } catch (Exception e) {
>             System.out.println(e);
>         }
> 
>         /* An array is implicitly created 
>            by an array constructor: */
>         Point a[] = { new Point(0,0), new Point(1,1) };
> 
>         /* Strings are implicitly created 
>            by + operators: */
>         System.out.println("p: " + p);
>         System.out.println("a: { " + a[0] + ", " + a[1] + " }");
>     
>         /* An array is explicitly created
>            by an array creation expression: */
>         String sa[] = new String[2];
>         sa[0] = "he"; sa[1] = "llo";
>         System.out.println(sa[0] + sa[1]);
>     }
> }
> ```
>
> 

