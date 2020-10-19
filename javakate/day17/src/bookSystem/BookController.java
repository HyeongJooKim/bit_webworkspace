package bookSystem;

import java.util.ArrayList;
import java.util.List;
//���α׷����
//1.�뿩
//2.�ݳ�
//3.�����������
//	1.�뿩���� å ���
//	2.�뿩������ å ���
//  3.õü å ��� ���
public class BookController {

	private List<BookVO> inventoryList;//�����
	private List<BookVO> rentList;//�뿩���� ���
	
	public BookController(List<BookVO> inventoryList, List<BookVO> rentList){
		this.inventoryList=inventoryList;
		this.rentList=rentList;
	}

	//����Ʈ���� �ش��ϴ� Id�� �ٸ� ��ҵ��� �������� �޼ҵ�
	public BookVO retrieveBookVO(List<BookVO> list, BookVO b){
		int index=list.indexOf(b);
		return list.get(index);
	}
	
	//�� �뿩�Ǵ� å�� �����ָ� �κ��丮�� ��Ʈ�� �̵���Ų�� �޼ҵ�
	public void rentBookVO(BookVO b){
		rentList.add(retrieveBookVO(inventoryList, b));
		inventoryList.remove(b);
	}

	//�� �ݳ��Ǵ� å�� �����ָ� ��Ʈ���� �κ��丮�� �̵���Ű�� �޼ҵ�
	public void returnBookVO(BookVO b){
		inventoryList.add(retrieveBookVO(rentList, b));
		rentList.remove(b);
	}

	//�ش� BookVO��ü�� �뿩 �������� �����ϴ� �޼ҵ�
	//������ �ſ� �߿��ϴ�
	public boolean validateRentBookVO(BookVO b){
		return inventoryList.contains(b);
	}
	
	//�ش簴ü�� �ݳ��������� �����ϴ� �޼ҵ�
	public boolean validateReturnBookVO(BookVO b){
		return rentList.contains(b);
	}

	//�� list�� �ϳ��� ���ļ� �����ϴ� �޼ҵ�
	public List<BookVO> selectAll(){
		List<BookVO> list = new ArrayList<BookVO>();
		list.addAll(inventoryList);
		list.addAll(rentList);
		
		return list;
	}
	
	public List<BookVO> selectInventory(){
		return inventoryList;
	}
	
	public List<BookVO> selectRent(){
		return rentList;
	}
	
	//���� å�� �ִ��� Ȯ��
	public boolean isRentEmpty(){
		return rentList.size()==0;
	}
	
	//�뿩�� å�� �ִ��� Ȯ��
	public boolean isInventoryEmpty(){
		return inventoryList.size()==0;
	}
}