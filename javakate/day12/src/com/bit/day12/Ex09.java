package com.bit.day12;

public class Ex09 {

	public static void main(String[] args) {
		//String class
		String msg1="Java";
		String msg2="Web";
		String msg3=msg1.concat(msg2);//JavaWeb ��� +�� ���� ����.
		String msg4="JavaWebSpring";
		String msg5=msg4.substring(4);//WebSpring ���. (4)��° �ڸ� ������ ���ڸ� ���		
		String msg6=msg4.substring(4,7);//Web ���. ù�� �ڸ� ����, �ι�° �� ���������� ���ڸ� ���
		String msg7=msg4.substring(0,4);//Java ���. ù�� �ڸ� ����, �ι�° �� ���������� ���ڸ� ���
		String msg8=msg4.substring(4,13);//WebSpring ���. ù�� �ڸ� ����, �ι�° �� ���������� ���ڸ� ���		
		String msg9=msg4.substring(4,msg4.length());//WebSpring ���. ù�� �ڸ� ����, �������� ���ڸ� ���
		String msg10=msg4.replace("Web", "DB");//JavaDBSpring ���. ã�� �ٲٱ�. �������� ��� �ٲ�
		String msg11=msg4.replace("Web","");//JavaSpring ���. ""�� �ٲٴ� ������ ��������.
		String msg12=msg4.replace('a', 'v');//�ش� ���� ã�� ��� �ٲ�
		
		char ch=msg4.charAt(0);//J ���
		int idx=msg4.indexOf('W');//W�� ��ġ�� 4 ���, ���� �Ǵ� ���ڿ� ã�� ����
		idx=msg4.indexOf("Web");//Web�� ���� ��ġ�� 4 ���
		idx=msg4.indexOf('a');//���� a �� ù a�� ��ġ�� 1 ���
		idx=msg4.indexOf('a',2);//���� a �� 2��ġ ������ ù a�� ��ġ�� 3 ���
	
		String msg13=msg4.substring(0, msg4.indexOf("Web"));//Java ���. Web �������� �߶��.
		String msg14=msg4.substring(msg4.indexOf("Web")+"Web".length());//Spring ���. Web ���ĸ� �߶��
		String msg15=msg13+"DB"+msg14;//replace�� �ֱٿ� ����. ������ replace ��� �̷��� Ȱ���߾���. ��ΰ� �ƴ� �Ϻθ� �ٲٰ� ���� �� �����ϰ���
	}//main end
}//class end
