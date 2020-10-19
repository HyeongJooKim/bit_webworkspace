package com.bit.day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//Map
//Hashtable - HashMap과 거의 유사하나 아래 차이점
//	동기화 보장됨

public class Ex17 {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<>();//무작위순으로 나옴
//		Map<String, String> map=new TreeMap<>();//소팅되어 나옴
		map.put("key2", "val2");
		map.put("key4", "val4");
		map.put("key1", "val1");
		map.put("key3", "val3");
		//Map의 key는 Set type
		//TreeMap의 key는 TreeSet type
		
//		Set<String> keys=map.keySet();
//		Iterator<String> ite=keys.iterator();
//		while(ite.hasNext()){
//			String key=ite.next();
//			System.out.println(key+":"+map.get(key));
//		}

		//정렬출력 다른 방법
		Set<Entry<String, String>> entrys= map.entrySet();
		Iterator<Entry<String,String>> ite=entrys.iterator();
		while(ite.hasNext()){
			Entry<String,String> entry = ite.next();
			System.out.println(entry.getKey()+"."+entry.getValue());
		}
		
		
	}

}
