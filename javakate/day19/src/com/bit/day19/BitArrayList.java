package com.bit.day19;

public class BitArrayList {

//	java.util.ArrayList list=new java.util.ArrayList();
//	���� method ��ɾ BitArrayList�� ����غ�����.
	
	//ArrayList�� �б⽬�� ������ ������
	//����, ������Ʈ, ������ �迭�� �����ؾ� �ϴ� ���� �ִ�.
	//���� �����غ���?
	//�迭�� �����ϴ� �� ���� ��� ������ �� ������? ��ü�� Ȱ���غ���.
	//��ü���� ���� ������ �� �ִ�.
	//�Է��� ���� ������ ��ü �����ϰ� ȣ���ϸ� �Ǵµ�,
	//��ü���� ���� ��������? ��ǥ���� �ʿ��ϴ�.
	//������ ���� ��� ���ʿ��ϴ�.
	
	private Object[] arr;
	//�ܺο��� �迭���� ���� ���� ����, ���� �� �� �ְ� Object�� �ٲ㺸��
	
	public BitArrayList(){
		arr=new Object[0];
	}

	//�迭�� �� ���� �Է��ϴ� �޼ҵ�
	public void add(Object o){
		Object[] temp=new Object[arr.length+1];
		for(int i=0; i<arr.length; i++){
			temp[i]=arr[i];
		}
		arr=temp;
		arr[arr.length-1]=o;
	}
	
	//�迭 �� ȣ���ϴ� �޼ҵ�
	public Object get(int idx){
		return arr[idx];
	}
	
	//�迭 �� ȣ���ϴ� �޼ҵ�
	public int size(){
		return arr.length;
	}
	
}
