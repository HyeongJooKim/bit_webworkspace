package com.bit.day12;

public class Lotto3 {
	public static void main(String[] args) {
		int[] lotto=new int[6];
		int cnt=0;
		try{
			while(true){//���� ���� �׳� true�� �ΰ� ���� �ٲ����� ������ �������� ������
				lotto[cnt++]=(int)(Math.random()*45)+1;//�̴�� �θ� �������� �̰���. �׷��� try~catch �̿��ؼ� 6�������� �̰� ���������� ��
			}
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		for(int i=0; i<lotto.length; i++){
			System.out.println(lotto[i]);
		}
	}
}
