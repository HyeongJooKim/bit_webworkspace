package grade00;

//2020-05-08 day03 Ex16

public class Grade001T {
	public static void main(String[] args){

		int a=100;//�����
		int b=100;//�����
		int c=100;//���м���
		int t=a+b+c;//����
		double d;//����� �Ǽ� Ÿ������
		d=t*100/3/100.0;//������ �Ǽ��� ������ �Ǽ��� ���� ����ȯ��
	
		System.out.println("�������� ���α׷�(ver 0.0.1)");
		System.out.println("-----------------------------");
		System.out.println("���� "+a);
		System.out.println("���� "+b);
		System.out.println("���� "+c);
		System.out.println("-----------------------------");
		System.out.println("�հ� "+t);
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
