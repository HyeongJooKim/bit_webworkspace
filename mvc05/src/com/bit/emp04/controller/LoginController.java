package com.bit.emp04.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bit.emp04.model.Emp04Dao;
import com.bit.emp04.model.Emp04Dto;

@WebServlet("/login.bit")
public class LoginController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int sabun=Integer.parseInt(request.getParameter("sabun"));
		String name=request.getParameter("name");
		Emp04Dao dao=new Emp04Dao();
		Emp04Dto bean=dao.login(sabun, name);
		HttpSession session=request.getSession();
		session.setAttribute("login", bean);
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}
}