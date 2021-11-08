package com.kedar.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/maven")
public class FirstMavenServletProject extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// set content type
		res.setContentType("text/html");
		// get writer
		PrintWriter pw = res.getWriter();
		// Provide the response
		pw.println("<h1 style='color:red;'>First Maven Project...</h1>");
		// Close writer
		pw.close();
	} // doGet(-,-)
} // class
