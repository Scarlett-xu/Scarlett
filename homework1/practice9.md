## 习题9

**设计Src和Dis两个类, Src中有一个被封装的属性，类型为int（要求为非负值），每当我们通过特定方法更改Src对象中的这个属性后，Dis对象都能得到通知，并向Src发消息获得此属性值。**

```java
package homework1;

class Src {
	private int missileNum;
	Dis d;
	public Src() {}
	public Src(int num) {
		missileNum=num;
	}//两个构造函数，用于连接两个对象
	public void setDis(Dis di) {
		if(di!=null) {
			d=di;
		}
	}
	public void modify() {
		missileNum +=1;
		d.message();
		System.out.println(missileNum);
	}
}
class Dis {
	Src s;
	public Dis() {};
	public Dis(Src s) {
		this.s=s;
		s.setDis(this);//将本身的对象给自己数据成员的数据成员d，双向连接上
	}
	public void message() {
		System.out.println("Change the number!");
	}
}
public class sss{
	public static void main(String[] args) {
		Src sr=new Src(1);
		Dis di=new Dis(sr);
		for(int i=0;i<5;i++) {
			sr.modify();
		}
	}
}
```

*results:*

```java
Change the number!
2
Change the number!
3
Change the number!
4
Change the number!
5
Change the number!
6
```

