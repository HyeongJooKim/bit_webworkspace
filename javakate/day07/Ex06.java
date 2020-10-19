package day07;

class Ex06{

 public static int func(int a){
	System.out.println("func run...");
	if(a==0){
		return 0;
	}
	a--;
	return func(a);//문법적으로는 ok지만 무한 루프. 재귀함수.
	
 } 


 public static void main(String[] args){
	func(5);// 무한 loop에 빠짐


 }

}