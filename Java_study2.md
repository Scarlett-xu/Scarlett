# java study (2)

## 1. System class methods:(to be added)

>`System.gc() ` : This method runs the garbage collector.
>
> `System.arraycopy()`copy the array
>
>```java
>System.gc()
>```
>

## 2. My project

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

## 3. Some practice about class

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

## 4. compile of class

```java
package com.pa1;
public class FightPlane
{
	private String name; //分配数据成员和空间
	private int missileNum; //private成员只能在class里的函数使用
	private static FightPlane fp; //静态数据成员，是一个对象
	private FightPlane(String _name, int _missileNum) {//构造函数，私有的，所以该对象创建不可以在class外部
		name = _name;
		missileNum = _missileNum; //或者用this指向
	}
	public static FightPlane getInstance(String _name, int _missileNum) {
		if (fp==null) {
			fp = new FightPlane(_name,_missileNum);
		}
		return fp;
	}
}
```



```java
package com.pa2;
import com.pa1.*;
public class RunPlane{
	public static void main(String args[]) {
		FightPlane fp;
		fp = FightPlane.getInstance("scarlett", 18);
	}
}
```

In this Way, `FightPlane` can only create one object.

## 5. NullPointerExpection

A trying focus on creating object:

 ```java
package com.pa1;
class app{
	static int num;
	public void show () {
		System.out.println(num);
	}
}
public class onther{
	public static void main(String args[]) {
		app ap = new app(); //if do not add this sentense,it will face NULLPointerExpection. and don't forget the parentheses
		ap.show();
		
	}
}
 ```

## 6. Homework

- [例4.16](https://github.com/Scarlett-xu/Scarlett/blob/master/homework1/com.resourse/FighterPlane.java)

- [例4.17](https://github.com/Scarlett-xu/Scarlett/blob/master/homework1/com.run/RunPlane2.java)

- [习题9](https://github.com/Scarlett-xu/Scarlett/blob/master/homework1/practice9.md)

  





