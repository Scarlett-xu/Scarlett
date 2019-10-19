## Java Study (5) 

创建线程

a.通过继承类创建线程，无参数

```java
package xiancheng;
public class MyThreads extends Thread{
	public static void main(String []args) {
		Thread a = new MyThreads();
		a.start();
		System.out.println("This is main Thread.");
	}
	public void run() {
		System.out.println("This is another thread.");
	}
}
```

b.通过接口产生线程

```java
package xiancheng;
public class MyThread implements Runnable{
	public static void main(String []args) {
		MyThread my=new MyThread();
		Thread a= new Thread(my);
		a.start();
		System.out.println("This is main thread");
	}
	public void run() {
		System.out.println("This is another thread");
	}
}
```

这里不实现run方法会报错，因为run方法是Runnable接口的方法实现

c.

```java
package xiancheng;
public class MyThread {
	public static void main(String []args) {
		Thread a=new Thread(new Runnable(){
			public void run() {
				System.out.println("this is another thread");
			}
		});
		a.start();
		System.out.println("This is main thrad.");
	}
}
//Lambda简写
public class MyThread {
	public static void main(String []args) {
		Thread a=new Thread(()->{
				System.out.println("this is another thread");
		});
		a.start();
		System.out.println("This is main thrad.");
	}
}
```

