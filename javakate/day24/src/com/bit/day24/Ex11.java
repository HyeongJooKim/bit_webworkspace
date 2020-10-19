package com.bit.day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//ũ�⸦ �𸣴� ���ڿ� ������ �����Ѵٸ�?

public class Ex11 {

	public static void main(String[] args) {

		String path="data.bin";//���⼭ �о
		String path2="data2.bin";//���⿡ �Ẹ��
		File src=new File(path);
		File target=new File(path2);
		
		FileReader fr=null;
		FileWriter fw=null;
		char[] cbuf=new char[5];//Ȧ���� �൵ ���� �ȳ��� ���ڿ� ó�� �� ��
		
		try {
			fr=new FileReader(src);
			fw=new FileWriter(target);
			
			while(true){
//				int su=fr.read();
				int su=fr.read(cbuf,0,cbuf.length);
				if(su==-1){break;}
//				fw.write(su);
				fw.write(cbuf,0,su);
			}
			fw.flush();
			System.out.println("����Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fr!=null){fr.close();}
				if(fw!=null){fw.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
