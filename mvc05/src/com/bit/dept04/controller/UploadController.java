package com.bit.dept04.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/upload.bit")
public class UploadController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("upload.jsp").forward(req, resp);
	}
	
	//	Workspace\.metadata\.plugins
	//		\org.eclipse.wst.server.core
	//		\tmp0\wtpwebapps\mvc05
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		System.out.println(request.getParameter("sabun"));
//		이래봤자 null 나옴. 멀티파트는 이렇게는 안받아짐
		
		//upload file size
		int fsize=1*1024*1024*13;
		//upload file path
		String path=request.getRealPath("up");
		System.out.println(path);
		//upload file rename FileRenamePolicy
		DefaultFileRenamePolicy frp=new DefaultFileRenamePolicy();
				
		MultipartRequest mpReq=new MultipartRequest(request,path,fsize,"utf-8",frp);
		System.out.println(mpReq.getParameter("sabun"));
		request.setAttribute("rename", mpReq.getFilesystemName("file1"));
		request.setAttribute("origin", mpReq.getOriginalFileName("file1"));
		request.getRequestDispatcher("download.jsp").forward(request, response);
	}
}