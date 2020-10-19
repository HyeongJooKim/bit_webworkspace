package grade03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//DataStream 이용해서 입출력 자료형 유지(입력,보기만 해봐라)
//자료구조 안쓰게 개선
//Exception 안쓰고 하기

public class Grade033T3 {

	public static void main(String[] args){

		String path="data3.bin";
		File file=new File(path);
		if(!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		Scanner sc=new Scanner(System.in);
		String title="학생성적관리프로그램(Ver 0.3.3)";
		String bar="";
		for(int i=0; i<title.length();i++)bar+="--";
		String menu="1.보기 2.입력 0.종료>>";
		String input=null;
		System.out.println(title);
		System.out.println(bar);
		System.out.println();
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		DataInputStream dis=null;
		DataOutputStream dos=null;
		
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")){//종료
				System.out.println("이용해 주셔서 감사합니다");
				break;
			}else if(input.equals("1")){//보기
				System.out.println(bar);
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|합계\t|평균");
				System.out.println(bar);
				try {
					fis=new FileInputStream(file);
					dis=new DataInputStream(fis);
					while(true){
						int su=dis.read();
						if(su==-1)break;
						int num=dis.readInt();
						String name=dis.readUTF();
						int kor=dis.readInt();
						int eng=dis.readInt();
						int math=dis.readInt();
						int tot=kor+eng+math;
						double avg=tot*100/3/100.0;
						
						System.out.print(num+"\t|");
						System.out.print(name+"\t|");
						System.out.print(kor+"\t|");
						System.out.print(eng+"\t|");
						System.out.print(math+"\t|");
						System.out.print(tot+"\t|");
						System.out.println(avg);
					}
				} catch (FileNotFoundException e) {
				} catch (EOFException e) {
				} catch (IOException e) {e.printStackTrace();
				} finally{
					try {
						if(dis!=null)dis.close();
						if(fis!=null)fis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}else if(input.equals("2")){//입력
				System.out.print("학번>>");
				int num=sc.nextInt();
				sc.nextLine();
				System.out.print("이름>>");
				String name=sc.nextLine();
				System.out.print("국어>>");
				int kor=sc.nextInt();
				System.out.print("영어>>");
				int eng=sc.nextInt();
				System.out.print("수학>>");
				int math=sc.nextInt();
				sc.nextLine();
				
				//기존 값을 임시파일에 복사해두기
				File temp=new File("temp.bin");
				try {
					fis=new FileInputStream(file);
					fos=new FileOutputStream(temp);
					while(true){
						int su=fis.read();
						if(su==-1)break;
						fos.write(su);
					}
				} catch (FileNotFoundException e) {e.printStackTrace();
				} catch (IOException e) {e.printStackTrace();
				} finally{try {
						if(fis!=null)fis.close();
						if(fos!=null)fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}	

				try {
					//기존 데이터 넣기
					fis=new FileInputStream(temp);
					fos=new FileOutputStream(file);
					dis=new DataInputStream(fis);
					dos=new DataOutputStream(fos);
					while(true){
						int su=dis.read();
						if(su==-1)break;
						dos.write(su);
						dos.writeInt(dis.readInt());
						dos.writeUTF(dis.readUTF());
						dos.writeInt(dis.readInt());
						dos.writeInt(dis.readInt());
						dos.writeInt(dis.readInt());
					}
					//새자료 입력하면 덮어쓰는 문제 발생
					dos.write(0);
					dos.writeInt(num);
					dos.writeUTF(name);
					dos.writeInt(kor);
					dos.writeInt(eng);
					dos.writeInt(math);
				} catch (FileNotFoundException e) {e.printStackTrace();
				} catch (IOException e) {e.printStackTrace();
				} finally{try {
						if(dis!=null)dis.close();
						if(dos!=null)dos.close();
						if(fis!=null)fis.close();
						if(fos!=null)fos.close();
						temp.delete();
					} catch (IOException e) {e.printStackTrace();
					}
				}
			}
		}
		sc.close();
	}
}