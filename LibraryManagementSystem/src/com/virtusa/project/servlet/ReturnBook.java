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


public class ReturnBook extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int bookId = Integer.parseInt(request.getParameter("bookId"));
		System.out.println(bookId);
		HttpSession session = request.getSession(false);
		int memberId = Integer.parseInt(session.getValue("memberId")+"");
		System.out.println(memberId);
		UiServices uiServices = new UiServices();
		String ack = uiServices.returnBook(memberId,bookId);
		session.setAttribute("ack", ack);
		/*RequestDispatcher requestDispatcher = request.getRequestDispatcher("member/member_home_page.jsp");
		requestDispatcher.include(request, response);*/
		response.sendRedirect("member/member_home_page.jsp");
	}

}
