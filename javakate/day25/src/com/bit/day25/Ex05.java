package com.bit.day25;

//io���� ����Ʈ��Ʈ���� ���ڿ���Ʈ��
//�׿� �ټ� �̸� ���� ���ͽ�Ʈ��(���۵�,����Ʈ, ���)
//�� ���� ������ ���� ���� ���ư� �� ����.
//���ͽ�Ʈ��: ���ڷ��̼� ���Ͽ� ���� �ۼ��� �ڵ� ������� ������.

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		
		String path="data1.txt";
		File file=new File(path);
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		
		fw=new FileWriter(file);
//		bw=new BufferedWriter(fw);
//		pw=new PrintWriter(bw);
		pw=new PrintWriter(fw);//���� ���� �̷��Ե� ����
		while(true){
			String msg=sc.nextLine();
			if(msg.isEmpty())break;//���� �ι� ġ�� ����.
//			bw.write(msg);
//			bw.newLine();
			pw.println(msg);//newLine();���̵� ���� �� ��
		}
		if(pw!=null)pw.close();
		if(bw!=null)bw.close();
		if(fw!=null)fw.close();
		//{}������ ���. �����ϸ� �� ���ٿ��� ��ȿ��.
		//{}�����ϴ� ��� ���� ���� �ٷ� ������ ����. ������ �������� �ʰ�.
		sc.close();
	}
}