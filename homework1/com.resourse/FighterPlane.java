package com.pa1;
public class FighterPlane
{
	public String name; //�������ݳ�Ա�Ϳռ�
	public int missileNum; //private��Աֻ����class��ĺ���ʹ��
	public void fire() {
		if (missileNum>0) {
			System.out.println("Now fire a missile!");
			missileNum-=1;
		}
		else {
			System.out.println("No missile left!");
		}
	}
	/*private static FighterPlane fp; //��̬���ݳ�Ա����һ������
	private FighterPlane(String _name, int _missileNum) {//���캯����˽�еģ����Ըö��󴴽���������class�ⲿ
		name = _name;
		missileNum = _missileNum; //������thisָ��
	}
	public static FighterPlane getInstance(String _name, int _missileNum) {
		if (fp==null) {
			fp = new FighterPlane(_name,_missileNum);
		}
		return fp;
	}*/
}