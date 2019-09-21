package com.pa1;
public class FighterPlane
{
	public String name; //分配数据成员和空间
	public int missileNum; //private成员只能在class里的函数使用
	public void fire() {
		if (missileNum>0) {
			System.out.println("Now fire a missile!");
			missileNum-=1;
		}
		else {
			System.out.println("No missile left!");
		}
	}
	/*private static FighterPlane fp; //静态数据成员，是一个对象
	private FighterPlane(String _name, int _missileNum) {//构造函数，私有的，所以该对象创建不可以在class外部
		name = _name;
		missileNum = _missileNum; //或者用this指向
	}
	public static FighterPlane getInstance(String _name, int _missileNum) {
		if (fp==null) {
			fp = new FighterPlane(_name,_missileNum);
		}
		return fp;
	}*/
}