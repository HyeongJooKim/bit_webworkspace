package com.bit.day27;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	public static void main(String[] args) {
		//url
//		scheme:[//[user:password@]host[:port]][/]path[?query][#fragment]
//		��������://ȣ��Ʈ:��Ʈ��ȣ/�н�?����#������
//		String spec="http://www.seoul.go.kr/news/news_tender.do#view/318319";
//		String spec="https://www.jeju.go.kr/news/news/news.htm?act=view&seq=1245562";
		String spec="https://ko.wikipedia.org/wiki/HTTPS#%EC%97%AD%EC%82%AC";
		java.net.URL url=null;
		try {
			url=new URL(spec);
			System.out.println("protocol:"+url.getProtocol());//http
//			protocol
//			HTTP : Hyper Text Transfer Protocol ���� ���ϰ� ���� ��������
//			HTTPS : Hyper Text Transfer Protocol Secure HTTP���� ������ ��ȭ�� ����
//			HTTP �ּҷ� �Է��ص� �ڵ����� HTTPS�� �̵��ϴ� ��� ����
			
			System.out.println("������(IP):"+url.getHost());//www.seoul.go.kr
//			������
			
			System.out.println("��Ʈ��ȣ:"+url.getPort());//-1�̶� ���� �� ������ ���
			System.out.println("��Ʈ��ȣ(default):"+url.getDefaultPort());//443 ����
//			Ư�� ��Ʈ�θ� �����ϵ��� �ϴ� ��. ���� �ִ� ��.  
//			HTTP�� �⺻ ��Ʈ��ȣ: 80
//			HTTPS�� �⺻ ��Ʈ��ȣ: 443
//			������ �ּ� �ڿ� :80 �߰��ص� �� �����
			
			System.out.println("�н����:"+url.getPath());///news/news_tender.do
			System.out.println("url����:"+url.getQuery());//null
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}