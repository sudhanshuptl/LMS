package com.virtusa.project.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.project.ui.service.UiServices;

public class UpdateBookDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int bookId = Integer.parseInt(request.getParameter("bookId")); 
		String bookName = request.getParameter("bookName");
		String authorName = request.getParameter("authorName");
		String edition = request.getParameter("edition");
		UiServices uiServices = new UiServices();
		uiServices.updateBook(bookId,bookName, authorName, edition);
		String ack = "Book Successfully Updated";
		session.setAttribute("ack", ack);
		/*RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin/admin_home_page.jsp");
		requestDispatcher.include(request, response);*/
		response.sendRedirect("admin/admin_home_page.jsp");
	}

}
