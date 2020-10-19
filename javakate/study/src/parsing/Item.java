package parsing;

//전문을 생성하고 Parsing하는 프로그램 만들기
//요청: 이름: 10자리(byte) + 전화번호: 11자리
//응답: 생일: 8자리 + 주소: 30자리
//요청 예: 홍길동    01099998888
//응답 예: 19801215서울시 송파구 잠실동 123-3

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
	
	//length보다 짧은 value가 들어올 경우 length에 맞게 ' '추가해줌
	public String raw(){
		StringBuffer padded=new StringBuffer(this.value);
		while(padded.toString().getBytes().length<this.length){
			//한글은 2바이트라서 그냥 길이세면 3으로 나옴.
			//6 byte로 처리해야 하므로 byte 변환하여 길이 비교함
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
		item.setName("이름");
		item.setLength(10);
		item.setValue("홍길동");
		System.out.println("["+item.raw()+"]");
	}
}