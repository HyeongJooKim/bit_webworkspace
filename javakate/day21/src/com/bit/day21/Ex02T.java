package com.bit.day21;//선생님코딩

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Ex02T {

	public static void main(String[] args) {
		String path=".";
		File file=new File(path);
		if(file.exists()){
			String[] temp=file.list();
			String[] dirs=new String[temp.length+2];
			dirs[0]=".";
			dirs[1]="..";
			System.arraycopy(temp,0,dirs,2, temp.length);
			for(int i=0; i<dirs.length;i++){
				String filename=dirs[i];
				File f=new File(filename);
				long time=f.lastModified();
				Date day=new Date(time);
				SimpleDateFormat sdf=new SimpleDateFormat();//이게 제일 좋네
				sdf.applyPattern("yyyy-mm-dd a hh:mm");
				String msg=sdf.format(day);
				System.out.print(msg+"\t");
				if(f.isDirectory()){
					System.out.print("<DIR>\t\t");
				}else{
					System.out.print("\t"+f.length()+"\t");
				}
				System.out.println(dirs[i]);
			}
		}else{
			System.out.println("error");
		}
	}
}