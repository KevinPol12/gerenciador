package com.alura.gerenciador.accion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.alura.gerenciador.modelo.DB;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ModificarEmpresa implements Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
System.out.println("Empresa Actualizada");
		
		Integer paramId = Integer.valueOf(request.getParameter("id"));
		String nombreEmpresa = request.getParameter("nombre");
		String paramFechaAbertura = request.getParameter("fecha");
		
		Date fechaAbertura = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			fechaAbertura = sdf.parse(paramFechaAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		DB baseDeDatos = new DB();
		baseDeDatos.modificarEmpresaPorId(paramId, nombreEmpresa,fechaAbertura);
		
		return "redirect:entrada?accion=ListaEmpresas";
		

	}
	

}