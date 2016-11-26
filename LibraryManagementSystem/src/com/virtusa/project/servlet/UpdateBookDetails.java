package com.virtusa.project.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.project.ui.service.UiServices;

/**
 * Servlet implementation class UpdateBookDetails
 */
@WebServlet("/UpdateBookDetails")
public class UpdateBookDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bookId = Integer.parseInt(request.getParameter("bookId")); 
		String bookName = request.getParameter("bookName");
		String authorName = request.getParameter("authorName");
		String edition = request.getParameter("edition");
		UiServices uiServices = new UiServices();
		uiServices.updateBook(bookId,bookName, authorName, edition);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin/admin_home_page.jsp");
		requestDispatcher.include(request, response);
	}

}
