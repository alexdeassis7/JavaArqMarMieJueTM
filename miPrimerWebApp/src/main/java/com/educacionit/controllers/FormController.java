package com.educacionit.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//anotacion localhost:8080/miPrimerWebApp/FormController
@WebServlet("/FormController")
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FormController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Llego el request al servlet de la app web por el verbo GET");

		//capturamos lo parametros que se envian desde el form (utilizando su name )
		String em = request.getParameter("email")	;
		String un = request.getParameter("uname")	;
		String pa = request.getParameter("pass")	;
		String ge = request.getParameter("gender")	;
		String[] co = request.getParameterValues("course")	;
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<h2>Recibimos tu peticion correctamente en el back end,"
				+ " estos son los datos que se guardaron en la DB</h2>");
		pw.write("<h3>Email recibido : " + em + " </h3>");
		pw.write("<h3>User Name  recibido : " + un + " </h3>");
		pw.write("<h3>Password recibido : " + pa + " </h3>");
		pw.write("<h3>Genero recibido : " + ge + " </h3>");
		pw.write("<h3>Cursos recibidos : " );
		for (String c : co) {
			pw.write(c + " ");
		}
		pw.write(" </h3>");
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Llego el request al servlet de la app web por el verbo POST");

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<h2>Recibimos tu peticion POST correctamente en el back end</h2>");
		pw.write("<h3>Gracias</h3>");
		pw.write("<h3>Vuelvas Pronto</h3>");
	}

}
