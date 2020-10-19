package com.bit.day24;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//�����Ǵ� ���� Ȱ��

public class Ex07 {

	public static void main(String[] args) {

		String path="data.bin";//���⼭ �о
		String path2="data2.bin";//���⿡ �Ẹ��
		File src=new File(path);
		File target=new File(path2);
		
		FileInputStream fis=null;
		FileOutputStream fos=null;

		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
//		byte[] buf=new byte[8];
		//��������� ���۸� �ϳ� ���ؼ� ������ �ø� �� ������ �ڿ��Ҹ�� �� ����.
		//������ ����. ���� ��Ȳ�� ���� ����
		
		try {
			fis=new FileInputStream(src);
			fos=new FileOutputStream(target);
			
			bis=new BufferedInputStream(fis);//�̹� bis��ü�� �����Ǹ鼭 fis ���� ��Ƴ��� ����.
			bos=new BufferedOutputStream(fos);
			
			while(true){
				int su=bis.read();//�ϳ��� ����Ʈ ��
//				su=bis.read(buf);//buf[]�� ũ��, �� ���� ù������ 8
				if(su==-1){break;}
				bos.write(su);//���۰� ���� ���۸� ���鼭 ��.
//				bos.write(buf,0,su);
			}
			bos.flush();//���۰� ���� �ʾƵ� ���ۿ� �ִ� ���� �о.
			//�ݺ��� �ȿ� �̰� ������ ������ �ϳ����� �о�� ȿ�� ������
			//����: ���۰� �� ���� �ʾƵ� ���� ���ϴ� ��� ���� �о.
			//close�� �ϸ� �ڵ����� flush�� ȣ���ϰ� ����.
			//close �� �ȿ��ϴµ� �����͸� �о�� ���� �� ���
			System.out.println("����Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(bos!=null){bos.close();}//������ �������� close
				if(bis!=null){bis.close();}
				if(fos!=null){fos.close();}
				if(fis!=null){fis.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}