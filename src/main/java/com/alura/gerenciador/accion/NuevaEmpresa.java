package com.alura.gerenciador.accion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Empresa;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NuevaEmpresa implements Accion{
	
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("nueva empresa registrada");
		
		String nombreEmpresa = request.getParameter("nombre");
		String paramFechaAbertura = request.getParameter("fecha");
		
		Date fechaAbertura = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			fechaAbertura = sdf.parse(paramFechaAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa(nombreEmpresa, fechaAbertura);
		
		DB baseDeDatos = new DB();
		baseDeDatos.agregarEmpresa(empresa);
		System.out.println("Nueva empresa es: " + empresa);
		
		return "redirect:entrada?accion=ListaEmpresas";
		
		
		
	}
	

}
