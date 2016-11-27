package com.virtusa.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class IsValidUser
 */
public class IsValidAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// <jsp:forward page="/IsValidAdmin" />
		HttpSession httpSession = request.getSession(false);
		PrintWriter out = response.getWriter();
		if (httpSession.getAttribute("userType") == null) {
			out.print("Login First");
			// response.sendRedirect("/../index.html");
			out.print("<script>window.location.replace(\"http://localhost:9091/LibraryManagementSystem/\")</script>");
		} else {
			if (!httpSession.getAttribute("userType").equals("ADMIN")) {
				out.print(
						"<script>window.location.replace(\"http://localhost:9091/LibraryManagementSystem/\")</script>");
			}
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		HttpSession httpSession = request.getSession(false);
		PrintWriter out = response.getWriter();
		if (httpSession.getAttribute("userType") == null) {
			out.print("<script>window.location.replace(\"http://localhost:9091/LibraryManagementSystem/\")</script>");
		} else {
			if (!httpSession.getAttribute("userType").equals("ADMIN")) {
				out.print(
						"<script>window.location.replace(\"http://localhost:9091/LibraryManagementSystem/\")</script>");
			}
		}
	}
}