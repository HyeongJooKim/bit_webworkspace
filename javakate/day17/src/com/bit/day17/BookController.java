package com.bit.day17;

import java.util.List;
//���α׷����
//1.�뿩
//2.�ݳ�
//3.�����������
//	1.�뿩���� å ���
//	2.�뿩������ å ���
//  3.õü å ��� ���
public class BookController {

	List<BookVO> list;
	public BookController(List<BookVO> list){
		this.list=list;
	}
		
	//id �����ϰ� list�� �߰� (�Է��� viewer���� ���� ����
	public void add(BookVO b){
		if(list.size()==0){
			b.id=0;
		}else{
			int id=list.get(list.size()-1).getId() + 1;
			b.setId(id);
		}
		list.add(b);
	}

	//���� �߻�
	public BookVO rentOut(BookVO b){
		BookVO result=null;
		if(list.indexOf(b)!=-1){//�̷� å�� ������
			int index=list.indexOf(b);
			result=list.get(index);
			result.setRented(true);
		}
		return result;
	}

	//�ݳ�
	public BookVO rentIn(BookVO b){
		BookVO result=null;
		if(list.indexOf(b)!=-1){//�̷� å�� ������
			int index=list.indexOf(b);
			result=list.get(index);
			result.setRented(false);
		}
		return result;
	}
	
	//���⳪�� ��� �����ֱ�. ��� ������ Controller����
	public void listRentOut(){
		BookVO b=new BookVO();
		for(int i=0; i<list.size(); i++){
			b=list.get(i);
			if(b.isRented()){
				System.out.println(b);
			}
		}
	}

	//���Ⱑ�� ���
	public void listRentIn(){
		BookVO b=new BookVO();
		for(int i=0; i<list.size(); i++){
			b=list.get(i);
			if(!b.isRented()){
				System.out.println(b);
			}
		}
	}
	
	public void listAll(){
		BookVO b=new BookVO();
		for(int i=0; i<list.size(); i++){
			b=list.get(i);
			System.out.println(b);
		}
	}
	
	
}
