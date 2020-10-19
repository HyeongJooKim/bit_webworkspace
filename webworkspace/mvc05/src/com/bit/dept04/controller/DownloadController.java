package com.bit.dept04.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download.bit")
public class DownloadController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String filename=request.getParameter("file");
		String origin=request.getParameter("org");
		String path=request.getRealPath("up");
		File file=new File(path+"\\"+filename);
		System.out.println(file.exists());
		response.setContentType("application/octet-stream");
		//octet-stream ���� ���� ������Ÿ�� �Ἥ �Ϻη� �������� ���а� �ϴ� ��. �ٿ�ε� �ް� �Ϸ���
		response.setHeader("Content-Disposition","attachment; filename="+origin);
		//Header("Content-Disposition:attachment; filename=�����̸�);
		OutputStream out=response.getOutputStream();
		if(file.exists()){
			FileInputStream fis=new FileInputStream(file);
			int cnt=-1;
			while(fis.read()!=-1){
				out.write(cnt);
			}
		}
	}
}