package com.bit.dept04.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Dept04Dao;


@WebServlet("/index.bit")
public class ListController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		request.getServletContext();
		
		Dept04Dao dao=null;
		dao=new Dept04Dao();
		request.setAttribute("list", dao.selectAll());
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}