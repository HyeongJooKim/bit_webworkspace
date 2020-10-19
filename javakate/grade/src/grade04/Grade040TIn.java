package grade04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Grade040TIn {

	public static void main(String[] args) {

		String path="data5.bin";
		File file=new File(path);
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			
			Student stu;
			stu = (Student)ois.readObject();
			stu.show();
			System.out.println("�й�:"+stu.num);
			System.out.println("�̸�:"+stu.name);
			System.out.println("����:"+stu.kor);
			System.out.println("����:"+stu.eng);
//			System.out.println("����:"+stu.math);
			//math�� private�̶� �ʵ� ���� ���� �Ұ�. public method�� ���ؼ��� �� ������.
			System.out.println(stu);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();
		} finally{
			try {
				if(ois!=null)ois.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {e.printStackTrace();
			}
		}
	}

}
