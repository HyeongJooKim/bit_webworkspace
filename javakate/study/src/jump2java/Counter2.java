package jump2java;

class Updater2{
	public void updater(Counter2 counter){
		counter.cnt++;
	}//객체를 받아 객체 자체의 값을 변화시키면 그 값이 유지됨.
}

public class Counter2 {
	
	int cnt=0;//객체변수

	public static void main(String[] args) {
		Counter2 myc=new Counter2();
		System.out.println("before:"+myc.cnt);//0
		Updater2 myu=new Updater2();
		myu.updater(myc);//int cnt 만을 받아 더해진 값을 받는 객체가 없음.
		System.out.println("after:"+myc.cnt);//1
	}

}
