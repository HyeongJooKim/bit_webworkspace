package com.bit.day19;
//ArrayList의 method들. LinkedList에서도 동일함
import java.util.ArrayList;

public class Ex05 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add(111);
		list1.add(2222);
		list1.add(1, 3333);//index 1 자리에 끼워넣기
		list1.add(5555);
		
		ArrayList list2=new ArrayList();
		list2.addAll(list1);//깊은복사처럼 됨
		list2.clear();//모든 값 삭제
		
		ArrayList list3=(ArrayList)list1.clone();//깊은복사처럼 됨
		list1.add(4444);//1에만 추가됨. 복사한 2.3에는 안더해짐.
		list3.set(1,"clone");
		System.out.println(list3.toString());
		
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
		
		System.out.println("---------------------");
		
		for(int i=0; i<list2.size(); i++){
			System.out.println(list2.get(i));
		}
		
		System.out.println("---------------------");
		
		for(int i=0; i<list3.size(); i++){
			System.out.println(list3.get(i));
		}

		System.out.println(list1.contains(4444));//true
		System.out.println(list1.indexOf(3333));//1
		list1.add(3333);
		System.out.println(list1.indexOf(3333));//1 복수의 경우 첫값 반환
		System.out.println(list1.lastIndexOf(3333));//4
		System.out.println(list1.isEmpty());//false
		System.out.println(list2.isEmpty());//true
		
		System.out.println("---------------------");
		list1.remove(2);
//		list1.remove(2222);//오류남, 정수를 넣으면 index 번호로 인식
//		list1.removeAll(list3);//list3에 있는 값들만 다 삭제		
		list1.set(0,1111);//0위치의 값을 다시 리셋.
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
		System.out.println("---------------------");
		Object[] arr=list1.toArray();//ArrayList를 Array로 배열로 변환
		//ArrayList는 기본적으로 Object 타입임
		for(int i=0; i<list1.size(); i++){
			System.out.println(arr[i]);
		}
		//int 배열로 받고 싶으면 형변환해서 복사해야 함
		int[] arr2=new int[arr.length];
		for(int i=0; i<arr.length; i++){
			arr2[i]=(int)arr[i];
		}
		
		list1.trimToSize();//안쓰는 크기를 없애고 값 있는 만큼으로만 배열 buffer 크기 줄임
		
	}

}
