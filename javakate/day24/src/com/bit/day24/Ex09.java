package com.bit.day24;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//���ڿ���Ʈ��
//�ڹٿ����� �����ϴ� Ư���� ���.
//���ڿ� ��� Ưȭ�� ���. 2����Ʈ ü����.
//���� �̿��� �����͵� �а� �� �� �ְ�����, Ȧ�� �� �ڷ��� ��� ������ �� ����.

public class Ex09 {

	public static void main(String[] args) {

		String path="data.bin";//"���ڿ��� ����մϴ�"
		File file=new File(path);
		String msg="���ڿ� ��Ʈ���� ����\n���Ͽ� �ۼ��մϴ�";
		char[] arr=msg.toCharArray();
		java.io.FileReader fr=null;
		java.io.FileWriter fw=null;
		
		try {
			fw=new FileWriter(file);
//			for(int i=0; i<arr.length; i++){
//				fw.write(arr[i]);
//			}
			fw.write(msg);//�� for���� �̷��� �ᵵ ��.
			fw.flush();//�ʹ� ������ ��� �ȳ��� ��. �о
			
			fr=new FileReader(file);
			while(true){
				int su=fr.read();
				if(su==-1){break;}
				System.out.print((char)su);//2����Ʈ�� ���ڵ� ����. (char)��ȯ�ϸ� ���ڷ� ����
			}
		} catch (IOException e1) {
			e1.printStackTrace();
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