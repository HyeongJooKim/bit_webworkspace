package jump2java;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		
		String[] numbers={"one","two","three"};
		
//		for(int i=0; i<numbers.length; i++){
//			System.out.println(numbers[i]);
//		}
		
		//for each 로 바꾸면
		//구조
		//for(Type 변수명 : 반복할객체명){//Type: 반복할객체를 이루는 값의 타입 반복가능한객체(Array, ArrayList등)
		//    반복실행문(변수명);}

		for(String a : numbers){//String[] 하니 오류남.
			System.out.println(a);
		}
		
		System.out.println("---------------------");
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("thre");
		
		for(String a : al){//ArrayList를 넣는 게 아니라 정말 그 배열을 이루는 값의 타입을 쓰는 거네
			System.out.println(a);
		}
		//전체를 반복할 때 유용
	}
}
