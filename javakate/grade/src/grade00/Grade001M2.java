package grade00;

//2020-05-08 day03 Ex16

public class Grade001M2 {

	public static void main(String[] args){

		int a=78;//�����
		int b=77;//�����
		int c=99;//���м���
		int t=a+b+c;//����
		double d=(a+b+c)/3;//���
	
		System.out.println("�������� ���α׷�(ver 0.0.1)");
		System.out.println("-----------------------------");
		System.out.println("���� "+a);
		System.out.println("���� "+b);
		System.out.println("���� "+c);
		System.out.println("-----------------------------");
		System.out.println("�հ� "+(a+b+c));
		System.out.println("-----------------------------");
		System.out.print("��� "+t/3);

		if(t%3==0){
			System.out.println(".00");
		}else if(t%3==1){
			System.out.println(".33");
		}else if(t%3==2){
			System.out.println(".67");
		}

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
