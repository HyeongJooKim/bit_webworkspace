package com.bit.day25;

//이 작업을 바이트스트림으로 해보겠다. (짧게 끝나네...)

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		
		String path="data1.txt";
		File file=new File(path);
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		PrintStream ps=null;
		
		fos=new FileOutputStream(file);
		bos=new BufferedOutputStream(fos);
		ps=new PrintStream(bos);

//		이렇게도 가능하나. 이렇게 하면 효용도 없고 println도 안되고 의미 없는 순서가 됨.
//		ps=new PrintStream(fos);
//		bos=new BufferedOutputStream(ps);

		while(true){
			String msg=sc.nextLine();
			if(msg.isEmpty())break;
			byte[] by=msg.getBytes();
//			fos.write(msg.getBytes());
			bos.write(by);
//			bos.newLine();//bos는 newLine() 없음
//			fos.write(by);
//			fos.write("\r\n".getBytes());
//			System.out.println(Arrays.toString(by));
			ps.println(msg);
			System.out.write(by);//이렇게도 가능. 불편함
		}
		if(bos!=null)bos.close();
		if(fos!=null)fos.close();
		sc.close();
	}
}