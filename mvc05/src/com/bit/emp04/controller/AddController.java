package com.bit.emp04.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bit.emp04.model.Emp04Dto;

@WebServlet("/add.bit")
public class AddController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		Object obj=session.getAttribute("login");
		if(obj!=null){
			Emp04Dto bean=(Emp04Dto)obj;
			if(bean.getLvl()>0){
				request.getRequestDispatcher("add.jsp").forward(request, response);
			}
		}else{
			response.sendRedirect("err.jsp");
		}
	}
}
