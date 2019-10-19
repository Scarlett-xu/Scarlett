```java
class oneString{
	public void changePara(StringBuffer s) {
		s=s.append("a");
	}
	public void invoke() {
		StringBuffer s=new StringBuffer("b");
		changePara(s);
		System.out.println(s);
	}
	public static void main(String[]str) {
		oneString s=new oneString();
		s.invoke();
	}
}
```

