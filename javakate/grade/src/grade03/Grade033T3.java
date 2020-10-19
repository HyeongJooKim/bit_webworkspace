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

//DataStream �̿��ؼ� ����� �ڷ��� ����(�Է�,���⸸ �غ���)
//�ڷᱸ�� �Ⱦ��� ����
//Exception �Ⱦ��� �ϱ�

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
		String title="�л������������α׷�(Ver 0.3.3)";
		String bar="";
		for(int i=0; i<title.length();i++)bar+="--";
		String menu="1.���� 2.�Է� 0.����>>";
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
			if(input.equals("0")){//����
				System.out.println("�̿��� �ּż� �����մϴ�");
				break;
			}else if(input.equals("1")){//����
				System.out.println(bar);
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|�հ�\t|���");
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
			}else if(input.equals("2")){//�Է�
				System.out.print("�й�>>");
				int num=sc.nextInt();
				sc.nextLine();
				System.out.print("�̸�>>");
				String name=sc.nextLine();
				System.out.print("����>>");
				int kor=sc.nextInt();
				System.out.print("����>>");
				int eng=sc.nextInt();
				System.out.print("����>>");
				int math=sc.nextInt();
				sc.nextLine();
				
				//���� ���� �ӽ����Ͽ� �����صα�
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
					//���� ������ �ֱ�
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
					//���ڷ� �Է��ϸ� ����� ���� �߻�
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