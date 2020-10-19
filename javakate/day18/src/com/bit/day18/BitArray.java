package com.bit.day18;

public class BitArray implements BitStack, Queue{
	Object[] arr;
	
	public BitArray(){
		arr=new Object[0];
	}
	
	public void add(Object a){//arr[]크기하나 늘리고 새 값 입력
		Object[] temp=new Object[arr.length+1];
		//기존값 복사
		for(int i=0; i<arr.length; i++){
			temp[i]=arr[i];
		}
		//신규값 입력
		temp[temp.length-1]=a;
		arr=temp;
	}
	
	public int size(){
		return arr.length;
	}
	
	public Object get(int idx){
		return arr[idx];
	}
	
	public void push(Object obj){
		add(obj);
	}
	
	public Object pull(){//FIFO
		Object obj=arr[0];
		remove(0);
		return obj;
	}
	
	public Object pop(){//LIFO
		Object obj=arr[arr.length-1];
		remove(arr.length-1);
		return obj;
	}
	
	public void remove(int idx){
		if(arr.length>0){
			Object[] temp=new Object[arr.length-1];
			//앞부분 복사
			for(int i=0; i<idx; i++){
				temp[i]=arr[i];
			}
			//뒷부분 복사
//			for(int i=idx+1; i<arr.length; i++){
//				temp[i-1]=arr[i];
			for(int i=idx; i<temp.length; i++){
				temp[i]=arr[i+1];
			}
			arr=temp;
		}
	}
	
}//class end