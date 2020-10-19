package com.bit.day25;

//Buffered class ����

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		String path="data1.txt";
		String path2="copy.txt";
		File source=new File(path);
		File target=new File(path2);
		if(!target.exists())target.createNewFile();
//		char[] cbuf=new char[5];//���� �޸�
		
		FileReader fr=null;
		FileWriter fw=null;

		BufferedReader br=null;
		BufferedWriter bw=null;
		
		fr=new FileReader(source);
		fw=new FileWriter(target);
		
		br=new BufferedReader(fr);
		bw=new BufferedWriter(fw);
		
		while(true){
//			int su=br.read(cbuf,0,cbuf.length);//���ۿ��� �а� ���� su: ���۱���
			int su=br.read();//���ۿ��� �а� ����.su: ������ ����
			if(su==-1)break;
//			bw.write(cbuf,0,su);
			bw.write(su);
			
			//�������� �ֿܼ��� �ű��
//			String msg=new String(cbuf,0,su);
//			System.out.print(msg);// �����غ��� ����ũ���� 5���ھ� ������ ����Ǵ� �� Ȯ���� �� ����.  
			System.out.print((char)su);  
		}
		System.out.println("����Ϸ�");
		if(br!=null){br.close();}
		if(bw!=null){bw.close();}
		if(fw!=null){fw.close();}
		if(fr!=null){fr.close();}
	}
}