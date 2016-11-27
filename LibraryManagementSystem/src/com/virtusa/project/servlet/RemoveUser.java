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

/**
 * Servlet implementation class RemoveUser
 */
@WebServlet("/RemoveUser")
public class RemoveUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("userId") != null) {
			HttpSession session = request.getSession();
			String userId = request.getParameter("userId");
			UiServices uiServices = new UiServices();
			String ack ="";
			if(uiServices.removeUser(Integer.parseInt(userId))){
				ack="User Successfully Removed";
				session.setAttribute("ack", ack);
				/*RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin/admin_home_page.jsp");
				requestDispatcher.include(request, response);*/
				response.sendRedirect("admin/admin_home_page.jsp");
			}
			else{
				ack="Enter valid ID";
				session.setAttribute("ack", ack);
				/*RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin/remove_user.jsp");
				requestDispatcher.include(request, response);*/
				response.sendRedirect("admin/admin_home_page.jsp");
			}
			
		}
	}

}
