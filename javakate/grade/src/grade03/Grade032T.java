package grade03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//2020-06-08
//Map�� �̿��ؼ� �л��������α׷�
//IO�̿��ؼ� ���� �ѵ� ������ �����ǰ�

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
			String msg=new String(by);//txt ���� ��ü ������ msg�� �о��
//			System.out.println(msg);
			String[] msgs=msg.split("\n");//�л� �Ѹ��� ���� msgs �迭�� ����.
//			System.out.println(msgs[0]);
//			System.out.println(msgs[1]);
//			System.out.println(msgs[2]);
			for(int i=0; i<msgs.length; i++){
				String temp=msgs[i];
				String[] ele=temp.split(",");//�л����� �������� ele �迭�� ����.
//				System.out.println(Arrays.toString(ele));
				HashMap<String,String> map=new HashMap<>();//ele�迭�� ���� data�� ����.
				map.put("num", ele[0]);
				map.put("name", ele[1]);
				map.put("kor", ele[2]);
				map.put("eng", ele[3]);
				map.put("math", ele[4]);
				data.add(map);
			}
		}
		String title="�л������������α׷�(Ver 0.3.2)";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����>>";
		System.out.println(title);
		System.out.println("------------------------------\n\n");
		Scanner sc=new Scanner(System.in);
		String input=null;
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if("0".equals(input)){
				//������ �� �����ϱ�
				String tempDate="";
				File file=new File(path);
				FileOutputStream fos=null;
				//���Ͽ� �����͸��ۼ��ϱ� ���� ���� ������ �������� ������ ������ ����
				if(!file.exists());{
					try {
						file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				//���Ͽ� �����͸� ���� �ۼ����� ���� �����͸� ���ڿ��� ����
				//���߿� ���ڿ��� �о���� �� ��� ������ �����ϱ� ���� , \n���� ������.
				for(int i=0; i<data.size(); i++){
					HashMap<String, String> stu=data.get(i);
					String num=stu.get("num");
					String name=stu.get("name");
					String kor=stu.get("kor");
					String eng=stu.get("eng");
					String math=stu.get("math");
					tempDate+=num+","+name+","+kor+","+eng+","+math+"\n";
				}
				//������� ���ڿ��� ���Ͽ� ����
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
				System.out.println("�̿��� �ּż� �����մϴ�");
				break;
			}else if("1".equals(input)){
				//����
				System.out.println("------------------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|�հ�\t|���");
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
				//�Է�
				HashMap<String,String> stu=null;
				stu=new HashMap<>();
				System.out.print("�й�>>");
				stu.put("num", sc.nextLine());
				System.out.print("�̸�>>");
				stu.put("name", sc.nextLine());
				System.out.print("����>>");
				stu.put("kor", sc.nextLine());
				System.out.print("����>>");
				stu.put("eng", sc.nextLine());
				System.out.print("����>>");
				stu.put("math", sc.nextLine());
				data.add(stu);
			}else if("3".equals(input)){
				//����
				System.out.print("������ �й�>>");
				input=sc.nextLine();
				for(int i=0;i<data.size(); i++){
					HashMap<String, String> stu=data.get(i);
					if(input.equals(stu.get("num"))){
						stu.put("num", input);//���ʿ����� �ʳ�???
						System.out.print("�̸�>>");
						stu.put("name", sc.nextLine());
						System.out.print("����>>");
						stu.put("kor", sc.nextLine());
						System.out.print("����>>");
						stu.put("eng", sc.nextLine());
						System.out.print("����>>");
						stu.put("math", sc.nextLine());
						break;
					}
				}
			}else if("4".equals(input)){
				//����
				System.out.print("������ �й�>>");
				input=sc.nextLine();
				for(int i=0;i<data.size(); i++){
					HashMap<String, String> stu=data.get(i);
					if(input.equals(stu.get("num"))){
						data.remove(i);
						break;
					}
				}
			}else{
				System.out.println("�Է¿���");
				System.out.println("�ٽ� Ȯ���Ͻð� �Է��� �ּ���");
			}
		}
		sc.close();
	}
}