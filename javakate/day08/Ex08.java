package day08;
/*
class Car{
	String model="";
	int accel=20;
	int speed=0;
	int limit=150;

	public void speedUp(){
		speed+=accel;
		if(speed>limit){speed=limit;}
	}

	public void speedDown(){
		speed-=accel+10;
		if(speed<0){speed=0;}
	}
}

class Ex08{
	public static void main(String[] arg) {
		//조건 모닝 시속 150제한. -는 불가
		Car myCar=null;//null로 해주면 차량 선택 안하고실행하면 오류나게 됨
		String menu="1.차량선택 2.가속 3.감속 0.종료 >>";
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);
		int input=0;
		while(true){
			System.out.print(menu);
			input=sc.nextInt();
			if(input==0){break;}
			else if(input==1){
				System.out.println("차량을 선택하세요");
				System.out.print("1.모닝 2.K3 3.셀토스 >>");
				input=sc.nextInt();
					if(input==1){
						myCar=new Car();
						myCar.model="모닝";
						myCar.accel=10;
						myCar.limit=150;
					}else if(input==2){
						myCar=new Car();
						myCar.model="K3";
						myCar.accel=14;
						myCar.limit=180;
					}else if(input==3){
						myCar=new Car();
						myCar.model="셀토스";
						myCar.accel=18;
						myCar.limit=220;
					}
			}
			else if(myCar!=null&&input==2){myCar.speedUp();}
			else if(myCar!=null&&input==3){myCar.speedDown();}
			if(myCar!=null){
				System.out.println("내 차 "+myCar.model+"의 현재속도는 "+myCar.speed+"Km입니다");
			}
		}
	}
}*/