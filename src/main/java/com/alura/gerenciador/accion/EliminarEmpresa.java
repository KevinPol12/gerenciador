package com.alura.gerenciador.accion;

import java.io.IOException;

import com.alura.gerenciador.modelo.DB;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EliminarEmpresa implements Accion{

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws IOException {

		Integer id = Integer.valueOf(request.getParameter("id"));

		System.out.println("Eliminando Empresa "+id);

		
		DB db = new DB();
		db.eliminarEmpresa(id);
		
		return "redirect:entrada?accion=ListaEmpresas";
		
	}

	
	
}
