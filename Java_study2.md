## java study (2)

[TOC]

### a. System class methods:

>`System.gc() ` : This method runs the garbage collector.
>
> `System.arraycopy()`copy the array
>
>```java
>System.gc()
>```
>
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

  

  



