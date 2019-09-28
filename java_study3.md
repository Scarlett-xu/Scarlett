## java_study3 

### 1. Abstract class and  inherited class 

```java
import java.awt.*;
import java.applet.*;
abstract class Shapes{
	protected int x,y,k;
	protected double m;
	public Shapes(int x,int y,int k,double m) {
		this.x=x;
		this.y=y;
		this.k=k;
		this.m=m;
	}
	abstract public double getArea();
	abstract public double getPerimeter();
}
class Rect extends Shapes{//三角形
	public double getArea() {
		return (Math.sqrt(m*k))
	}
	public double getPerimeter() {
		return(2*k+2*m);
	}
	public Rect(int x,int y,int width,int height) {
		super (x,y,width,height);
	}
}
class Triangle extends Shapes{//长方形
	public double getArea() {
		return (Math.sqrt(m*(m-k)*(m-x)*(m-y)));
	}
	public double getPerimeter() {
		return(k+x+y);
	}
	public Triangle(int baseA,int baseB,int baseC) {
		super(baseA,baseB,baseC,0);
		m=(baseA+baseB+baseC)/2.0;
	}
}
class Circle extends Shapes{
	public double getArea() {
		return (m*m*Math.PI);
	}
	public double getPerimeter() {
		return (2*Math.PI*m);
	}
	public Circle(int x,int y,int width) {
		super(x,y,width,width/2.0);
	}
}

public class RunShape extends Applet{//原来的类，分别对每一个继承类进行函数的定义
	Rect rect=new Rect(5,15,25,25);
	Triangle tri=new Tringle(5,5,8);
	Cricle cir = new Cricle(13,90,25);
	public void paint(Graphics g) {
	//绘制矩形，输出矩形的面积和周长
		g.drawRect(rect.x, rect.y,rect.k,(int)reck.m);
		g.drawString("Rect Area:"+rect.getArea(),50,35);
		g.drawString("Rect Perimeter:"+rect.getPerimeter(),50,55);
	//输出三角形的面积和周长
		g.drawString("Triangle Area:"+tri.getArea(),50,75);
		g.drawString("Tringle Perimeter:"+tri.getPerimeter(),50,95);
	//绘制圆，输出圆的面积和周长
		g.drawOval(cir.x-(int)cir.k/2,cir.y-(int)cir.k/2,cir.k,cir.k);
		g.drawString("Circle Area:",cir.getArea(),50,115);
		g.drawString("Circle Perimeter:"+cir.getPerimeter(),50,135);
		
	}
}

public class RunShape extends Applet{//修改后的类
	Rect rect = new Rect(5,15,25,25);
	Triangle tri = new Triangle(5,5,8);
	Circle cir = new Circle(13,90,25);
	
	private void drawPerimeter(Graphics g,Shapes s,int a,int b) {//s是通用的对象，建立函数让不同类都diao'yong
		g.drawString(s.getClass().getName()+"Perimeter"+s.getPerimeter(),a,b);
	}
	public void paint(Graphic g) {
		g.drawRect(rect.x, rect.y, rect.k, (int)rect.m);
		drawArea(g,rect,50,35);
		drawArea(g,tri,50,75);
		drawPerimeter(g,tri,50,95);
		g.drawOval(cir.x-(int)cir.k/2,cir.y-(int)cir.k/2,cir.k,cir.k);
		drawArea(g,cir,50,135);
		drawPerimeter(g,cir,50,135);
	}
}
```

![](E:\专业课\QQ图片20190927173400.jpg)

#### Note:

- the abstract class can not new a new object
- feature：" **upcasting**" and "**reuse**"
- `getClass().getName()`means gain the name of current class.

## 

### 2. Interface 

>Interface is just like a pure virtual class in C++.

#### 2.1. Interface declaration

```java
interface human{
    public abstract void height();
    public abstract void weight();
    public abstract void name();
    public abstract void age();
    public abstract void gender();
}
```

*You can not implement any of the declared methods.*

#### 2.2. Interface implements



```java
public class Scarlett implements human{
    public void height{
        System.out.println("170")
    }
    public void weigth{
        System.out.println("52")
    }
    public static void main(String args[]){
        Scarlett s=new Scarlett();
        s.height();
        s.weight();
    }
}
```

- interface is Implicitly abstract.

- the methods in interface are all public.

### 3. What's the difference between  an inheritance and an interface?

> 1. Interface is collection of ONLY abstract methods and final fields.
> 2. There is no multiple inheritance in Java.
> 3. Interfaces can be used to achieve multiple inheritance in Java.
> 4. One Strong point of Inheritance is that We can use the code of base class in derived class without writing it again. May be this is the most important thing for inheritance to be there.

There are few use-cases for interfaces: (which I found in website)

1. Object effectively has two identities: a `Tank` *is* both a `Vehicle` and a `Weapon`. You can use an instance of `Tank` where either the former or the latter is expected (polymorphism). This is rarely a case in real-life and is actually a valid example where multiple inheritance would be better (or traits).
2. Simple responsibilities: an instance of `Tank` object in a game is also `Runnable` to let you execute it in a thread and an `ActionListener` to respond to mouse events.
3. Callback interfaces: if object implements given callback interface, it is being notified about its life-cycle or other events.
4. Marker interfaces: not adding any methods, but easily accessible via `instanceof` to discover object capabilities or wishes. `Serializable` and `Cloneable` are examples of this.