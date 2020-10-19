package com.bit.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Emp03Dao;
import com.bit.model.Emp03Dto;


@WebServlet("/edit.bit")
public class EditController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int sabun=Integer.parseInt(request.getParameter("idx"));
		try {
			Emp03Dao dao = new Emp03Dao();
			Emp03Dto bean=dao.selectOne(sabun);
			request.setAttribute("dto", bean);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd=request.getRequestDispatcher("edit.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sabun=Integer.parseInt(request.getParameter("sabun").trim());
		String name=request.getParameter("name").trim();
		String sub=request.getParameter("sub").trim();
		int pay=Integer.parseInt(request.getParameter("pay").trim());

		try{
			Emp03Dao dao=new Emp03Dao();
			dao.updateOne(sabun, name, sub, pay);
		}catch(SQLException e){
			e.printStackTrace();
		}
		response.sendRedirect("detail.bit?idx="+sabun);
	}
}
