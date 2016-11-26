package com.virtusa.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.project.ui.service.UiServices;


public class UpdateBook extends HttpServlet {
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("1");
		if (request.getParameter("bookId") != null) {
			System.out.println("2");
			String bookId = request.getParameter("bookId");
			UiServices uiServices = new UiServices();
			if(uiServices.validateBookId(Integer.parseInt(bookId))){
				System.out.println("3");
				String bookString = uiServices.getBookString(Integer.parseInt(bookId));
				PrintWriter out = response.getWriter();
				request.setAttribute("bookString", bookString);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin/update_book.jsp");
				requestDispatcher.forward(request, response);
			}else{
				System.out.println("4");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin/update_book_by_id.jsp");
				requestDispatcher.forward(request, response);
			}
		
	}
	}
}
