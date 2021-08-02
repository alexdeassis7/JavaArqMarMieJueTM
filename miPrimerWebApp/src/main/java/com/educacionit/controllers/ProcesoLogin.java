package com.educacionit.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/init.do")
public class ProcesoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProcesoLogin() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreUsuario = null ;
		Integer passwordUsuario = null ;
		
		
		if((request.getParameter("pass") != "" && request.getParameter("uname") != ""   )) {
			passwordUsuario = Integer.parseInt(request.getParameter("pass"));
			nombreUsuario = request.getParameter("uname");
		}
		
		
		if(nombreUsuario != null && passwordUsuario != null) {
			System.out.println("Se creo su usuario en la base");
			//crear un dao 
			//crear un User VO
			//Crear tabla para guardar los users 
			/*
			 * userDao dao = new UserDao();
			 * userVo uvo = new UserVO (nombreUsuario,passwordUsuario);
			 * dao.registraUser(uvo)
			 * response.sendRedirect("welcome.html")
			 * 
			 * 
			 * */
			
			
			
		}else {
			System.out.println("no se puede guardar nulos en la base ");
			response.sendRedirect("error.html");
		}
		
		
		
		
		
		
		
	}

}
