package com.bit.day24;

//����ó�� �غ���
//�ӵ��� ���� ���� IO�۾��� ���۸� ���������ν� ó���ӵ��� �ø� �� �ִ�.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		String path="data.bin";//���⼭ �о
		String path2="data2.bin";//���⿡ �Ẹ��
		File file=new File(path);
		File file2=new File(path2);

		if(!file2.exists()){
			try {
				file2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		byte[] buf=new byte[128];//���� �ָ� �ݺ��� ����, ũ�� �ָ� �ݺ��� ���� �� ��, �Ʒ����� ����Ǵ� ����� ����. ��Ȯ�ϰ� ���� ��.
		//�ʹ� �۰� �ָ� ���� �߻�.
		//����ũ�� ���ڶ�� �ٽ� ���� �Ǵµ� �ٽ� �� �� ���� ���� ���Ƽ� ����.
		//�ݺ��� ������ �Űܼ� �Ź� ���� �����ϰ� �������.
		//�׷��� �ذ�� ������ ���̴� ��. ���ϻ����� ���� �ٸ���.
		//����� ������ĭ�� ��ĭ�� ������ ��.
		//���ڿ� �ƴ� ���� ���� ����� �ȵ�.
		//���� �ذ��Ϸ��� ���� ũ�⸦ ���� ũ�⸸ŭ������ ����� ��.
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {

			fis=new FileInputStream(file);
			fos=new FileOutputStream(file2);
			while(true){
				int su=fis.read(buf);
				if(su==-1){break;}
				fos.write(buf,0,su);//0	���� su�� ��ŭ ���. �о���� su��ŭ�� �����ϴ� ��.
			}
			System.out.println("����Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fos!=null){try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}}
		}
	}
}
