package grade03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//DataStream 이용해서 입출력 자료형 유지(입력,보기만 해봐라)

public class Grade033M {
		
	public static void main(String[] args) throws IOException {
		
		String path="data.bin";
		File file=new File(path);
		FileInputStream fis=null;
		DataInputStream dis=null;
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		
		fis=new FileInputStream(file);
		dis=new DataInputStream(fis);
		fos=new FileOutputStream(file);
		dos=new DataOutputStream(fos);

		Scanner sc=new Scanner(System.in);
		String title="학생성적관리프로그램(Ver 0.3.3)";
		String menu="1.보기 2.입력 3.수정 4.삭제 0.종료>>";
		
		String input=null;
		System.out.println(title);
		System.out.println("------------------------------");
		
		int cnt=0;
		
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")){//종료
				System.out.println("이용해 주셔서 감사합니다");
				break;
			}else if(input.equals("1")){//보기
				System.out.println("------------------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|합계\t|평균");
				System.out.println("------------------------------------------------------");

				fis=new FileInputStream(file);
				dis=new DataInputStream(fis);
				for(int i=0; i<cnt; i++){
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
				System.out.println("------------------------------------------------------");
			}else if(input.equals("2")){//입력
				System.out.print("학번>>");
				dos.writeInt(sc.nextInt());
				sc.nextLine();
				System.out.print("이름>>");
				dos.writeUTF(sc.nextLine());
				System.out.print("국어>>");
				dos.writeInt(sc.nextInt());
				System.out.print("영어>>");
				dos.writeInt(sc.nextInt());
				System.out.print("수학>>");
				dos.writeInt(sc.nextInt());
				sc.nextLine();
				cnt++;
			}
		}	
		if(dis!=null)dis.close();
		if(fis!=null)fis.close();
		if(dos!=null)dos.close();
		if(fos!=null)fos.close();
		//이렇게 멀리서 닫으면 안된다 함. 운영체제의 상황에 따라 잘 읽힐수도 있지만,
		//GC에 의해 자료 사라질 수도 있음. 다 쓰면 바로바로 닫아줘야 함.
		//문제를 일으킬 가능성이 아주 높다고 함.
		sc.close();
	}
}