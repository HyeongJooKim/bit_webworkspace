package jump2java;

public class HouseDog extends Dog{

	public HouseDog(String name){
		//������: Class �̸��� ���� return �ڷ����� ���� �޼ҵ�
		//�����ڰ� ����� ��� �������� ��Ģ��θ� ��ü��������.
		//new Ű���尡 ���� �� ȣ���.
		//������ ���� ������ ������ default �����ڰ� �ڵ����� �����Ǵ� �Ͱ� ����
		
	}
	
	public void sleep(){//method overriding
		System.out.println(this.name+"�� ������ ���� �ܴ�");
	}
	
	public void sleep(int hour){
		System.out.println(this.name+"�� ������ "+hour+"�ð����� ���� �ܴ�");
		
	}
	
	public static void main(String[] args) {
		HouseDog houseDog=new HouseDog("������");
//		houseDog.setName("������");//�����ڿ��� �־���� �ϹǷ� ���� ���ʿ���
		houseDog.sleep();
		houseDog.sleep(3);//method overloading ��
		
	}

}
