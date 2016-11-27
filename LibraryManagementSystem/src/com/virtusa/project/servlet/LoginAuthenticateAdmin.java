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
public class LoginAuthenticateAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int adminId = Integer.parseInt(request.getParameter("adminid"));
		String adminPassword = request.getParameter("adminpassword");
		UiServices uiServices = new UiServices();
		if(uiServices.adminLogin(adminId, adminPassword)){
			String adminName = uiServices.getAdminName(adminId);
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("adminId", adminId);
			httpSession.setAttribute("userType", "ADMIN");
			httpSession.setAttribute("adminName", adminName);
			/*RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin/admin_home_page.jsp");
			requestDispatcher.forward(request, response);*/
			response.sendRedirect("admin/admin_home_page.jsp");
		}else{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}
