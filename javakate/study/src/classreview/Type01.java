package classreview;

public class Type01 {
	public static void main(String[] args) {
		System.out.println("A"+1+2);// A12
		System.out.println(1+2+"A");// 3A
		System.out.println('A'+1);// 66
		System.out.println('A'-1);// 64
//		System.out.println("A"-1);// ������.
		
		int a=1;
		double b=a;
		System.out.println(a);// 1
		System.out.println(b);// 1.0 // ���Ը����ε� double type���� autocasting��
		System.out.println((int)3.14);// 3 //int�� ����ȯ
		
		System.out.println(100/3);// 33 // ����/����=������
		System.out.println(100/3.0);// 33.333333333333336 // ����/�Ǽ�=�Ǽ���
		System.out.println(100*100/3/100.0);// 33.33 // �Ҽ���2�ڸ� �����
		
		char c='A';
		System.out.println(c);// A
		c=65;
		System.out.println(c);// A // ������ 65�� char�� autocasting��
		
		System.out.println("���ڿ�");// ���ڿ�
		System.out.println('��'+'��'+'��');// 149692 // char�� �����ϸ� ������ �ڵ�����ȯ
		System.out.println((int)'��');// 47928
		System.out.println((int)'��');// 51088
		System.out.println((int)'��');// 50676
		//���� ǥ��
		System.out.println(10);// 10
		System.out.println(010);// 8 // 8���� ǥ���� �տ� 0 ����
		System.out.println(0x10);// 16 // 16���� ǥ���� �տ� 0x ����
		
		a=100;
		System.out.println(a++);// 100 // ��� �� ����
		System.out.println(a);// 101
		a=100;
		System.out.println(++a);// 101 // ���ϰ� ���
		System.out.println(a);// 101
		a--;
		System.out.println(a);// 100
		
		byte by=127;
//		by=by+1;// ������. ������ byte�� ������ �� ���ٴ� ����
		by++;
		System.out.println(by);// -128 // byte �ִ밪�� 127 ���� ��Ʈ�� -128�� ��Ʈ���
		by--;
		System.out.println(by+1);// 128 // byte �� 127�� ������ �ڵ�����ȯ�ع���
		
		
		
		
		
		
		
		
		
		
	}
}
