package jump2java;

class Updater{
	public void updater(int cnt){
		cnt++;
	}
}

public class Counter {
	
	int cnt=0;//객체변수

	public static void main(String[] args) {
		Counter myc=new Counter();
		System.out.println("before:"+myc.cnt);//0
		Updater myu=new Updater();
		myu.updater(myc.cnt);//int cnt 만을 받아 더해진 값을 받는 객체가 없음.
		System.out.println("after:"+myc.cnt);//0
	}

}
