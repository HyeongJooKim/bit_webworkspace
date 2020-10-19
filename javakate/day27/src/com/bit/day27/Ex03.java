package com.bit.day27;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

//�������� ���� ��������
//�������� ���Ϸ� �����ؿ���
//�ٿ�ε� ��ũ�� ������ ���� �ٿ�ε嵵 �ǰ�

public class Ex03 {

	public static void main(String[] args) {

		File file=new File("copy\\index.html");

		String path="https://www.naver.com/";
		URL url=null;
		URLConnection conn=null;
		InputStream is=null;
		InputStreamReader isr=null;
		OutputStream os=null;
		try {
			url=new URL(path);
			conn=url.openConnection();
			is=conn.getInputStream();
			os=new FileOutputStream(file);
//			isr=new InputStreamReader(is);
			int su=-1;
//			while((su=isr.read())!=-1){
			while((su=is.read())!=-1){
				os.write(su);
//				System.out.print((char)su);
			}
		} catch (MalformedURLException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();
		} finally{
			try {
				if(isr!=null)isr.close();
				if(is!=null)is.close();
			} catch (IOException e) {e.printStackTrace();
			}
		}
	}
}