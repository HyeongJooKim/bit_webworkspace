package grade00;

//2020-05-11 day04 Ex21

public class Grade002M {
	public static void main(String[] args){
		int a=94;//����
		int b=80;//����
		int c=77;//����
		int ttl=a+b+c;
		double avg=ttl*100/3/100.0;
		char gr='F';
		
		if(avg>=90){gr='A';}
		if(avg<90&&avg>=80){gr='B';}
		if(avg<80&&avg>=70){gr='C';}
		if(avg<70&&avg>=60){gr='D';}

		System.out.println("�������� ���α׷�(ver 0.0.2)");
		System.out.println("____________________________");
		System.out.println("���� "+a);		
		System.out.println("���� "+b);		
		System.out.println("���� "+c);		
		System.out.println("____________________________");
		System.out.println("�հ� "+ttl);		
		System.out.println("____________________________");
		System.out.println("��� "+avg);		
		System.out.println("____________________________");
		System.out.print("���� "+gr+"����");
	}
}
