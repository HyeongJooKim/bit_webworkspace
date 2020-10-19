package parsing;

//������ �����ϰ� Parsing�ϴ� ���α׷� �����
//��û: �̸�: 10�ڸ�(byte) + ��ȭ��ȣ: 11�ڸ�
//����: ����: 8�ڸ� + �ּ�: 30�ڸ�
//��û ��: ȫ�浿    01099998888
//���� ��: 19801215����� ���ı� ��ǵ� 123-3

public class Item {
	
	private String name;
	private int length;
	private String value;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	//length���� ª�� value�� ���� ��� length�� �°� ' '�߰�����
	public String raw(){
		StringBuffer padded=new StringBuffer(this.value);
		while(padded.toString().getBytes().length<this.length){
			//�ѱ��� 2����Ʈ�� �׳� ���̼��� 3���� ����.
			//6 byte�� ó���ؾ� �ϹǷ� byte ��ȯ�Ͽ� ���� ����
			padded.append(' ');
		}
		return padded.toString();
	}
	
	public static Item create(String name, int length, String value){
		Item item=new Item();
		item.setName(name);
		item.setLength(length);
		item.setValue(value);
		return item;
	}
	
	public static void main(String[] args) {
		Item item=new Item();
		item.setName("�̸�");
		item.setLength(10);
		item.setValue("ȫ�浿");
		System.out.println("["+item.raw()+"]");
	}
}