package jump2java;

class Updater2{
	public void updater(Counter2 counter){
		counter.cnt++;
	}//��ü�� �޾� ��ü ��ü�� ���� ��ȭ��Ű�� �� ���� ������.
}

public class Counter2 {
	
	int cnt=0;//��ü����

	public static void main(String[] args) {
		Counter2 myc=new Counter2();
		System.out.println("before:"+myc.cnt);//0
		Updater2 myu=new Updater2();
		myu.updater(myc);//int cnt ���� �޾� ������ ���� �޴� ��ü�� ����.
		System.out.println("after:"+myc.cnt);//1
	}

}
