package jump2java;

class Updater{
	public void updater(int cnt){
		cnt++;
	}
}

public class Counter {
	
	int cnt=0;//��ü����

	public static void main(String[] args) {
		Counter myc=new Counter();
		System.out.println("before:"+myc.cnt);//0
		Updater myu=new Updater();
		myu.updater(myc.cnt);//int cnt ���� �޾� ������ ���� �޴� ��ü�� ����.
		System.out.println("after:"+myc.cnt);//0
	}

}
