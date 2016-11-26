package com.virtusa.project.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.project.ui.service.UiServices;

public class UpdateUserDetails extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int memberId = Integer.parseInt(request.getParameter("memberId")); 
		String userName = request.getParameter("userName");
		String userPhoneNumber = request.getParameter("phoneNumber");
		String password = request.getParameter("userPassword");
		UiServices uiServices = new UiServices();
		uiServices.updateUser(memberId,userName, password, userPhoneNumber);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin/admin_home_page.jsp");
		requestDispatcher.include(request, response);
	}

}
