package com.bit.day20;

//Map
//HashMap<K,V>: key�� �ߺ��Ұ�, value�� �ߺ�����. key�� �ߺ��ϸ� �Ŀ� �Է��� value�� ���

public class Ex09 {

	public static void main(String[] args) {
		java.util.Map map1=new java.util.HashMap();
		
		map1.put("key1", "val1");
		map1.put("key2", "val2");
		map1.put("key3", "val3");
		map1.put("key4", "val4");
		map1.put("key1", "new val1");
		map1.put(1234, "ABCD");
		map1.put(true, "��¥");
		map1.put(null, "��");//������ �ϳ�, ���� key ȣ���� �Ͱ� ������ ��� �����Ƿ� ȥ��������� ���� ����.
		
		System.out.println(map1.get("key1"));//key�� ������ �ش��ϴ� value ���
		//���� key get�ϸ� null ���
		System.out.println(map1.get(1234));
		System.out.println(map1.get(true));
		System.out.println(map1.get(null));
	}
}