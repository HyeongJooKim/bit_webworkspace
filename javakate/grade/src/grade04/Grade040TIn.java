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
			System.out.println("학번:"+stu.num);
			System.out.println("이름:"+stu.name);
			System.out.println("국어:"+stu.kor);
			System.out.println("영어:"+stu.eng);
//			System.out.println("수학:"+stu.math);
			//math는 private이라 필드 직접 접근 불가. public method를 통해서는 값 보였음.
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
