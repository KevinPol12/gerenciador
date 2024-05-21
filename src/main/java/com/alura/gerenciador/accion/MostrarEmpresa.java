package com.alura.gerenciador.accion;

import java.io.IOException;

import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Empresa;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MostrarEmpresa implements Accion{

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Integer id = Integer.valueOf(request.getParameter("id"));

		System.out.println("Mostrando Empresa");
		
		System.out.println(id+" in servlet");
		
		DB db = new DB();
		Empresa emp = db.buscarEmpresaPorId(id);
		
		
		request.setAttribute("empresa", emp);
		
		return "forward:formModificarEmpresa.jsp";
		
	}

}
