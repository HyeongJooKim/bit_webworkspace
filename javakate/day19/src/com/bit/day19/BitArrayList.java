package com.bit.day19;

public class BitArrayList {

//	java.util.ArrayList list=new java.util.ArrayList();
//	같은 method 명령어를 BitArrayList에 사용해보았음.
	
	//ArrayList는 읽기쉬운 장점이 있으나
	//삽입, 업데이트, 삭제시 배열을 복사해야 하는 단점 있다.
	//어찌 개선해볼까?
	//배열에 저장하는 것 말고 어디에 저장할 수 있을까? 객체를 활용해보자.
	//객체에도 값을 저장할 수 있다.
	//입력이 들어올 때마다 객체 생성하고 호출하면 되는데,
	//객체마다 어찌 연결하지? 좌표정보 필요하다.
	//기존값 복사 등등 불필요하다.
	
	private Object[] arr;
	//외부에서 배열에는 직접 접근 금지, 뭐든 들어갈 수 있게 Object로 바꿔보자
	
	public BitArrayList(){
		arr=new Object[0];
	}

	//배열에 값 동적 입력하는 메소드
	public void add(Object o){
		Object[] temp=new Object[arr.length+1];
		for(int i=0; i<arr.length; i++){
			temp[i]=arr[i];
		}
		arr=temp;
		arr[arr.length-1]=o;
	}
	
	//배열 값 호출하는 메소드
	public Object get(int idx){
		return arr[idx];
	}
	
	//배열 값 호출하는 메소드
	public int size(){
		return arr.length;
	}
	
}
