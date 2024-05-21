package com.alura.gerenciador.servlet;

import java.io.IOException;

import com.alura.gerenciador.accion.Accion;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



//@WebFilter(urlPatterns = "/entrada")
public class ControladorFilter implements Filter {


	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, 
			FilterChain chain) throws IOException, ServletException {
	
		System.out.println("ControladorFilter");
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		String paramAccion = servletRequest.getParameter("accion");
		
		String nombre= null;
		
		String nombreDeClase = "com.alura.gerenciador.accion."+paramAccion;
		
			Accion obj;
			try {
				Class clase = Class.forName(nombreDeClase);
				obj = (Accion) clase.newInstance();
				nombre = obj.ejecutar(request, response);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				throw new ServletException(e);
			}
			
			String [] tipoYDireccion = nombre.split(":");
			
			
			if(tipoYDireccion[0].equals("forward")) {
				System.out.println("/"+tipoYDireccion[1]);
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+tipoYDireccion[1]);
				rd.forward(request, response);
				
			}else if (tipoYDireccion[0].equals("redirect")) { 
				System.out.println("Redirect is: "+tipoYDireccion[1]);
				response.sendRedirect(tipoYDireccion[1]);
			}
		
	}

}
