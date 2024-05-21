package com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Empresa;
import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/empresas")
public class EmpresasService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Empresa> empresas = new DB().getEmpresas();
		
		String format = request.getHeader("Accept");
		
		if (format.contains("xml")) {
			
			XStream xstream = new XStream();
			xstream.alias("Empresa", Empresa.class );
			String xml = xstream.toXML(empresas);

			System.out.println(xml);

			response.setContentType("Application/xml");
			response.getWriter().println(xml);
			
		} else if (format.contains("json")) {
		
			Gson gson = new Gson();
			String json = gson.toJson(empresas);
	
			System.out.println(json);
	
			response.setContentType("Application/json");
			response.getWriter().println(json);

		}else {
			
			response.setContentType("Application/json");
			response.getWriter().println("{'message' : 'No Content'}");

		}
	}

}
