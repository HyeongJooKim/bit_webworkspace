package com.bit.project1Socket;

import java.awt.Frame;
import java.awt.List;
import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {

		Frame f=new Frame();
		
		ArrayList<String> members=new ArrayList<>();
		members.add("������");
		members.add("������");
		
		List list=new List(members.size(),true);
		for(int i=0; i<members.size(); i++){
			list.addItem(members.get(i));
		}

		members.add("����");
		
		list=new List(members.size(),true);
		for(int i=0; i<members.size(); i++){
			list.addItem(members.get(i));
		}
		
		members.remove("������");
		
		list=new List(members.size(),true);
		for(int i=0; i<members.size(); i++){
			list.addItem(members.get(i));
		}
		
		f.add(list);
		f.setVisible(true);
		f.pack();
	
	}

}
