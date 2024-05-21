//package com.alura.gerenciador.servlet;
//
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//import java.io.IOException;
//
//import com.alura.gerenciador.accion.Accion;
//import com.alura.gerenciador.accion.EliminarEmpresa;
//import com.alura.gerenciador.accion.NuevaEmpresaForm;
//import com.alura.gerenciador.accion.ListaEmpresas;
//import com.alura.gerenciador.accion.ModificarEmpresa;
//import com.alura.gerenciador.accion.MostrarEmpresa;
//import com.alura.gerenciador.accion.NuevaEmpresa;
//

//@WebServlet(urlPatterns="/entrada")
//public class UnicaEntradaServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	protected void service(HttpServletRequest request, HttpServletResponse response) 
//			throws ServletException, IOException {
//	
//		String paramAccion = request.getParameter("accion");
//		
//		String nombre= null;
//		
//		String nombreDeClase = "com.alura.gerenciador.accion."+paramAccion;
//		
//			Accion obj;
//			try {
//				Class clase = Class.forName(nombreDeClase);
//				obj = (Accion) clase.newInstance();
//				nombre = obj.ejecutar(request, response);
//			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//				throw new ServletException(e);
//			}
//			
//			String [] tipoYDireccion = nombre.split(":");
//			
//			
//			if(tipoYDireccion[0].equals("forward")) {
//				System.out.println("/"+tipoYDireccion[1]);
//				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+tipoYDireccion[1]);
//				rd.forward(request, response);
//				
//			}else if (tipoYDireccion[0].equals("redirect")) { 
//				System.out.println("Redirect is: "+tipoYDireccion[1]);
//				response.sendRedirect(tipoYDireccion[1]);
//			}
			
		
		
		
		
//		if(paramAccion.equals("ListaEmpresas")) {
//			ListaEmpresas accion = new ListaEmpresas();
//			nombre = accion.ejecutar(request,response);
//		}else if(paramAccion.equals("MostrarEmpresa")) {
//			MostrarEmpresa accion = new MostrarEmpresa();
//			System.out.println("Mostrando empresa: "+request.getAttribute("id"));
//			nombre = accion.ejecutar(request,response);
//		}else if(paramAccion.equals("EliminarEmpresa")) {
//			EliminarEmpresa accion = new EliminarEmpresa();
//			nombre = accion.ejecutar(request,response);
//		}else if(paramAccion.equals("ModificarEmpresa")) {
//			ModificarEmpresa accion = new ModificarEmpresa();
//			nombre = accion.ejecutar(request,response);
//		}else if(paramAccion.equals("NuevaEmpresa")) {
//			NuevaEmpresa accion = new NuevaEmpresa();
//			nombre = accion.ejecutar(request,response);
//		}else if(paramAccion.equals("FormNuevaEmpresa")) {
//			FormNuevaEmpresa accion = new FormNuevaEmpresa();
//			nombre = accion.ejecutar(request,response);
//		}
		
		
		
		
//	}
//
//}
