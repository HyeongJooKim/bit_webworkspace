package grade04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//ObjectStream - 객체 직렬화(Serialization)가 필요
//객체직렬화의 대상은 대상의 멤버필드(즉, instance variable만)
//static 필드는 객체직렬화의 대상이 아님.
//메소드도 직렬화의 대상이 아님.

//메모리 이야기 다시
//객체를 생성할 때 사실은 필드의 값만 객체에 포함되어 heap 영역에 저장되는 것.
//method는 객체가 생성될때마다 신생될 이유가 없지. 이건 class의 디자인에서 정해진 거니,
//객체를 찍어낸다고 해서 달라질 이유가 없고, 사실은 객체가 가지고 있지 않다.
//메모리 영역 3층 이야기 한 것은 개념적인 것이지 물리적으로 나뉘어 있는 것은 아니다.
//

public class Grade040TOut {

	public static void main(String[] args) {
		String path="data5.bin";
		File file=new File(path);
		
		try {
			if(!file.exists())file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
//			oos.writeObject(new Student(1,"홍길동",90,80,70));
			
			Student stu=new Student(1,"홍길동",90,80,70);
			oos.writeObject(stu);
			stu.show();//transient 값도 다 잘 들어간 걸 확인할 수 있음. 그러나. read하면 안보임. 
		} catch (FileNotFoundException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();
		} finally{
			try {
				if(oos!=null)oos.close();
				if(fos!=null)fos.close();
			} catch (IOException e) {e.printStackTrace();
			}
		}
	}
}
