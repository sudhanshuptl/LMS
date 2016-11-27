package com.virtusa.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.project.ui.service.UiServices;

/**
 * Servlet implementation class addUser
 */
@WebServlet("/addUser")
public class AddUser extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("hi");
		//out.println("hi");
		HttpSession session = request.getSession(false);
		String userName = request.getParameter("userName");
		String userPhoneNumber = request.getParameter("phoneNumber");
		String password = request.getParameter("userPassword");
		UiServices uiServices = new UiServices();
		String ack ="";
		if(uiServices.addUser(userName, password, userPhoneNumber)){
			ack = "User Successfully added";
		}
		session.setAttribute("ack", ack);
		/*RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin/admin_home_page.jsp");
		requestDispatcher.forward(request, response);*/
		response.sendRedirect("admin/admin_home_page.jsp");
	}

}
