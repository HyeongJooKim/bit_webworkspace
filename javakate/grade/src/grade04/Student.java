package grade04;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//�̰� �������� ������ �ڵ��ο���. ���� �ٲٸ� ��ȣ �ڵ����� �ٲ�.
	//�̷��� ���������� �ٲ� �� ������ �������ϰ� ����� �� ����,
	//������ �� �ø����ȣ �ٸ��� �ν� ����.
	//�Ȳ������� �׳� �۾��ϴ� �� ���� ��. �׷��� �����
	public int num;
	transient String name;
	//transient: ��ü ����ȭ�� ���� ���. ���� ������ �ȵ�. method�� ���ؼ��� �Ⱥ���.
	//�ʵ�� ������, ���� ����� ���� ��
	protected int kor;//static ���̸� ois.read�ȵ�. oos.write�� ��.
	int eng;
	private int math;//�ʵ����� ����. ois.read�ȵ�. oos.write�� ��.

	public Student(int num, String name, int kor, int eng, int math){
		this.num=num;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public void show(){
		System.out.println(num+"�� "+name+"�� ���� "+kor+"��, ���� "+eng+"��, ���� "+math+"���Դϴ�");
	}
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", kor=" + kor
				+ ", eng=" + eng + ", math=" + math + "]";
	}
}//Student end
