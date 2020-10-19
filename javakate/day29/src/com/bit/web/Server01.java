package com.bit.web;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {

	public static void main(String[] args) {

		int port=80;
		ServerSocket serv=null;
		Socket sock=null;
		OutputStream os=null;
		PrintStream ps=null;
		try {
			serv=new ServerSocket(port);
			sock=serv.accept();
			os=sock.getOutputStream();
			ps=new PrintStream(os);
			
			//web에서 약속된 통신 규약. 규약을 지켜야 접속이 됨.
			ps.println("HTTP/1.1 200 OK \r\n");
			//정상 접근했고 성공했으니 메시지를 출력해도 좋아. 라는 뜻
//			ps.println("HTTP/1.1 404 Not Found\r\n");
			//페이지를 찾을 수 없음. 이라는 뜻
			//이런 걸 처리해주는 것이 웹서버 프로그램(예: 
//			ps.println("print ok?...");
			
			for(int i=0; i<5; i++){
				ps.println("<h1>print "+i+"ok?...</h1>");//글씨 커지고 bold됨
			}
			//front-end 언어들(html, CSS(화면 이쁘게),javascript-j쿼리(javascript를 보다 쉽게 다루기 위한 라이브러리))
			//앞으로는 출력될 내용들을 만드는 것에 주력. 실행, 출력 등은 웹서버 프로그램에서 다 수행해 줌.
			//자동화된 새로운 모듈을 개발한 것이 JSP
			//JSP(쉽게 구현된 것)로 백엔드 구현 한 사이클 하고
			//sublet(보다 원초적인 것)로도 백엔드 구현 한 사이클 할 거다.
			//front-end - 첫 사이클은 웹 표준 이전 것 단순히 한 번 하고
			//두번 째는 웹 표준에 대한 것 많이 다룰 것.
			//동적처리(코딩에 적힌 게 아니라 유저가 쓴 글에 따라 내용 바뀌는 것)도 필요
			//File I/O로 할 수도 있겠지만, 문제 많음. 부딧히고, 용량 너무 커지고 등등...
			//그래서 DB 를 사용할 거다. 우리는 Oracle DB 배울 것. Oracle DB: 관계형 DB의 조상.
			//Oracle DB: 좀 불편하긴 하지만 왠만한 관계형 DB는 문제 없을 것.
			
			ps.flush();
			//실행 후 브라우저에서 localhost 수행하면 print ok?... 찍힘
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(os!=null) os.close();
				if(sock!=null) sock.close();
				if(serv!=null) serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
