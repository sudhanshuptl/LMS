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
 * Servlet implementation class RemoveUser
 */
@WebServlet("/RemoveUser")
public class RemoveUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("userId") != null) {
			System.out.println("hi");
			String userId = request.getParameter("userId");
			UiServices uiServices = new UiServices();
			uiServices.removeUser(Integer.parseInt(userId));
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin/admin_home_page.jsp");
			requestDispatcher.include(request, response);
		}
	}

}
