package com.bit.day21;

public class Ex11 {

	public static void main(String[] args) {
		
		boolean boo=true;
		try{
			int[] arr={1,3,5};
			System.out.println(arr[3]);
			if(boo){
//				System.exit(1);//�� ��츸 ����. �� ���� JVM�� ����ǹǷ� finally�� ���� �ȵ�
				return;
				}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("����ȸ��");
		}finally{
			System.out.println("�����ϼ̽��ϴ�");
			//������ ���� �ȳ��� �ݵ�� ������. ������ return �־ ������.
			//try~catch~finally �Ǵ� try~finally�� ����
		}
	}
}
