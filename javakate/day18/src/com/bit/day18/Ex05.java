package com.bit.day18;

public class Ex05 {

	public static void main(String[] args) {
		Queue que = new BitArray();
		//BitArray ��ü�� ���������� interface BitStackŸ���� ���������ν� �� interface���� ������ �� ��ɸ� ������
		que.push(1);
		que.push(12);
		que.push(123);
		que.push(1234);
		que.push(12445);
		System.out.println(que.pull());
		System.out.println(que.pull());
		System.out.println(que.pull());
		System.out.println(que.pull());
		System.out.println(que.pull());
	}
}
