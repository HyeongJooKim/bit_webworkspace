package grade03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//DataStream �̿��ؼ� ����� �ڷ��� ����(�Է�,���⸸ �غ���)

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
		String title="�л������������α׷�(Ver 0.3.3)";
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����>>";
		
		String input=null;
		System.out.println(title);
		System.out.println("------------------------------");
		
		int cnt=0;
		
		while(true){
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")){//����
				System.out.println("�̿��� �ּż� �����մϴ�");
				break;
			}else if(input.equals("1")){//����
				System.out.println("------------------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|�հ�\t|���");
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
			}else if(input.equals("2")){//�Է�
				System.out.print("�й�>>");
				dos.writeInt(sc.nextInt());
				sc.nextLine();
				System.out.print("�̸�>>");
				dos.writeUTF(sc.nextLine());
				System.out.print("����>>");
				dos.writeInt(sc.nextInt());
				System.out.print("����>>");
				dos.writeInt(sc.nextInt());
				System.out.print("����>>");
				dos.writeInt(sc.nextInt());
				sc.nextLine();
				cnt++;
			}
		}	
		if(dis!=null)dis.close();
		if(fis!=null)fis.close();
		if(dos!=null)dos.close();
		if(fos!=null)fos.close();
		//�̷��� �ָ��� ������ �ȵȴ� ��. �ü���� ��Ȳ�� ���� �� �������� ������,
		//GC�� ���� �ڷ� ����� ���� ����. �� ���� �ٷιٷ� �ݾ���� ��.
		//������ ����ų ���ɼ��� ���� ���ٰ� ��.
		sc.close();
	}
}