package com.mvcapplication.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvcapplication.validation.checkLoginValidation;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/login")
public class loginPage extends HttpServlet {
	
	checkLoginValidation checker = new checkLoginValidation();
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, res);
	} 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		req.setAttribute("myEmail", email);
		req.setAttribute("myPass", pass);
		
		if(checker.checkValidation(email, pass)) {
			req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, res);
		} else {
			req.setAttribute("errorMessage", "<div class=\"container\" style=\"margin-top:50px\"><h3 class=\"alert alert-warning\">Please check out your email or password!</h3></div>");
			req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, res);
		}
		
		
	
		
	} 
	
}


	








