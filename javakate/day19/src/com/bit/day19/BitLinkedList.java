package com.bit.day19;

//ArrayList 대신 객체 활용한 방식 해보자
//객체마다 값, 다음 주소 연결할 값 필요
//ArrayList: read 쉽지만, 수정, 삭제 불리. 값을 자주 열어볼 경우 유리

//LinkedList 구현해보는 것
//장점: 배열복사 없이, 다음 주소만 수정, 삭제 등 하면 됨.
//단점: 읽기는 좀 단점. 하나 읽으려면 처음부터 그 값까지를 다 읽어야 함.
//		값을 자주 들여다보지 않고, 처리 위주인 경우 유리

//일반적으로 동적할당 필요하면 ArrayList를 쓰는 게 무난할 거다.

public class BitLinkedList {
	private Node start;//초기값
	private int cnt;
	
	private class Node{
		Node next;//다음 주소를 연결하기 위한 다음 객체의 주소값 
		Object val;//객체 자체의 값
	}
	
	public void add(Object val){

		cnt++;//index 역할
		Node node=new Node();
		node.val=val;
		if(cnt==1){
			start=node;
		}else{
			//두번째 이후 반복문
			Node temp=start;
			while(true){
				if(temp.next==null){break;}//다음 값이 없으면 그자리에서 멈추고 while 빠져나가서 입력하기
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	
	public int size(){
		return cnt;
	}
	
	public Object get(int idx){
		//0. start.val
		//1. start.next.val
		//2. start.next.next.val
		//반복문으로
		//배열처럼 index가 있는 건 아니나, 사실상 순서대로 입력되고 있으므로 index가 있는 거나 같다. 
		Node temp=start;
		for(int i=0; i<idx; i++){
			temp=temp.next;
		}
		return temp.val;
	}
}
