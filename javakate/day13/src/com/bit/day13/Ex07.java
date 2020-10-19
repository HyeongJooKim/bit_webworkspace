package com.bit.day13;
// System class

public class Ex07 {
	static Ex07 ex=new Ex07();
	
	public void func01(){}

	public static void main(String[] args) {
		long begin=System.currentTimeMillis();
		long beginNano=System.nanoTime();

		System.out.println();//System: class��, out: ������, println�� method��
//		������ in, out, err ������ ����
		
		Ex07 me=new Ex07();
		Ex07.ex.func01();//������ ������ ����� ��
		
//		System class
//		������ ����. ��� static method
		
//		System.exit(1);//��� JVM�� �����Ŵ. ��������� �������� ����. ()�ƹ� ���ڳ� �־ ����.
		
		int[] origin={1,3,5,7,9};
		int[] dest=new int[5];
		
		//���� �����Ϸ��� �̷��� �߾���.
//		for(int i=0; i<5; i++){
//			dest[i]=origin[i];
//		}
		//�� ���� �迭�� ���������ϱ�
		System.arraycopy(origin, 0, dest, 0, 5);//�迭������ �� ������ ����. ��, ������.
		//origin�̶�� �迭�� 0������ �����ؼ� dest�� 0������ 5���� �Է��϶�.
		
		for(int i=0; i<5; i++){
			System.out.println(dest[i]);
		}
		
//		String msg="";
//		for(int i=0; i<100000; i++){
//		msg+=i;
//		}
//				
		System.out.println(System.currentTimeMillis());
		//õ����1�ʷ� ��ȯ. midnight, January 1, 1970 UTC.���� ���ݱ���.
		//���꿡 �������� 70�� ����. 90�⵵ �� �ִ�.
		//���� ����? �� �ü���� �ð��� ��ȯ
		long end=System.currentTimeMillis();
		long endNano=System.nanoTime();
		System.out.println("main ����ð�="+(end-begin)/1000+"s");
		//�ý��� �����׽�Ʈ�� �� ����غ���.
		System.out.println("main ����ð�="+(endNano-beginNano)+"ns");
		
	}
}
