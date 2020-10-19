package grade03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//2020-06-08
//Map을 이용해서 학생성적프로그램
//IO이용해서 껐다 켜도 데이터 유지되게

public class Grade032T {

	public static void main(String[] args) {
		String path="data.bin";
		//data loading
		File loadFile=new File(path);
		FileInputStream fis=null;
		ArrayList<Byte> buf=new ArrayList<>();
		ArrayList<HashMap<String, String>> data=null;
		data=new ArrayList<>();
		if(loadFile.exists()){
			try {
				fis=new FileInputStream(loadFile);
				while(true){
					int su=fis.read();
					if(su==-1){break;}
					buf.add((byte)su);
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
			Object[] obj=buf.toArray();
			byte[] by=new byte[obj.length];
			for(int i=0; i<by.length; i++){
				by[i]=(byte)obj[i];
			}
			String msg=new String(by);//txt 파일 전체 내용을 msg로 읽어옴
//			System.out.println(msg);
			String[] msgs=msg.split("\n");//학생 한명의 값을 msgs 배열에 담음.
//			System.out.println(msgs[0]);
//			System.out.println(msgs[1]);
//			System.out.println(msgs[2]);
			for(int i=0; i<msgs.length; i++){
				String temp=msgs[i];
				String[] ele=temp.split(",");//학생마다 성적값을 ele 배열에 담음.
//				System.out.println(Arrays.toString(ele));
				HashMap<String,String> map=new HashMap<>();//ele배열의 값을 data에 담음.
				map.put("num", ele[0]);
				map.put("name", ele[1]);
				map.put("kor", ele[2]);
				map.put("eng", ele[3]);
				map.put("math", ele[4]);
				data.add(map);
			}
		}
		String title="학생성적관리프로그램(Ver 0.3.2)";
		String menu="1.보기 2.입력 3.수정 4.삭제 0.종료>>";
		System.out.println(title);
		System.out.println("------------------------------\n\n");
		Scanner sc=new Scanner(System.in);
		String input=null;
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if("0".equals(input)){
				//종료전 값 저장하기
				String tempDate="";
				File file=new File(path);
				FileOutputStream fos=null;
				//파일에 데이터를작성하기 위해 먼저 파일이 존재하지 않으면 파일을 생성
				if(!file.exists());{
					try {
						file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				//파일에 데이터를 쉽게 작성하지 위해 데이터를 문자열로 가공
				//나중에 문자열을 읽어들일 때 어떻게 나눌지 결정하기 위해 , \n으로 연결함.
				for(int i=0; i<data.size(); i++){
					HashMap<String, String> stu=data.get(i);
					String num=stu.get("num");
					String name=stu.get("name");
					String kor=stu.get("kor");
					String eng=stu.get("eng");
					String math=stu.get("math");
					tempDate+=num+","+name+","+kor+","+eng+","+math+"\n";
				}
				//만들어진 문자열을 파일에 쓰기
				try {
					fos=new FileOutputStream(file);
					byte[] su=tempDate.getBytes();
					for(int i=0; i<su.length; i++){
						fos.write((int)su[i]);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					if(fos!=null){try {
						fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}}
				}
				System.out.println("이용해 주셔서 감사합니다");
				break;
			}else if("1".equals(input)){
				//보기
				System.out.println("------------------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|합계\t|평균");
				System.out.println("------------------------------------------------------");
				for(int i=0; i<data.size();i++ ){
					HashMap<String,String> stu=data.get(i);
					int num=Integer.parseInt(stu.get("num"));
					String name=stu.get("name");
					int kor=Integer.parseInt(stu.get("kor"));
					int eng=Integer.parseInt(stu.get("eng"));
					int math=Integer.parseInt(stu.get("math"));
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
			}else if("2".equals(input)){
				//입력
				HashMap<String,String> stu=null;
				stu=new HashMap<>();
				System.out.print("학번>>");
				stu.put("num", sc.nextLine());
				System.out.print("이름>>");
				stu.put("name", sc.nextLine());
				System.out.print("국어>>");
				stu.put("kor", sc.nextLine());
				System.out.print("영어>>");
				stu.put("eng", sc.nextLine());
				System.out.print("수학>>");
				stu.put("math", sc.nextLine());
				data.add(stu);
			}else if("3".equals(input)){
				//수정
				System.out.print("수정할 학번>>");
				input=sc.nextLine();
				for(int i=0;i<data.size(); i++){
					HashMap<String, String> stu=data.get(i);
					if(input.equals(stu.get("num"))){
						stu.put("num", input);//불필요하지 않나???
						System.out.print("이름>>");
						stu.put("name", sc.nextLine());
						System.out.print("국어>>");
						stu.put("kor", sc.nextLine());
						System.out.print("영어>>");
						stu.put("eng", sc.nextLine());
						System.out.print("수학>>");
						stu.put("math", sc.nextLine());
						break;
					}
				}
			}else if("4".equals(input)){
				//삭제
				System.out.print("삭제할 학번>>");
				input=sc.nextLine();
				for(int i=0;i<data.size(); i++){
					HashMap<String, String> stu=data.get(i);
					if(input.equals(stu.get("num"))){
						data.remove(i);
						break;
					}
				}
			}else{
				System.out.println("입력오류");
				System.out.println("다시 확인하시고 입력해 주세요");
			}
		}
		sc.close();
	}
}