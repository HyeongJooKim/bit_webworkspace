package com.bit.day19;

//ArrayList ��� ��ü Ȱ���� ��� �غ���
//��ü���� ��, ���� �ּ� ������ �� �ʿ�
//ArrayList: read ������, ����, ���� �Ҹ�. ���� ���� ��� ��� ����

//LinkedList �����غ��� ��
//����: �迭���� ����, ���� �ּҸ� ����, ���� �� �ϸ� ��.
//����: �б�� �� ����. �ϳ� �������� ó������ �� �������� �� �о�� ��.
//		���� ���� �鿩�ٺ��� �ʰ�, ó�� ������ ��� ����

//�Ϲ������� �����Ҵ� �ʿ��ϸ� ArrayList�� ���� �� ������ �Ŵ�.

public class BitLinkedList {
	private Node start;//�ʱⰪ
	private int cnt;
	
	private class Node{
		Node next;//���� �ּҸ� �����ϱ� ���� ���� ��ü�� �ּҰ� 
		Object val;//��ü ��ü�� ��
	}
	
	public void add(Object val){

		cnt++;//index ����
		Node node=new Node();
		node.val=val;
		if(cnt==1){
			start=node;
		}else{
			//�ι�° ���� �ݺ���
			Node temp=start;
			while(true){
				if(temp.next==null){break;}//���� ���� ������ ���ڸ����� ���߰� while ���������� �Է��ϱ�
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
		//�ݺ�������
		//�迭ó�� index�� �ִ� �� �ƴϳ�, ��ǻ� ������� �Էµǰ� �����Ƿ� index�� �ִ� �ų� ����. 
		Node temp=start;
		for(int i=0; i<idx; i++){
			temp=temp.next;
		}
		return temp.val;
	}
}
