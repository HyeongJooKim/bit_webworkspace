package com.bit.day19;

import java.util.LinkedList;

//LinkedList������ �� �ִ� method��

public class Ex06 {

	public static void main(String[] args) {
		java.util.Queue list=new LinkedList();
		//Queue Ÿ�Ը� ������ ������ �̿�
		//Queue�� FIFO ���. �߰� �� �� ����
		list.offer("ù��°");//List�� add()�� �ش�
		list.offer("�ι�°");
		list.offer("����°");
		list.offer("�׹�°");
		
//		for(int i=0; i<4; i++){
//			String msg=(String)list.peek();//List�� element()�� �ش�
//			System.out.println(msg);//�ƹ��� �̾Ƶ� ù��° ���� ��� ������. �� ���� ������� ���� ���� ������ �� �ִ� ������
//			list.poll();//List�� remove() �� �ش�. �Էµ� ������� ���� ����. 
//		}

		while(list.peek()!=null){
			String msg=(String)list.poll();
			System.out.println(msg);
		}
	}
}
