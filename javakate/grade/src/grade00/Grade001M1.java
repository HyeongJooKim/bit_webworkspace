package grade00;

//2020-05-08 day03 Ex16

public class Grade001M1 {

	public static void main(String[] args){

	/* ������ ����Ͻÿ�. ��� A.90~100 B.80~90�̸� C.70~80�̸� D.60~70�̸� F.60�̸�

	�������� ���α׷�(Ver 0.0.1)
	-----------------------------
	���� 90
	���� 80
	���� 70
	-----------------------------
	�հ� 00000
	-----------------------------
	��� 00.00
	-----------------------------
	���� B����
	*/

		int a=60;//�����
		int b=50;//�����
		int c=40;//���м���
		double d=(a+b+c)/3;//���
	
		System.out.println("�������� ���α׷�(ver 0.0.1)");
		System.out.println("-----------------------------");
		System.out.println("���� "+a);
		System.out.println("���� "+b);
		System.out.println("���� "+c);
		System.out.println("-----------------------------");
		System.out.println("�հ� "+(a+b+c));
		System.out.println("-----------------------------");
		System.out.println("��� "+d);
		System.out.println("-----------------------------");

		if(d<60){
			System.out.println("���� F����");
		}else if(d<70){
			System.out.println("���� D����");
		}else if(d<80){
			System.out.println("���� C����");
		}else if(d<90){
			System.out.println("���� B����");
		}else{ 
			System.out.println("���� A����");
		}
	}
}
