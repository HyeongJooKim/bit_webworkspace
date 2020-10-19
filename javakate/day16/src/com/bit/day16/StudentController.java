package com.bit.day16;

import java.util.List;

public class StudentController {
	//Dependency Injection: � Ŭ������ �ܺ� Ŭ������ �������� ��,
	//	�ܺ�Ŭ������ ���� ����� ���� �ʰ�, �ܺο��� �޾ƴٰ� ���� ��
	//DI�ϴ� 2�������:
	//	1.�����ڸ� ���� DI >> �ǽ��غ���
	//	2.�޼ҵ带 ���� DI
	//������ list�� �츮�� �ʿ��� ������ DB���� �ܾ�;� ������
	//�츮�� DB�� �����Ƿ� ���⿡ �ʵ�� �ִ´�.
	//���� �������� Ȱ������ ���� ������������ Arraylist�� �ƴ� List�� �ִ´�.
	
	//list �� ���� �������� �ʰ� controller�� ���� �����ϵ��� �غ���
	
	List<StudentVO> list;//List�� interface��. ArrayList �ƴ� List�� list�� �ٲ��ֱ�
	public StudentController(List<StudentVO> list){
		//�� ��Ʈ�ѷ� Ŭ������ List<StudentVO> list�� �������� ������
		//�׷��ٰ��ؼ� �� ����Ʈ�� ��� �ʱ�ȭ������ ���⿡ �����ָ�
		//���� �� ����Ʈ�� ������ �������� �ȴٸ� ���⵵ �ٲ���� �Ѵ�,
		//������ �ܺο��� ����Ʈ�� �����ϰ� �ȴٸ�
		//���⼱ �׳� �ʱ�ȭ �ڵ常 �ֱ� �빮�� �� ���Թ��� ���� �״�� ���� �ʴ�
		//�̷��� ������ �ٷ� ������ ������ �ȴ�.
		this.list=list;
//		this.list=new ArrayList<>();//�̷��� ���ٸ� ArrayList�� �ٸ� �ɷ� �ٲٸ� ���⵵ �ٲ���� ��
	}
	
	public int calculateSum(StudentVO s){//���� �����Ƿ� parameter ��������� ��
		return s.getKorean() + s.getEnglish() + s.getMath();
	}
	public double calculateAverage(StudentVO s){
		return calculateSum(s)*100/3/100.0;
	}
	public StudentVO findById(StudentVO s){
		StudentVO result=null;
		if(list.indexOf(s)!=-1){
			int index=list.indexOf(s);
			result=list.get(index);
		}
		return result;
	}
	
	//�й� �ڵ��ο��ϰ� �����ϱ�
	public void add(StudentVO s){
		if(list.size()==0){//�Էµ� ���� ������ 0������ ����
			s.setId(0);
		}else{//�Էµ� ���� ������ list�� ������������ id �Է�
			int id=list.get(list.size()-1).getId() +1;
			s.setId(id);
		}
		list.add(s);
	}

	//�߰��� �Է°��� list�� �߰��ϱ�
	public void set(StudentVO s){
		int index=list.indexOf(s);
		list.set(index, s);
	}
	
	public void remove(StudentVO s){
		list.remove(s);
	}
}
