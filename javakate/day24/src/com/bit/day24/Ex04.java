package com.bit.day24;

//����ó�� �غ���

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {

		String path="data.bin";
		File file=new File(path);
		FileInputStream fis=null;
		byte[] buf=new byte[128];
		//[1]�̸� �ѹ��� 1byte �д� ��. �濡 �ϸ� �ѹ��� ���� �о��. �ѹ��� �۾��� �ϸ� �Ǵ�, ���� ������. 
		if(file.exists()){
			try {
				fis=new FileInputStream(file);
				
				while(true){
					int su=fis.read(buf);
					if(su==-1){break;}
					System.out.println(new String(buf));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				if(fis!=null){try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}}
			}
		}
	}
}
