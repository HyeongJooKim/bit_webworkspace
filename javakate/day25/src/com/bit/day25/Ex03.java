package com.bit.day25;

//���ڿ� ���� ����
//���� �޾Ƽ� �������� �ֿܼ��� �ű��

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		String path="data1.txt";
		String path2="copy.txt";
		File source=new File(path);
		File target=new File(path2);
		
		if(!target.exists())target.createNewFile();
		char[] cbuf=new char[5];//���� �޸�
		FileReader fr=null;
		FileWriter fw=null;

		fr=new FileReader(source);
		fw=new FileWriter(target);
		while(true){
//			int su=fr.read();
			int su=fr.read(cbuf,0,cbuf.length);
			if(su==-1)break;
//			fw.write(su);
			fw.write(cbuf,0,su);
			
			//�������� �ֿܼ��� �ű��
			String msg=new String(cbuf,0,su);
			System.out.print(msg);// �����غ��� ����ũ���� 5���ھ� ������ ����Ǵ� �� Ȯ���� �� ����.  
		}
		System.out.println("����Ϸ�");
		if(fw!=null){fw.close();}
		if(fr!=null){fr.close();}
	}
}