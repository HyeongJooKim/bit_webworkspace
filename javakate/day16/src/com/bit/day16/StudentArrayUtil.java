package com.bit.day16;
//StudentVO�� �����Ҵ��Ͽ� �迭�� ũ��� ��� ���� ����ϰ� ���ִ� Ŭ����

public class StudentArrayUtil {
	
	//�迭�� ũ�⸦ 1 �÷��ִ� �޼ҵ�
	private static StudentVO[] expand(StudentVO[] arr){
		StudentVO[] temp=new StudentVO[arr.length];
		for(int i=0; i<arr.length; i++){
			temp[i]=arr[i];
		}
		arr=new StudentVO[temp.length+1];
		for(int i=0; i<temp.length; i++){
			arr[i]=temp[i];
		}
		return arr;
	}
	
	//������ ���� ���ϴ� �޼ҵ�
	public static StudentVO[] add(StudentVO[] arr, StudentVO s){
		arr=expand(arr);//�迭�� ũ�⸦ �ϳ� �ø���
		arr[arr.length-1]=s;//�迭�� ������ ĭ�� �� �Է��ϱ�
		return arr;
		//parameter�� �ִ� �̸��� ������ ��, �������� ����.
		//�ű� ���� ���� �Ʒ����� ��꿡 ���Եȴٴ� ���� �����ִ� �� ��.
		//�� arr �̶�� �迭�� ���� ����
	}
	
	//�迭���� �ش� ��ü�� ���° �ε������� �˷��ִ� �޼ҵ�
		//��ü�� ���� ���� �񱳿����ڰ� �ƴ� method�� ���ؼ� ���ؾ� �Ѵ�.
		//�ֳ� �񱳿����ڴ� ����� ���� �ƴ� �ּҰ����� ���ϱ� ������.
		//equals method�� ������.: StudentVO.equals ����. 
		
		//�������� ���° index���� Ȯ���� ��
		//�츮 �迭�� ���� ���� �ε����� �䱸�ϰ� �ȴٸ�?
		//�迭���� ���� ������ �� ���� ���� ���� �ε����� �ָ� ��.
		//���� ���� �� ���� ������ -1�� �����ϰ� ����� �ָ� ��
	public static int indexOf(StudentVO[] arr, StudentVO s){
		for(int i=0; i<arr.length; i++){
			if(s.equals(arr[i])){
				return i;
			}//�ϳ��� ������ �� index ��ȣ�� ����
		}
		return -1;//�迭�� ���� ���� ��� ���ϰ�
	}
	
	//���� �迭���� Ư�� ��ü�� �����ϰ� ũ�⵵ -1�ҷ���?
	//1�ܰ�. �ش� �迭�� �� ��ü�� �����ϴ��� Ȯ��. ������ �׳� �״�� ��
	//2�ܰ�. �����ϸ�, 2���� �迭�� ���� 0~�׹�ȣ���� ����, �׹�ȣ�������� ������ ����
	//3�ܰ�. �� �迭�� �ϳ��� ��ü
	//�ٸ� ���
	//2�ܰ�.�����ϸ�, ���� �迭�� temp�� ����
	//3�ܰ�. ���� �迭�� ũ�⸦ �ϳ� �ٿ� ���� �����.
	//4�ܰ�. ������ ������ �����ϵ� indexOf�� ���� �� �������� �ʴ´�.
	//* ����: continue;�� ���� �ڵ� ���� �ڵ�, �ʹ� �����ؼ� ���İ�Ƽ �ڵ�� �ϰ� ���� ����� �߼�
	public static StudentVO[] remove(StudentVO[] arr, StudentVO s){
		if(indexOf(arr, s)!=-1){// �����ϴ� ���̹Ƿ� ���
			int index=indexOf(arr, s);
			StudentVO[]  temp=new StudentVO[arr.length];
			for(int i=0; i<indexOf(arr,s); i++){
				temp[i]=arr[i];
			}
			arr=new StudentVO[temp.length-1];
			for(int i=0; i<temp.length; i++){
				if(i<index){
					arr[i]=temp[i];
				}else if(i>index){
					arr[i-1]=temp[i];					
				}
			}
		}
		return arr;
	}
	
}
