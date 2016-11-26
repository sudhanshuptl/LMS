package com.virtusa.project.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.project.ui.service.UiServices;

public class RemoveBooKs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("bookId") != null) {
			System.out.println("hi");
			String bookId = request.getParameter("bookId");
			UiServices uiServices = new UiServices();
			uiServices.removeUser(Integer.parseInt(bookId));
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin/admin_home_page.jsp");
			requestDispatcher.include(request, response);
		}
	}

}
