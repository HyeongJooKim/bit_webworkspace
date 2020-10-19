package com.bit.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.sql.*;
import java.util.Properties;

import javax.swing.JTextField;
import javax.swing.JList;

public class Ex01 extends JFrame {

	private JPanel contentPane;

	JLabel[] table=new JLabel[50];
	private JTextField tf_addNum;
	private JTextField tf_addName;
	private JTextField tf_addKor;
	private JTextField tf_addEng;
	private JTextField tf_addMath;
	String nameToModify;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex01 frame = new Ex01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ex01() {
//Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 657);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
//pNorth
		JPanel pNorth = new JPanel();
		contentPane.add(pNorth, BorderLayout.NORTH);
		
		JLabel laTitle = new JLabel("학생성적관리프로그램(ver 0.4.0)");
		laTitle.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		pNorth.add(laTitle);
//pSouth
		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);
//pEast		
		JPanel pEast = new JPanel();
		contentPane.add(pEast, BorderLayout.EAST);
		GridBagLayout gbl_pEast = new GridBagLayout();
		gbl_pEast.columnWidths = new int[]{97, 0};
		gbl_pEast.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pEast.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pEast.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pEast.setLayout(gbl_pEast);
		
		JButton btn1 = new JButton("전체보기");
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn1.insets = new Insets(0, 0, 5, 0);
		gbc_btn1.anchor = GridBagConstraints.NORTH;
		gbc_btn1.gridx = 0;
		gbc_btn1.gridy = 2;
		pEast.add(btn1, gbc_btn1);
		
		JButton btn2 = new JButton("입력");
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn2.insets = new Insets(0, 0, 5, 0);
		gbc_btn2.gridx = 0;
		gbc_btn2.gridy = 4;
		pEast.add(btn2, gbc_btn2);
		
		JButton btn3 = new JButton("수정");
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn3.insets = new Insets(0, 0, 5, 0);
		gbc_btn3.gridx = 0;
		gbc_btn3.gridy = 6;
		pEast.add(btn3, gbc_btn3);
		
		JButton btn4 = new JButton("삭제");
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn4.insets = new Insets(0, 0, 5, 0);
		gbc_btn4.gridx = 0;
		gbc_btn4.gridy = 9;
		pEast.add(btn4, gbc_btn4);
		
		JButton btn5 = new JButton("종료");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn5.gridx = 0;
		gbc_btn5.gridy = 12;
		pEast.add(btn5, gbc_btn5);
//pWest
		JPanel pWest = new JPanel();
		contentPane.add(pWest, BorderLayout.WEST);
//pCenter - 전체보기
		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new GridLayout(0, 5, 0, 0));
		
		JLabel la1 = new JLabel("학번");
		pCenter.add(la1);
		
		JLabel la2 = new JLabel("이름");
		pCenter.add(la2);
		
		JLabel la3 = new JLabel("국어");
		pCenter.add(la3);
		
		JLabel la4 = new JLabel("영어");
		pCenter.add(la4);
		
		JLabel la5 = new JLabel("수학");
		pCenter.add(la5);
		
		for(int i=0; i<table.length; i++){
			table[i]=new JLabel();
			pCenter.add(table[i]);
		}
//pCenter2 - 입력
		JPanel pCenter2 = new JPanel();
		contentPane.add(pCenter2, BorderLayout.CENTER);
		GridBagLayout gbl_pCenter2 = new GridBagLayout();
		gbl_pCenter2.columnWidths = new int[]{0, 0, 0};
		gbl_pCenter2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pCenter2.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_pCenter2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pCenter2.setLayout(gbl_pCenter2);
		
		JLabel la_2 = new JLabel("입력페이지");
		la_2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		GridBagConstraints gbc_la_2 = new GridBagConstraints();
		gbc_la_2.gridwidth = 2;
		gbc_la_2.insets = new Insets(0, 0, 5, 0);
		gbc_la_2.gridx = 0;
		gbc_la_2.gridy = 0;
		pCenter2.add(la_2, gbc_la_2);
		
		JLabel la_2_1 = new JLabel("학번");
		la_2_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		GridBagConstraints gbc_la_2_1 = new GridBagConstraints();
		gbc_la_2_1.insets = new Insets(0, 20, 5, 5);
		gbc_la_2_1.gridx = 0;
		gbc_la_2_1.gridy = 1;
		pCenter2.add(la_2_1, gbc_la_2_1);
		
		tf_addNum = new JTextField();
		GridBagConstraints gbc_tf_addNum = new GridBagConstraints();
		gbc_tf_addNum.insets = new Insets(0, 0, 5, 0);
		gbc_tf_addNum.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_addNum.gridx = 1;
		gbc_tf_addNum.gridy = 1;
		pCenter2.add(tf_addNum, gbc_tf_addNum);
		tf_addNum.setColumns(10);
		
		JLabel la_2_2 = new JLabel("이름");
		la_2_2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		GridBagConstraints gbc_la_2_2 = new GridBagConstraints();
		gbc_la_2_2.insets = new Insets(0, 20, 5, 5);
		gbc_la_2_2.gridx = 0;
		gbc_la_2_2.gridy = 2;
		pCenter2.add(la_2_2, gbc_la_2_2);
		
		tf_addName = new JTextField();
		GridBagConstraints gbc_tf_addName = new GridBagConstraints();
		gbc_tf_addName.insets = new Insets(0, 0, 5, 0);
		gbc_tf_addName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_addName.gridx = 1;
		gbc_tf_addName.gridy = 2;
		pCenter2.add(tf_addName, gbc_tf_addName);
		tf_addName.setColumns(10);
		
		JLabel la_2_3 = new JLabel("국어");
		la_2_3.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		GridBagConstraints gbc_la_2_3 = new GridBagConstraints();
		gbc_la_2_3.insets = new Insets(0, 20, 5, 5);
		gbc_la_2_3.gridx = 0;
		gbc_la_2_3.gridy = 3;
		pCenter2.add(la_2_3, gbc_la_2_3);
		
		tf_addKor = new JTextField();
		GridBagConstraints gbc_tf_addKor = new GridBagConstraints();
		gbc_tf_addKor.insets = new Insets(0, 0, 5, 0);
		gbc_tf_addKor.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_addKor.gridx = 1;
		gbc_tf_addKor.gridy = 3;
		pCenter2.add(tf_addKor, gbc_tf_addKor);
		tf_addKor.setColumns(10);
		
		JLabel la_2_4 = new JLabel("영어");
		la_2_4.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		GridBagConstraints gbc_la_2_4 = new GridBagConstraints();
		gbc_la_2_4.insets = new Insets(0, 20, 5, 5);
		gbc_la_2_4.gridx = 0;
		gbc_la_2_4.gridy = 4;
		pCenter2.add(la_2_4, gbc_la_2_4);
		
		tf_addEng = new JTextField();
		GridBagConstraints gbc_tf_addEng = new GridBagConstraints();
		gbc_tf_addEng.insets = new Insets(0, 0, 5, 0);
		gbc_tf_addEng.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_addEng.gridx = 1;
		gbc_tf_addEng.gridy = 4;
		pCenter2.add(tf_addEng, gbc_tf_addEng);
		tf_addEng.setColumns(10);
		
		JLabel la_2_5 = new JLabel("수학");
		la_2_5.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		GridBagConstraints gbc_la_2_5 = new GridBagConstraints();
		gbc_la_2_5.insets = new Insets(0, 20, 5, 5);
		gbc_la_2_5.gridx = 0;
		gbc_la_2_5.gridy = 5;
		pCenter2.add(la_2_5, gbc_la_2_5);
		
		tf_addMath = new JTextField();
		GridBagConstraints gbc_tf_addMath = new GridBagConstraints();
		gbc_tf_addMath.insets = new Insets(0, 0, 5, 0);
		gbc_tf_addMath.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_addMath.gridx = 1;
		gbc_tf_addMath.gridy = 5;
		pCenter2.add(tf_addMath, gbc_tf_addMath);
		tf_addMath.setColumns(10);
		
		JButton btnAdd = new JButton("입 력");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.gridx = 1;
		gbc_btnAdd.gridy = 7;
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		pCenter2.add(btnAdd, gbc_btnAdd);
//pCenter3 - 수정
		JPanel pCenter3 = new JPanel();//수정, 삭제용
		pCenter3.setVisible(false);
		contentPane.add(pCenter3, BorderLayout.CENTER);
		pCenter3.setLayout(new BorderLayout());
		
		JPanel pCenter3West=new JPanel();//학생목록 보기 list, 수정 버튼 넣기
		GridBagLayout gbl_pC3W=new GridBagLayout();
		pCenter3West.setLayout(gbl_pC3W);
		pCenter3.add(pCenter3West, BorderLayout.WEST);
		
		DefaultListModel listModel=new DefaultListModel();
		JList list = new JList(listModel);
		list.setFixedCellWidth(180);
		list.setFixedCellHeight(30);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets= new Insets(0, 5, 5, 5);
		gbc_list.anchor = GridBagConstraints.NORTH;
//		gbc_list.fill = GridBagConstraints.HORIZONTAL;
//		gbc_list.fill = GridBagConstraints.VERTICAL;
		gbc_list.gridheight = 4;
//		gbc_list.gridwidth = 1;
//		gbc_list.gridx = 0;
//		gbc_list.gridy = 0;
		pCenter3West.add(list, gbc_list);
		

		
		JButton btnModify = new JButton("선택한 학생성적 수정하기");
		GridBagConstraints gbc_btnModify = new GridBagConstraints();
		gbc_btnModify.insets= new Insets(0, 5, 5, 5);
//		gbc_btnModify.gridx = 0;
		gbc_btnModify.gridy = 6;
//		gbc_btnModify.gridwidth = 1;
//		gbc_btnModify.gridheight = 1;
		pCenter3West.add(btnModify, gbc_btnModify);
		
		JButton btnDelete = new JButton("선택한 학생정보 삭제하기");
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.insets= new Insets(0, 5, 5, 5);
//		gbc_btnDelete.gridx = 0;
		gbc_btnDelete.gridy = 7;
//		gbc_btnDelete.gridwidth = 1;
//		gbc_btnDelete.gridheight = 1;
		pCenter3West.add(btnDelete, gbc_btnDelete);

		JPanel pCenter3Center=new JPanel();//수정할 내용 받을 부분
		pCenter3Center.setVisible(false);
		GridBagLayout gbl_pC3C=new GridBagLayout();
		pCenter3Center.setLayout(gbl_pC3C);
		pCenter3.add(pCenter3Center,BorderLayout.CENTER);
		
		JLabel la31=new JLabel("국어");
		GridBagConstraints gbc_la31 = new GridBagConstraints();
		gbc_la31.insets= new Insets(0, 5, 5, 5);
		gbc_la31.gridx = 0;
		gbc_la31.gridy = 0;
		pCenter3Center.add(la31, gbc_la31);
		
		JTextField tf_ModKor=new JTextField();
		GridBagConstraints gbc_tf_ModKor = new GridBagConstraints();
		gbc_tf_ModKor.insets= new Insets(0, 5, 5, 5);
		gbc_tf_ModKor.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_ModKor.gridx = 1;
		gbc_tf_ModKor.gridy = 0;
		pCenter3Center.add(tf_ModKor, gbc_tf_ModKor);
		
		JLabel la32=new JLabel("영어");
		GridBagConstraints gbc_la32 = new GridBagConstraints();
		gbc_la32.insets= new Insets(0, 5, 5, 5);
		gbc_la32.gridx = 0;
		gbc_la32.gridy = 1;
		pCenter3Center.add(la32, gbc_la32);
		
		JTextField tf_ModEng=new JTextField();
		GridBagConstraints gbc_tf_ModEng = new GridBagConstraints();
		gbc_tf_ModEng.insets= new Insets(0, 5, 5, 5);
		gbc_tf_ModEng.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_ModEng.gridx = 1;
		gbc_tf_ModEng.gridy = 1;
		pCenter3Center.add(tf_ModEng, gbc_tf_ModEng);
		
		JLabel la33=new JLabel("수학");
		GridBagConstraints gbc_la33 = new GridBagConstraints();
		gbc_la33.insets= new Insets(0, 5, 5, 5);
		gbc_la33.gridx = 0;
		gbc_la33.gridy = 2;
		pCenter3Center.add(la33, gbc_la33);
		
		JTextField tf_ModMath=new JTextField();
		GridBagConstraints gbc_tf_ModMath = new GridBagConstraints();
		gbc_tf_ModMath.insets= new Insets(0, 5, 5, 5);
		gbc_tf_ModMath.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_ModMath.gridx = 1;
		gbc_tf_ModMath.gridy = 2;
		pCenter3Center.add(tf_ModMath, gbc_tf_ModMath);
		
		JButton btnModifyExe=new JButton("수정한 성적 반영하기");
		GridBagConstraints gbc_btnModifyExe = new GridBagConstraints();
		gbc_btnModifyExe.insets= new Insets(0, 5, 5, 5);
		gbc_btnModifyExe.gridx = 0;
		gbc_btnModifyExe.gridy = 3;
		gbc_btnModifyExe.gridwidth = 2;
		pCenter3Center.add(btnModifyExe, gbc_btnModifyExe);
			
//전체보기 버튼		
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				pCenter2.setVisible(false);
				pCenter3.setVisible(false);
				pCenter.setVisible(true);
				
				contentPane.add(pCenter, BorderLayout.CENTER);

				String sql="select * from student01";
				new oracle.jdbc.driver.OracleDriver();
				
				String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
				Properties prop=new Properties();
				prop.setProperty("user", "scott");
				prop.setProperty("password", "tiger");
				
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				try {
					conn=DriverManager.getConnection(url, prop);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					
					int cnt=0;
					while(rs.next()){
						for(int i=1; i<6; i++){
							table[cnt++].setText(rs.getString(i));
						}
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally{
					try {
						if(rs!=null) rs.close();
						if(stmt!=null) stmt.close();
						if(conn!=null) conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				
			revalidate();	
			}
		});
		
		
//입력 버튼
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pCenter.setVisible(false);
				pCenter3.setVisible(false);
				pCenter2.setVisible(true);
				contentPane.add(pCenter2, BorderLayout.CENTER);
				
			}
		});
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sql="insert into student01 values(";
				sql+=tf_addNum.getText()+",";
				sql+="'"+tf_addName.getText()+"',";
				sql+=tf_addKor.getText()+",";
				sql+=tf_addEng.getText()+",";
				sql+=tf_addMath.getText()+")";//마지막 ; 안 넣어야 함.
				System.out.println(sql);
				
				tf_addNum.setText("");
				tf_addName.setText("");
				tf_addKor.setText("");
				tf_addEng.setText("");
				tf_addMath.setText("");
				
				new oracle.jdbc.driver.OracleDriver();
				
				String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
				Properties prop=new Properties();
				prop.setProperty("user", "scott");
				prop.setProperty("password", "tiger");
				
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				try {
					conn=DriverManager.getConnection(url, prop);
					stmt=conn.createStatement();
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally{
					try {
						if(rs!=null) rs.close();
						if(stmt!=null) stmt.close();
						if(conn!=null) conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
//수정 버튼
		btn3.addActionListener(new ActionListener() {//수정버튼
			
			public void actionPerformed(ActionEvent e) {
				pCenter.setVisible(false);
				pCenter2.setVisible(false);
				pCenter3.setVisible(true);
				contentPane.add(pCenter3, BorderLayout.CENTER);
			}
		});
		String sql="select name from student01";
		new oracle.jdbc.driver.OracleDriver();
		
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Properties prop=new Properties();
		prop.setProperty("user", "scott");
		prop.setProperty("password", "tiger");
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			conn=DriverManager.getConnection(url, prop);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			int cnt=0;
			while(rs.next()){
				listModel.addElement(rs.getString(1));
			}
			list.setModel(listModel);
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally{
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pCenter3Center.setVisible(true);
			}
		});
		btnModifyExe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				nameToModify=(String) list.getSelectedValue();//선택한 학생 이름.
				String sql="update student01 set ";
				sql+="kor="+tf_ModKor.getText()+", ";
				sql+="eng="+tf_ModEng.getText()+", ";
				sql+="math="+tf_ModMath.getText();
				sql+=" where name='"+nameToModify+"'";
				System.out.println(sql);
				
				tf_ModKor.setText("");
				tf_ModEng.setText("");
				tf_ModMath.setText("");
				
				new oracle.jdbc.driver.OracleDriver();
				
				String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
				Properties prop=new Properties();
				prop.setProperty("user", "scott");
				prop.setProperty("password", "tiger");
				
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				try {
					conn=DriverManager.getConnection(url, prop);
					stmt=conn.createStatement();
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally{
					try {
						if(rs!=null) rs.close();
						if(stmt!=null) stmt.close();
						if(conn!=null) conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				list.updateUI();
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				nameToModify=(String) list.getSelectedValue();//선택한 학생 이름.
				String sql="delete from student01";
				sql+=" where name='"+nameToModify+"'";
				System.out.println(sql);
			
				new oracle.jdbc.driver.OracleDriver();
				
				String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
				Properties prop=new Properties();
				prop.setProperty("user", "scott");
				prop.setProperty("password", "tiger");
				
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				try {
					conn=DriverManager.getConnection(url, prop);
					stmt=conn.createStatement();
					int result=stmt.executeUpdate(sql);
					System.out.println("del:"+result);
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally{
					try {
						if(rs!=null) rs.close();
						if(stmt!=null) stmt.close();
						if(conn!=null) conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				
			}
		});
	}
}