package com.bit.day21;

import java.io.IOException;

//IO - 대상을 파일로 해서 연습해볼 거다. 콘솔에 하던 것도 다 IO였다.
//파일 다루기

public class Ex01 {

	public static void main(String[] args) throws IOException{

//		String path="C:\\javakate\\day21\\test01";//이런 건 절대경로
//		String path="C:\\javakate\\day21\\src";
//		String path="test01";//이렇게도 되는 이유는? 같은 폴더여서?
//		String path="./test01";//앞에 ./ 숨겨져 있는 것
		String path=".";//현재 디렉토리 
		//하지만 이클립스에서 자동생성한 폴더들은 무시하고 java project name 수준을 현 디렉토리로 인식하는 듯
//		String path="..";//상위 디렉토리 
//		String path="..\\day21\\test01";//상위 디렉토리 갔다가 다시 온 것.
		//이렇게 내 위치에서 시작해서 왔다 갔다 하는 경로를 상대경로라 함.
		
		java.io.File file=new java.io.File(path);
		//default 생성자 없어서 오류 떨어짐. (path)처럼 변수 넣어줘야 함.
		//file 생성: 우클릭 File 선택, property에서 Location 가져와 path에 넣어줌.
		//그런데 \때문에 오류남. \\해줘야 함.
		System.out.println(path);//C:\javakate\day21\test01 잘 나옴
		
		//없는 문자 넣어도 오류 안나므로 있는 객체인지 확인하자
		System.out.println("파일존재?\t"+file.exists());//true
		//Windows에서는 파일명.확장자 규칙이지만
		//UNIX계열에서는 .파일명 은 숨긴 파일이란 뜻. .폴더 도 가능 폴더도 결국 파일이므로
		//UNIX계열에는 확장자 없는 파일도 많음.
		//Windows 10 전에는 파일명 없는 파일은 만들 수 없었음. cmd에서 만들었었어야 했음.
		System.out.println("파일인가?\t"+file.isFile());//true
		System.out.println("디렉토리인가?\t"+file.isDirectory());//false
		System.out.println("이름은?\t\t"+file.getName());//
		System.out.println("경로는?\t\t"+file.getPath());//전체 경로는 안나옴. 파일 만들 때 준 경로만 나옴.
		System.out.println("단순절대경로는?\t"+file.getAbsolutePath());//중간에 상대경로 지정한 게 있으면 그것도 같이 나옴
		System.out.println("일반절대경로는?\t"+file.getCanonicalPath());//중간에 상대경로 지정한 것 무시하고 절대경로만 잘 나오는데 Exception 떨어짐. Exception 처리하면 됨
		System.out.println("Path는?\t\t"+file.getParent());//상위 경로까지
		System.out.println("rwx r읽기권한?\t"+file.canRead());
		System.out.println("rwx w쓰기권한?\t"+file.canWrite());
		System.out.println("rwx x실행권한?\t"+file.canExecute());
		System.out.println("파일크기는?\t"+file.length()+"byte");
		System.out.println("최종수정시간?\t"+file.lastModified());//1000분의 1초로 나옴
		System.out.println("최종수정시간?\t"+new java.util.Date(file.lastModified()));
		System.out.println("--------------------------------");
		String[] dirs=file.list();
		for(int i=0; i<dirs.length; i++){
			System.out.println(dirs[i]);
		}
		System.out.println("--------------------------------");
		System.out.println(java.util.Arrays.toString(dirs));//for 문 안하고 출력
		System.out.println("--------------------------------");
		String path2=file.getParent();
		
		
		
	}

}
