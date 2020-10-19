package notepad;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
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

//메모장 만들기

public class Notepad010M extends Frame {

	MenuItem mi11,mi12,mi13,mi14,mi21;
	Dialog dial;
	TextArea ta;
	
	public Notepad010M(){
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		Menu mn1=new Menu("파일");
		Menu mn2=new Menu("도움말");
		MenuBar mb=new MenuBar();
		mb.add(mn1);
		mb.add(mn2);
		mi11=new MenuItem("새파일");
		mi12=new MenuItem("열기");
		mi13=new MenuItem("저장");
		mi14=new MenuItem("종료");
		mi21=new MenuItem("정보");		
		
		mn1.add(mi11);
		mn1.add(mi12);
		mn1.add(mi13);
		mn1.add(mi14);
		mn2.add(mi21);
		setMenuBar(mb);

		FileDialog fd12=new FileDialog(this, "열기", FileDialog.LOAD);
		fd12.setSize(400, 600);
		fd12.setLocation(100, 100);

		FileDialog fd13=new FileDialog(this, "저장", FileDialog.SAVE);
		fd13.setSize(400, 600);
		fd13.setLocation(100, 100);
		
		mi11.addActionListener(new ActionListener(){//새파일
			public void actionPerformed(ActionEvent e) {
				new Notepad010M();
			}
		});
		mi12.addActionListener(new ActionListener(){//열기
			public void actionPerformed(ActionEvent e) {
				fd12.setVisible(true);
				String open=fd12.getFile();//열기창에서 선택한 파일이름
				File file=new File(open);
				FileInputStream fis=null;
				ArrayList<Byte> list=new ArrayList<>();
				if(file.exists()){
					try {
						fis=new FileInputStream(file);
						while(true){
							int su;
							su=fis.read();
							if(su==-1){break;}
							list.add((byte)su);
						}
						Object[] arr=list.toArray();
						byte[] arr2=new byte[arr.length];
						for(int i=0; i<arr.length; i++){
							arr2[i]=(byte)arr[i];
						}
						ta.setText(new String(arr2));
						
					} catch (IOException e1) {
						e1.printStackTrace();
					}finally{
						if(fis!=null){try {
							fis.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}}
					}
				}
			}
		});
		mi13.addActionListener(new ActionListener(){//저장
			public void actionPerformed(ActionEvent e) {
				File file=new File("temp.txt");//지정한 파일에는 저장됨. 입력창에 쓴 걸 가지고 오는 방법은?
				try {
					file.createNewFile();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				FileOutputStream fos=null;
				try {
					fos=new FileOutputStream(file);
					String input=ta.getText();
					byte[] by=input.getBytes();
					for(int i=0; i<by.length; i++){
						fos.write(by[i]);
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}finally{
					try {
						if(fos!=null){
							fos.close();
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				fd13.setVisible(true);
			}
		});
		mi14.addActionListener(new ActionListener(){//종료
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mi21.addActionListener(new ActionListener(){//정보
			public void actionPerformed(ActionEvent e) {
				dial.setVisible(true);
			}
		});
		
		dial=new Dialog(this, "내맘대로(v0.1.0) 정보");
		dial.setSize(300, 400);
		dial.setLocation(250, 300);
		
		Label la1=new Label("내맘대로");
		Label la2=new Label("버전 0.1.0");
		Label la3=new Label("최종업데이트 2020-06-05");
		Label la4=new Label("만든사람 김형주");

		dial.setLayout(null);
		la1.setLocation(50, 50);
		la2.setLocation(50, 100);
		la3.setLocation(50, 150);
		la4.setLocation(50, 200);
		la1.setSize(200, 50);
		la2.setSize(200, 50);
		la3.setSize(200, 50);
		la4.setSize(200, 50);
		
		dial.add(la1);
		dial.add(la2);
		dial.add(la3);
		dial.add(la4);
		
		dial.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				dial.dispose();
			}
		});
		
		Panel p=new Panel();
		BorderLayout l=new BorderLayout();
		p.setLayout(l);
		ta=new TextArea();
		p.add(BorderLayout.CENTER, ta);
		add(p);
		setTitle("내맘대로");
		setLocation(100,100);
		setSize(600,800);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Notepad010M();
	}
}
