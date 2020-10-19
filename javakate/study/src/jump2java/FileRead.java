package jump2java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {

		String path="out.txt";//���� ������ ��� ����
		File file=new File(path);//�ش� ��ο� �ִ� ������ �ν� 
		
		FileInputStream fis=new FileInputStream(file);//���� ������ �о��� �� ��Ʈ�� ����
		byte[] by=new byte[(int)file.length()];//������ ũ��(byte����)��ŭ ���� ������ byte[]�� ����
		fis.read(by);//byte[] �� ��� �����͸� �о����.
		System.out.println(new String(by));//byte[]�� �� ���ڿ��� �μ�
		fis.close();
		
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		while(true){
			String line=br.readLine();//�ٴ����� ����
			if(line==null)break;
			System.out.println(line);
		}
		br.close();
		
	}

}
