package jump2java;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		
		String[] numbers={"one","two","three"};
		
//		for(int i=0; i<numbers.length; i++){
//			System.out.println(numbers[i]);
//		}
		
		//for each �� �ٲٸ�
		//����
		//for(Type ������ : �ݺ��Ұ�ü��){//Type: �ݺ��Ұ�ü�� �̷�� ���� Ÿ�� �ݺ������Ѱ�ü(Array, ArrayList��)
		//    �ݺ����๮(������);}

		for(String a : numbers){//String[] �ϴ� ������.
			System.out.println(a);
		}
		
		System.out.println("---------------------");
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("thre");
		
		for(String a : al){//ArrayList�� �ִ� �� �ƴ϶� ���� �� �迭�� �̷�� ���� Ÿ���� ���� �ų�
			System.out.println(a);
		}
		//��ü�� �ݺ��� �� ����
	}
}
