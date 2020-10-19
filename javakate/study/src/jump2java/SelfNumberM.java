package jump2java;

import java.util.ArrayList;

//� �ڿ��� n�� ���� ��,
//d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ��������
//��: d(91) = 9 + 1 + 91 = 101
//�̶� n�� d�� ���ʷ����Ͷ�� �Ѵ�. ��, 91�� 101�� ���ʷ����ʹ�.
//� ���ڵ��� �ϳ� �̻��� ���ʷ����͸� �����µ�, ��: 100�� 101�� ���ʷ�����.
//���ʷ����Ͱ� ���� ���ڵ鵵 �ִ�. �̷� ���� Self-Number�� �θ���.
//��: 1, 3, 5, 7, 9, 20, 31�� �����ѹ����̴�.
//1�̻� 5000���� ���� ���� �ѹ����� ���� ���϶�.

public class SelfNumberM {
	
	public static void main(String[] args) {

		int begin=1;
		int end=5000;
		int sum=0;
		ArrayList<Integer> selfNumbers=new ArrayList<>();
		ArrayList<Integer> nonSelfNumbers=new ArrayList<>(); 
		
		for(int n=begin; n<end+1; n++){
			int d=n+(n/1000)+(n/100%10)+(n%100/10)+(n%10);
			nonSelfNumbers.add(d);
		}
		
		for(int n=begin; n<end+1; n++){
			if(!nonSelfNumbers.contains(n)){
				selfNumbers.add(n);
				sum+=n;
			}
		}
//		System.out.println(sn.toString());
		System.out.println(begin+"~"+end+" �� �����ѹ��� "+selfNumbers.size()+"���̰� ���� "+sum+"(��)��.");
//		System.out.println(nsn.toString());
	}
}