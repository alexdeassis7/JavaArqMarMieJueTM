package com.educacionit.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionit.daos.PersonaDAO;
import com.educacionit.models.PersonaVO;

@WebServlet("/AbmPersonaController")
public class AbmPersonaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AbmPersonaController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nombre = request.getParameter("nombre");
		int edad = Integer.parseInt(request.getParameter("edad"));
		String profesion = request.getParameter("profesion");
		int telefono = Integer.parseInt(request.getParameter("telefono"));

		System.out.println("llego el request ");

		PersonaDAO miDao = new PersonaDAO();

		miDao.registrarPersona(new PersonaVO(edad, telefono, nombre, profesion));

		//redireccionamos del controller a una vista 
		response.sendRedirect("vistas/responsiveForm.html");
		
	}

}
