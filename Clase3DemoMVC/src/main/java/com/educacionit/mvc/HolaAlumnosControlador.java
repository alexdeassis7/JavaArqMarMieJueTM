package com.educacionit.mvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaAlumnosControlador {

	// este metodo proporcionara la vista con un formulario al user
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "HolaAlumnosFormulario";
	}

	// este metodo proporcionara la vista con un formulario al user
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}

	// este metodo procesa la info del modelo y llama luego a al vista
	@RequestMapping("/procesarFormulario2")
	public String otroProcesarFormulario(HttpServletRequest request, Model modelo) {
		String nombre = request.getParameter("nombreAlumno");

		nombre += " es el alumno mejor calificado ";

		String mensajeFinal = " Quien es el mejor Alumno? " + nombre;

		// agregamos informacion o dato al modelo

		modelo.addAttribute("mensaje", mensajeFinal);

		return "HolaAlumnosSpring";
	}

}
