package com.bit.day14;

interface Inter05 extends Inter04, Inter03, Inter02{ 
// class ó�� ���� public ���� ����. �ٸ� public�� �����Ƿ�
// class�� naming ��Ģ ����
// interface������ ����� extends, �ٸ�, ���� ����� ������
	void func02();
	void func01();
	// func �̸� ���ĵ� �ƹ� ���� ����. ������, overriding �ҰŴϱ�.
	// �ٸ�, return type�� ���ƾ� overload �� ��
}

public class Ex05 implements Inter05{
	// ���ʻ� ���� �̸��� class �̸� ���� ����, ���� class���� public ���δ�.
	// �� ������ �ΰ��� public class(interface ����) �Ⱦ�.
	// �ϳ��� ������ �� �� �̻��� class�� �����ϳ� public�� ���� �̸��� ���� �� class���� ���δ�.

	public static void main(String[] args) {
	}

	@Override
	public void func02() {
	}
	
	@Override
	public void func01() {
	}
}