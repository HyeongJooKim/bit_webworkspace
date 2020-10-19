package com.bit.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {

		String path="data.bin";
		File file=new File(path);
		FileInputStream fis=null;
//		byte[] by=new byte[(int)file.length()];
//		//��� file ũ���� ������ byte�̹Ƿ� �� ũ�⸸ŭ �����Ͱ� �ִ� ��.
//		if(file.exists()){
//			try {
//				fis=new FileInputStream(file);
//				for(int i=0; i<file.length();i++){
//					int su=fis.read();
//					if(su==-1){break;}
//					by[i]=(byte)su;
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}finally{
//				if(fis!=null){try {
//					fis.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}}
//			}
//			System.out.println(new String(by));
//		}

		List<Byte> list=new ArrayList<Byte>();
		if(file.exists()){
			try {
				fis=new FileInputStream(file);
				while(true){//������ ũ�⸦ �� ��� while�� �ϰ� su==-1�̸� ������
					int su=fis.read();
					if(su==-1){break;}
					list.add((byte)su);
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
//			byte[] bys=list.toArray(new byte[0]);//java���������Ǿ�� �ϳ� ��Ŭ�������� ���� �ִ� �� 
			Object[] obj=list.toArray();
			byte[] by=new byte[list.size()];
			for(int i=0; i<list.size();i++){
				by[i]=list.get(i);
			}
			System.out.println(new String(by));
		}
	}
}
