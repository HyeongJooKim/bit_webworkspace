package com.bit.day20;

//Map
//HashMap<K,V>: key는 중복불가, value는 중복가능. key를 중복하면 후에 입력한 value를 덮어씀

public class Ex09 {

	public static void main(String[] args) {
		java.util.Map map1=new java.util.HashMap();
		
		map1.put("key1", "val1");
		map1.put("key2", "val2");
		map1.put("key3", "val3");
		map1.put("key4", "val4");
		map1.put("key1", "new val1");
		map1.put(1234, "ABCD");
		map1.put(true, "진짜");
		map1.put(null, "빈값");//가능은 하나, 없는 key 호출한 것과 동일한 결과 나오므로 혼란스러우니 쓰지 말자.
		
		System.out.println(map1.get("key1"));//key를 넣으면 해당하는 value 출력
		//없는 key get하면 null 출력
		System.out.println(map1.get(1234));
		System.out.println(map1.get(true));
		System.out.println(map1.get(null));
	}
}