package grade04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//ObjectStream - ��ü ����ȭ(Serialization)�� �ʿ�
//��ü����ȭ�� ����� ����� ����ʵ�(��, instance variable��)
//static �ʵ�� ��ü����ȭ�� ����� �ƴ�.
//�޼ҵ嵵 ����ȭ�� ����� �ƴ�.

//�޸� �̾߱� �ٽ�
//��ü�� ������ �� ����� �ʵ��� ���� ��ü�� ���ԵǾ� heap ������ ����Ǵ� ��.
//method�� ��ü�� �����ɶ����� �Ż��� ������ ����. �̰� class�� �����ο��� ������ �Ŵ�,
//��ü�� ���ٰ� �ؼ� �޶��� ������ ����, ����� ��ü�� ������ ���� �ʴ�.
//�޸� ���� 3�� �̾߱� �� ���� �������� ������ ���������� ������ �ִ� ���� �ƴϴ�.
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
//			oos.writeObject(new Student(1,"ȫ�浿",90,80,70));
			
			Student stu=new Student(1,"ȫ�浿",90,80,70);
			oos.writeObject(stu);
			stu.show();//transient ���� �� �� �� �� Ȯ���� �� ����. �׷���. read�ϸ� �Ⱥ���. 
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
