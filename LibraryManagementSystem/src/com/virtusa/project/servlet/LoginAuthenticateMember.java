package com.virtusa.project.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.project.ui.service.UiServices;

//@WebServlet("/LoginAuthenticateAdmin")
public class LoginAuthenticateMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int memberId = Integer.parseInt(request.getParameter("memberid"));
		String memberPassword = request.getParameter("memberpassword");
		UiServices uiServices = new UiServices();
		if(uiServices.memberLogin(memberId, memberPassword)){
			String memberName = uiServices.getMemberName(memberId);
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("memberId", memberId);
			httpSession.setAttribute("userType", "MEMBER");
			httpSession.setAttribute("memberName", memberName);
			//RequestDispatcher requestDispatcher = request.getRequestDispatcher("member/member_home_page.jsp");
			//requestDispatcher.include(request, response);
			response.sendRedirect("member/member_home_page.jsp");
			return ;
		}else{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}
