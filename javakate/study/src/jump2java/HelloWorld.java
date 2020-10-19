package jump2java;

import java.util.ArrayList;
import java.util.HashMap;

public class HelloWorld {
	public static void main(String[] args){
		System.out.println("Hello World");

		System.out.println("--------------------------------------");
		
		ArrayList<Object> pitches = new ArrayList<Object>();
		pitches.add(100);
		pitches.add("200");
		pitches.add(300);
		pitches.add(400);
		pitches.add("가나다");
		pitches.add(600);
		pitches.add(4);
		System.out.println(pitches);//[100, 200, 300, 400, 가나다, 600, 4]
		
		System.out.println(pitches.get(2));//300
		System.out.println(pitches.size());//7
		
		System.out.println(pitches.remove("200"));//true. 값이 있으면 삭제하고 true 나옴. index 번호를 넣으면 삭제만 수행. 값을 넣으면 boolean 답 나옴
		System.out.println(pitches.remove("800"));//false. 값이 없으면 false 나옴.
		System.out.println(pitches);//[100, 300, 400, 가나다, 600, 4]
		System.out.println(pitches.remove(4));//600 출력 index 4번인 600을 지우고 지운 값을 출력. 정수를 넣으면 index 번호로 인식?
//		System.out.println(pitches.remove(400));//오류남. 정수를 넣으면 index 번호로 인식하는 모양
		System.out.println(pitches);//[100, 300, 400, 가나다, 4]
		System.out.println(pitches.contains("가나다"));//true
		System.out.println(pitches.contains(100));//true
		System.out.println(pitches.contains("100"));//false
		
		System.out.println("--------------------------------------");
		
		//Map : interface
			//HashMap
			//LinkedHashMap : 입력된 순서대로 데티터가 출력됨
			//TreeMap : 입력된 key의 소트순으로 데이터가 출력됨

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people","사람");
		map.put("baseball","야구");
		map.put("java","자바");
		System.out.println(map);//{java=자바, baseball=야구, people=사람}
		
		System.out.println(map.get("baseball"));//야구 출력
		System.out.println(map.containsKey("baseball"));//true 출력
		System.out.println(map.containsValue("baseball"));//false 출력
		System.out.println(map.containsValue("야구"));//true 출력
		
		System.out.println(map.remove("people"));//사람 출력되고 그 값이 삭제됨
		System.out.println(map);//{java=자바, baseball=야구}
		System.out.println(map.remove("base"));//null 나옴
		System.out.println(map.remove("자바"));//null 나옴. value만 넣으면 삭제 안되네
		System.out.println(map.size());//2
		
		System.out.println("--------------------------------------");
		
	}//main end
}//class end
