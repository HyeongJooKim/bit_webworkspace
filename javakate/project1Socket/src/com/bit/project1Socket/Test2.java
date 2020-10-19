package com.bit.project1Socket;

import java.awt.Frame;
import java.awt.List;
import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {

		Frame f=new Frame();
		
		ArrayList<String> members=new ArrayList<>();
		members.add("¿œ¿œ¿œ");
		members.add("¿Ã¿Ã¿Ã");
		
		List list=new List(members.size(),true);
		for(int i=0; i<members.size(); i++){
			list.addItem(members.get(i));
		}

		members.add("ªÔªÔªÔ");
		
		list=new List(members.size(),true);
		for(int i=0; i<members.size(); i++){
			list.addItem(members.get(i));
		}
		
		members.remove("¿Ã¿Ã¿Ã");
		
		list=new List(members.size(),true);
		for(int i=0; i<members.size(); i++){
			list.addItem(members.get(i));
		}
		
		f.add(list);
		f.setVisible(true);
		f.pack();
	
	}

}
