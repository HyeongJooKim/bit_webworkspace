package grade04;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//이걸 꺼내놓지 않으면 자동부여됨. 내용 바꾸면 번호 자동으로 바뀜.
	//이렇게 꺼내놓으면 바꿀 수 있으니 좀복잡하게 만드는 게 좋고,
	//협업할 때 시리얼번호 다르면 인식 못함.
	//안꺼내놓고 그냥 작업하는 게 나을 듯. 그래서 노란색
	public int num;
	transient String name;
	//transient: 객체 직렬화의 제외 대상. 값에 접근이 안됨. method를 통해서도 안보임.
	//필드는 있으나, 값을 숨기고 싶을 때
	protected int kor;//static 붙이면 ois.read안됨. oos.write은 됨.
	int eng;
	private int math;//필드접근 제한. ois.read안됨. oos.write은 됨.

	public Student(int num, String name, int kor, int eng, int math){
		this.num=num;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public void show(){
		System.out.println(num+"번 "+name+"은 국어 "+kor+"점, 영어 "+eng+"점, 수학 "+math+"점입니다");
	}
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", kor=" + kor
				+ ", eng=" + eng + ", math=" + math + "]";
	}
}//Student end
