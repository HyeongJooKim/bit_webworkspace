package com.bit.day27;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	public static void main(String[] args) {
		//url
//		scheme:[//[user:password@]host[:port]][/]path[?query][#fragment]
//		프로토콜://호스트:포트번호/패스?쿼리#지시자
//		String spec="http://www.seoul.go.kr/news/news_tender.do#view/318319";
//		String spec="https://www.jeju.go.kr/news/news/news.htm?act=view&seq=1245562";
		String spec="https://ko.wikipedia.org/wiki/HTTPS#%EC%97%AD%EC%82%AC";
		java.net.URL url=null;
		try {
			url=new URL(spec);
			System.out.println("protocol:"+url.getProtocol());//http
//			protocol
//			HTTP : Hyper Text Transfer Protocol 가장 흔하게 쓰는 프로토콜
//			HTTPS : Hyper Text Transfer Protocol Secure HTTP에서 보안이 강화된 버전
//			HTTP 주소로 입력해도 자동으로 HTTPS로 이동하는 경우 많다
			
			System.out.println("도메인(IP):"+url.getHost());//www.seoul.go.kr
//			도메인
			
			System.out.println("포트번호:"+url.getPort());//-1이라 나온 건 정보가 없어서
			System.out.println("포트번호(default):"+url.getDefaultPort());//443 나옴
//			특정 포트로만 접근하도록 하는 것. 열려 있는 문.  
//			HTTP의 기본 포트번호: 80
//			HTTPS의 기본 포트번호: 443
//			도메인 주소 뒤에 :80 추가해도 잘 연결됨
			
			System.out.println("패스경로:"+url.getPath());///news/news_tender.do
			System.out.println("url쿼리:"+url.getQuery());//null
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}