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

public class IssueBook extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		int bookId = Integer.parseInt(request.getParameter("bookId"));
		int memberId = Integer.parseInt(session.getValue("memberId")+"");
		UiServices uiServices = new UiServices();
		String ack =uiServices.issueBook(memberId,bookId);
		session.setAttribute("ack", ack);
		/*RequestDispatcher requestDispatcher = request.getRequestDispatcher("member/member_home_page.jsp");
		requestDispatcher.include(request, response);*/
		response.sendRedirect("member/member_home_page.jsp");
	}

}
