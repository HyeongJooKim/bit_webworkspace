package bookSystem;
//�����������α׷�
//��������:
//1.id
//2.����
//3.����
//4.�뿩����
//5.�������(�뿩��  or no)--> �̰� ���� ������ε� ����� ����.
//							�̷��� ����, list �ΰ�(�뿩��,�뿩����) ������ ��.
//���α׷����
//1.�뿩
//2.�ݳ�
//3.�����������
//	1.�뿩���� å ���
//	2.�뿩������ å ���
//  3.õü å ��� ���
//4.�����ڸ� ���� å ���� �Է��ϱ�

public class BookVO {

	//�ʿ��� �ʵ��
	private int id;
	private String title;
	private String author;
	private int price;
//	private boolean rented=false;//�뿩�� true; �뿩���� false
	
	//�ʿ��� ��ɵ�: setter, getter, equals, toString
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getRentCost() {
		return price;
	}
	public void setRentCost(int rentCost) {
		this.price = rentCost;
	}
//	public boolean isRented() {
//		return rented;
//	}
//	public void setRented(boolean rented) {
//		this.rented = rented;
//	}

	@Override
	public String toString() {
		return "id: " + id + "\t����: " + title + "\t����: " + author
				+ "\t�뿩����: " + price;
	}
	
	public boolean equals(Object o){
		if(o instanceof BookVO){
			BookVO b=(BookVO)o;
			if(id==b.id){
				return true;
			}
		}
		return false;
	}
}
