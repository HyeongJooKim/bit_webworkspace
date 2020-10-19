package notepad;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Notepad010T extends Frame implements ActionListener{

	MenuItem mi1_1,mi1_2,mi1_3,mi1_4,mi2_1;
	TextArea ta;

	public Notepad010T(){
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		MenuBar mb=new MenuBar();
		Menu mn1=new Menu("����");
		mi1_1=new MenuItem("������");
		mi1_2=new MenuItem("����");
		mi1_3=new MenuItem("����");
		mi1_4=new MenuItem("����");
		mn1.add(mi1_1);
		mn1.addSeparator();
		mn1.add(mi1_2);
		mn1.add(mi1_3);
		mn1.addSeparator();
		mn1.add(mi1_4);
		Menu mn2=new Menu("����");
		mi2_1=new MenuItem("����");
		mn2.add(mi2_1);
		mb.add(mn1);
		mb.add(mn2);
		setMenuBar(mb);
		mi1_1.addActionListener(this);
		mi1_2.addActionListener(this);
		mi1_3.addActionListener(this);
		mi1_4.addActionListener(this);
		mi2_1.addActionListener(this);
		ta=new TextArea();
		add(ta);
		setTitle("�������");
		setLocation(100,100);
		setSize(500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Notepad010T();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(mi1_1==obj){//������
			
		}else if(mi1_2==obj){//����
			FileDialog open=new FileDialog(this, "����", FileDialog.LOAD);
//			open.setSize(400,300);//�۵� ����
//			open.setLocation(this.getX()+100, this.getY()+100);//�۵� ����
			open.setVisible(true);
			String path=open.getDirectory();
			path+="\\"+open.getFile();
			File openFile=new File(path);
			FileInputStream fis=null;
			ArrayList<Byte> temp=new ArrayList<>();
			try {
				fis=new FileInputStream(openFile);
				while(true){
					int su=fis.read();
					if(su==-1){break;}
					temp.add((byte)su);
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}finally{
				if(fis!=null){try {
					fis.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}}
			}
			Object[] objs=temp.toArray();
			byte[] by=new byte[objs.length];
			for(int i=0; i<objs.length; i++){
				by[i]=(byte) objs[i];
			}
			ta.setText(new String(by));
			
		}else if(mi1_3==obj){//����
			FileDialog save=new FileDialog(this, "����", FileDialog.SAVE);
			save.setVisible(true);
			String path=save.getDirectory();
			path+="\\"+save.getFile();
			File saveFile=new File(path);
			if(!saveFile.exists()){
				try {
					saveFile.createNewFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			String msg=ta.getText();
			byte[] by=msg.getBytes();
			FileOutputStream fos=null;
			try {
				fos=new FileOutputStream(saveFile);
				for(int i=0; i<by.length; i++){
					fos.write(by[i]);
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}finally{
				if(fos!=null){try {
				fos.close();
				} catch (IOException e1) {
				e1.printStackTrace();
				}}
			}
		}else if(mi1_4==obj){//����
			dispose();
		}else if(mi2_1==obj){//����
			Dialog dia=new Dialog(this, "����");
			Label la1=new Label("by bit class01");
			dia.setLayout(new FlowLayout());
			dia.addWindowListener(new WindowAdapter(){
				@Override
				public void windowClosing(WindowEvent e) {
					dia.dispose();
				}
			});
			dia.add(la1);
			dia.setSize(200, 200);
			dia.setLocation(this.getX()+100, this.getY()+100);
			dia.setVisible(true);
		}
	}
}