package com.bit.day14;

// Interface: �߻� class�� ������ �ִ��� �츰 ��.
// ���߻���� �Ұ����� java���� ��ġ ���߻���� ���� ��ó�� ����ϵ��� ��

interface Inter01{//class ó�� ���� class ��� interface ��.
	// ���� �߻�޼ҽ��� ���� �� ����. ������ �޼ҵ�� ���� �� ����
	// �ʵ嵵 ����
	// �����ڵ� ���� (Ŭ������ �ƴϹǷ�). ���� ��ü ���� �Ұ���
	// ����) public static final ����, �� ����� ����
	// ����) �޼��� �տ� public abstract ���� ����
	
	public abstract void func01();
	public void func02();// abstract �Ƚᵵ ��. ������ �� �߻�޼��常 ���� �� ������
//	private void func03();// private�� �Ұ�. ��ӹ޴°��� �����̴� ������ public �̾�� ��.
	void func03();// interface������ �Ⱦ��� public��. default �ƴϰ�
	
	public static final int su1=1111;
	static final int su2=2222; //public ��������
	final int su3=3333; //static�� ��������
	int su4=4444; //����� ������ �����ϹǷ� final�� ��������
	//��, ����ó�� ���� ������ ������, public static final �� ������ �����.
}// end Inter01

interface Inter02{}
interface Inter03{}// API���� �̷��� �ƹ� ���� ���� Interface�� �ִ�. ��: Serializable
// �� interface �� ����? 
	// �̸����� Ŭ������ ���� ����. 
	// �з�, ���൵ ���� - Ư�� Ŭ������ ���ڷ� �ް� ���� ��

public class Ex04 extends Object implements Inter01{
	// implements interfaces : ��� �޴� �Ͱ� ���� ����. �������� Interfaces ���� �� �ִ�.
	// implements Inter01, Inter02, Inter03 �̷��� ���� ��
	// ��ӵ� �� ������ ���߻�� �Ǵ� ��. class �ϳ�+Interface �������� ��ӹ��� �� ����.
	// ���� ���� String ���� �ִ� ���� �޼ҵ�� Interface ����. ��: CharSequence

	public static void main(String[] args) {
		Inter01 me=new Ex04();
		me.func01();
		me.func02();
		me.func03();
		System.out.println(Inter01.su1);
		System.out.println(Inter01.su2);
		System.out.println(Inter01.su3);
		System.out.println(Inter01.su4);//su4++�� �Ұ�. final �Ƚ� final�̹Ƿ�.
	}
	
	@Override
	public void func01() {
	}
	
	@Override
	public void func02() {
	}
	
	@Override
	public void func03() {
	}

}// main end
