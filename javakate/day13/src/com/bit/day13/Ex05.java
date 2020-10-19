package com.bit.day13;

public class Ex05 {
	//Object class
	int su;
	
	Ex05(int su){
		this.su=su;
	}//me�� ���������� �������ִ� ����
	
	public static void main(String[] args) {
		Object obj=new Object();
		System.out.println(obj.toString());//java.lang.Object@15db9742 ��� (class�̸�@hashcode)
		Object obj2=obj;
		Object obj3=new Object();
		System.out.println(obj.toString());//java.lang.Object@15db9742 ���
		System.out.println(obj.hashCode());//366712642 ��� (hashCode�� int�� ����ؼ� �޶���
		System.out.println(obj.equals(obj2));//true
		System.out.println(obj.equals(obj3));//false
//		obj.clone();//Object class�� protected class�� clone �Ұ���.�׷��� Object�� ��ӹ��� �ٸ� class���� clone�� ��. clone������� Object type��
		System.out.println("------------------");
		
		Ex05 me=new Ex05(10);
		Ex05 me2=new Ex05(10);
		try {
			me.clone();//�׳� �̷��� ���� �����ٰ� ���� ��. Object type���� �����Ǵ� ��.
//			Object me3=me.clone();
//			Ex05 me3=(Ex05)me.clone();//�̷��� ���� ��class type���� �����ϴ� ��.
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(me==me2);//false. ==�� �ּ� ��, equals�� ������ �� ������
		System.out.println(me.equals(me2));//false.. 
		//�� �길 false�ϱ�? ���� ���������� �ʾұ� ������. 
		//�����ֱ� ���ؼ� Ex02 �����ڸ� �������.
		
		String msg="java";
		String msg2=new String("java");
		System.out.println(msg==msg2);//false
		System.out.println(msg.equals(msg2));//true
		
		
		Integer su1=new Integer(100);
		Integer su2=new Integer(100);
		System.out.println(su1==su2);//false
		System.out.println(su1.equals(su2));//true	
		
		
	}//main end
	
	public boolean equals(Object me2){//Object Ŭ������ equals�� equals method override �غ���
		Ex05 me=(Ex05) me2;//Object Ÿ���� equals�� Ex05 Ÿ������ ����ȯ
		return this.su==me.su;
	}

}//class end
