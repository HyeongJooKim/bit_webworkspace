package parsing;

import java.util.ArrayList;
import java.util.HashMap;

public class Packet {

	private ArrayList<Item> items=new ArrayList<Item>();

	private HashMap<String, Item> nameAccess=new HashMap<>();
	
	
	public void addItem(Item item){
		this.items.add(item);
		if(nameAccess.containsKey(item.getName())){
			throw new RuntimeException(
					"Duplicatd item name:["+item.getName()+"]");
		}
		nameAccess.put(item.getName(), item);
	}
	
	public Item getItem(String name){
		return nameAccess.get(name);
	}

	public String raws(){
		StringBuffer result=new StringBuffer();
		for(Item item: items){
			result.append(item.raw());
		}
		return result.toString();
	}
	
	
	
	public static void main(String[] args) {
		Packet packet=new Packet();
		
//		Item item1=new Item();
//		item1.setName("�̸�");
//		item1.setLength(10);
//		item1.setValue("ȫ�浿");
//		
//		Item item2=new Item();
//		item2.setName("��ȭ��ȣ");
//		item2.setLength(11);
//		item2.setValue("01099998888");
//		
		Item item1=Item.create("�̸�", 10, "ȫ�浿");
		Item item2=Item.create("��ȭ��ȣ", 11, "01099998888");

		packet.addItem(item1);
		packet.addItem(item2);
		
		System.out.println("["+packet.raws()+"]");
		
		Packet recvPacket=new Packet();
		recvPacket.addItem(Item.create("����", 8, null));
		recvPacket.addItem(Item.create("�ּ�", 30, null));
		
		recvPacket.parse("19801215����� ���ı� ��ǵ� 123-3     ");
		
		System.out.println(recvPacket.getItem("�ּ�").raw());
		
//		for(Item item: packet.items){
//			System.out.println(item.getValue());
//		}
//		for(Item item: recvPacket.items){
//			System.out.println(item.getValue());
//		}
	}

	private void parse(String data) {
		byte[] bdata=data.getBytes();
		int pos=0;
		for(Item item: items){
			byte[] temp=new byte[item.getLength()];
			System.arraycopy(bdata, pos, temp, 0, item.getLength());
			pos+=item.getLength();
			item.setValue(new String(temp));
		}
	}
}