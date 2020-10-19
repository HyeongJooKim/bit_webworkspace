package day08;

class Bank{
	int money;//static 변수 활용예
	public void add(int a){
		money+=a;
	}
	public void minus(int a){
		money-=a;
	}
	public void print(){
		System.out.println("잔금:"+money+"원");
	}
}

class Ex07{
	public static void main(String[] arg) {
		
		Bank hana=new Bank();
		hana.add(1000);
		hana.minus(200);
		hana.minus(250);
		Bank woori=new Bank();
		woori.add(10000);
		hana.minus(300);
		System.out.print("하나은행 ");
		hana.print();
		System.out.print("우리은행 ");
		woori.print();
	}
}