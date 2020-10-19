package jump2java;

import java.util.ArrayList;
import java.util.HashMap;

public class HelloWorld {
	public static void main(String[] args){
		System.out.println("Hello World");

		System.out.println("--------------------------------------");
		
		ArrayList<Object> pitches = new ArrayList<Object>();
		pitches.add(100);
		pitches.add("200");
		pitches.add(300);
		pitches.add(400);
		pitches.add("������");
		pitches.add(600);
		pitches.add(4);
		System.out.println(pitches);//[100, 200, 300, 400, ������, 600, 4]
		
		System.out.println(pitches.get(2));//300
		System.out.println(pitches.size());//7
		
		System.out.println(pitches.remove("200"));//true. ���� ������ �����ϰ� true ����. index ��ȣ�� ������ ������ ����. ���� ������ boolean �� ����
		System.out.println(pitches.remove("800"));//false. ���� ������ false ����.
		System.out.println(pitches);//[100, 300, 400, ������, 600, 4]
		System.out.println(pitches.remove(4));//600 ��� index 4���� 600�� ����� ���� ���� ���. ������ ������ index ��ȣ�� �ν�?
//		System.out.println(pitches.remove(400));//������. ������ ������ index ��ȣ�� �ν��ϴ� ���
		System.out.println(pitches);//[100, 300, 400, ������, 4]
		System.out.println(pitches.contains("������"));//true
		System.out.println(pitches.contains(100));//true
		System.out.println(pitches.contains("100"));//false
		
		System.out.println("--------------------------------------");
		
		//Map : interface
			//HashMap
			//LinkedHashMap : �Էµ� ������� ��Ƽ�Ͱ� ��µ�
			//TreeMap : �Էµ� key�� ��Ʈ������ �����Ͱ� ��µ�

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people","���");
		map.put("baseball","�߱�");
		map.put("java","�ڹ�");
		System.out.println(map);//{java=�ڹ�, baseball=�߱�, people=���}
		
		System.out.println(map.get("baseball"));//�߱� ���
		System.out.println(map.containsKey("baseball"));//true ���
		System.out.println(map.containsValue("baseball"));//false ���
		System.out.println(map.containsValue("�߱�"));//true ���
		
		System.out.println(map.remove("people"));//��� ��µǰ� �� ���� ������
		System.out.println(map);//{java=�ڹ�, baseball=�߱�}
		System.out.println(map.remove("base"));//null ����
		System.out.println(map.remove("�ڹ�"));//null ����. value�� ������ ���� �ȵǳ�
		System.out.println(map.size());//2
		
		System.out.println("--------------------------------------");
		
	}//main end
}//class end
