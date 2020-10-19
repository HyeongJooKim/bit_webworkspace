package com.bit.day16;
//3���� �����̸鼭 �����ִ��Ģ ���Ѻ���

//Student�� �ʵ带 �����ϴ� �κ�
//�ʵ带 �����ϰ� java.lang.Object�� �޼ҵ带 �ش� �ʵ忡 ���߾� 
//overriding �ϴ� �޼ҵ常 ����.
//�̷��� �����͸� ����ϴ� 'Ʋ'�� �츮�� Value Object Ȥ�� Data Transfer Object
//�ٿ��� VO, DTO Ŭ������� �θ���.
//��, �� Ŭ������ �̸��� Student VO Ŭ������ �Ǿ�� �Ѵ�.

//�ڵ��� �� �� �ܺο��� �˾ƾ� �ϴ� �޼ҵ尡 �ƴϸ�
//��� �ʵ峪 �޼ҵ忡 private ���������ڸ� �����ϰ� ��
//������ private�� �ܺ� Ŭ������ ������ ��� �����Ƿ�
//���� �ܺ� Ŭ�������� �ʵ忡 ���� ��������?
//�� �̻� ���� ������ �Ұ�������
//���, �츰 �޼ҵ带 ����, �� �޼ҵ忡 ���� �־ ȣ���ϰ� ����� �ξ�� ��.
//�̷��� �ܺο� Ŭ���� ���θ� ���ΰ��� �ϴ� �� �ƴ϶� 
//�� �ʿ��� �޼ҵ常 �����ϵ��� ��� ���� �����ڸ� private���� �ϰ�
//�޼ҵ�θ� �����ϰ� ����� �� ĸ��ȭ(encapsulation)��� �Ѵ�.

public class StudentVO {

	private int id;//�л���ȣ
	private String name;//private ���̸� Controller, Viewer������ ������ ��
	private int korean;
	private int english;
	private int math;
	
	//�ʵ忡 ���� �ִ� �޼ҵ带 setter method�� ��.
	//�ʵ��� ���簪�� ȣ���ϴ� �޼ҵ带  getter method�� ��.
	//ȭ�� ����� �ƴ϶� ���� return ȣ���Ѵٴ� �ǹ���.
	
	//setter method����
	//public void set�ʵ��(�ʵ�Ÿ�� �ʵ��̸�){
	//	this.�ʵ�=�ʵ�;
	//}
	
	public void setName(String name){
		this.name=name;
	}
	
	//getter method����
	//public �ʵ�Ÿ�� get�ʵ��(){
	//	return �ʵ��̸�;
	//}
	
	public String getName(){
		return name;
	}
	
	public void setKorean(int korean){
		this.korean=korean;
	}

	public int getKorean(){
		return korean;
	}
	
	public void setEnglish(int english){
		this.english=english;
	}
	
	public int getEnglish(){
		return english;
	}
	
	public void setMath(int math){
		this.math=math;
	}
	
	public int getMath(){
		return math;
	}
	
	//��Ŭ�� Source > Generate Getters and Setters...�� �ڵ� ������
	
	//equals method�� parameter�� ��� Ŭ������ ��ü�� �Ѿ�� �� �ִ�.
	//�׷� ���� �ؾ� ��� Ŭ������ ��ü�� parameter �� ���� �� ������?
	//1. ��� Ŭ������ overload ���ش�....? Ŭ������ �? �Ұ�����
	//2. �������� ����Ѵ�. (å p354 5.1 ����) ��� Ŭ������ ������ Object�� ���
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean equals(Object o){
		//2���� ��ü�� ������ �˾ƺ�����
		//1. 2���� ��ü�� ���� Ŭ���� ��ü���� Ȯ���غ���.
		//2. 2���� ��ü�� ���� Ŭ���� ��ü��
		//   �ش� Ŭ������ �ʵ� �� Ư�� �ʵ� Ȥ�� ��� �ʵ带 ���ؼ�
		//   ��� ������ �� ���� ���� ��ü�̴�.

		//���� 2 ��ü�� ���� Ŭ���� ��ü���� �˾ƺ���.
		//��, parameter�� �Ѿ�� o�� null�� �ƴϰ� StudentVO Ŭ������ ��ü���� Ȯ������
		//�츮�� ���⼭ �����ϰ� ����� �ϳ��� 2���� ���ÿ� Ȯ���� �� �ִ�.
		// instanceof ��� �Ǹ��� ���� �ֳ�. null �� �ƴϰ� �ش� Ŭ������ ��ü���� Ȯ�����ش�.
		
//		if(o instanceof StudentVO){ 
//			//true��� �ϸ�, parameter�� �Ѿ�� o�� StudentVO�� ��ü�� ���̹Ƿ�
//			//�츮�� StudentVO�� �ʵ带 ������ �� �ִ�.
//			//������ object Ÿ���̹Ƿ� ����ȯ�ؾ� StudentVO ��ü�� ����� �� �ִ�.
//			StudentVO s=(StudentVO)o;
//			if(name.equals(s.name) && korean == s.korean && english == s.english && math == s.math){
//				return true;
//			}
//		}
		
		//�й��� ���ϴ� method
		if(o instanceof StudentVO){ 
			StudentVO s=(StudentVO)o;
			if(id==s.id){
				return true;
			}
		}
		return false;
	}
//��Ŭ�� Resource > Generate toString();
	@Override
	public String toString() {
		return "�й�:" + id + "\t�̸�:" + name + "\t����:" + korean
				+ "\t����:" + english + "\t����:" + math;
	}
	
}
