package com.bit.day15;
//Q1.�ֹι�ȣȮ��(�ѱ�����, �ѱ۷� �����̻� �׷��� �Է°����ϰ�)
//�ֹι�ȣ>>000000-0000000
//Q2.�����������α׷�(�迭, �����Ҵ�ǰ�,
//������ �̸� �Է� ���ϰ� ������ �ԷµǴ´�� �þ��, �迭 ���� ����)

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] data=new String[3][];
		String[] stu={"1","��","3"};
		data[0]=stu;
		
		String[] stu1={"2","��","3"};
		data[1]=stu1;
		
		String[] stu2={"1","��","3"};
		data[2]=stu;
		
		for(int i=0; i<data.length; i++){
			for(int j=0; j<3; j++){
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		
		}
	}

}
