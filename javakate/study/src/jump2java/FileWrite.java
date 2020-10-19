package jump2java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;//byte������ ó���ϴ� byte stream
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		String path="out.txt";
		FileOutputStream fos=new FileOutputStream(path);
		
		for(int i=0; i<10; i++){
			String data=i+"��° ���Դϴ�.\r\n";
			fos.write(data.getBytes());
			//byte[] �迭�� �־��ָ� ���Ͽ� ������ String���� �ۼ���.
		}
		fos.close();
		//�� �ص� java ����� �ڵ����� ����.
		//�׷��� �ڹٰ� ���� ���¿��� �����߻��� �� ������ ���� ��.
		
		
		String path2="out2.txt";
		FileWriter fw=new FileWriter(path2);
		for(int i=0; i<10; i++){
			String data=i+"��° ���Դϴ�.\r\n";
			fw.write(data);
			//String�� ��ȯ ���ϰ� �״�� ���� �� ����.
			//�׷��� ������ \r\n ����� ��.
		}
		fw.close();
		
		String path3="out3.txt";
		PrintWriter pw=new PrintWriter(path3);
		for(int i=0; i<10; i++){
			String data=i+"��° ���Դϴ�.";
			pw.println(data);
			//����Ǿ� ����
					
		}
		pw.close();
		
		//���� �߰� FileWriter
		FileWriter fw2=new FileWriter(path2, true);
		//true ���� ���� ���� ���� �����̴� ��.
		for(int i=10; i<20; i++){
			String data=i+"��° ���Դϴ�.\r\n";
			fw2.write(data);
		}
		fw2.close();
		
		//�����߰� - PrintWriter
		PrintWriter pw2=new PrintWriter(new FileWriter(path3, true));
		for(int i=10; i<20; i++){
			String data=i+"��° ���Դϴ�.";
			pw2.println(data);
			//����Ǿ� ����
					
		}
		pw2.close();
	}

}
