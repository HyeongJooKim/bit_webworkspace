package jump2java;

import java.io.BufferedReader;//String
import java.io.IOException;
import java.io.InputStream;//byte
import java.io.InputStreamReader;//character

public class StreamTest {

	public static void main(String[] args) throws IOException {

		InputStream in=System.in;
		//java.lang �̿��� Ŭ�������� import�ؾ� ��.
		
//		int a;
//		a=in.read();
		//read();�� 1����Ʈ�� data�� �о long ������ ��ȯ�� ��.
		//0~255������ ������ �ƽ�Ű�ڵ尪
		//�ѹ� �����ϸ� 1����Ʈ�� �а� ����.
		//Stream: �̾��� �ִ� ���̴�(byte)�� ����
		
//		System.out.println(a);
		
		InputStreamReader reader=new InputStreamReader(in);
		//byte[] ���, char[] ���
		char[] isr=new char[3];
		reader.read(isr);
		System.out.println(isr);

		//����ڰ� ����ŭ �� �о���̰� �ʹٸ�?
		BufferedReader br=new BufferedReader(reader);
		
		String a=br.readLine();//����ڰ� ����ĥ ������ �о����.
		System.out.println(a);
	}

}
