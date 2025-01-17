package com.alura.gerenciador.accion;

import java.io.IOException;

import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login implements Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramLogin = request.getParameter("login");
		String paramContrasena = request.getParameter("contrasena");
		
		System.out.println("paramlogin: "+paramLogin);
		
		DB db = new DB();
		Usuario usuario = db.existeUsuario(paramLogin, paramContrasena);
		
		if(usuario != null) {
			System.out.println("Usuario Existe");
			HttpSession sesion = request.getSession();
			sesion.setAttribute("loginUsuario", usuario);
			return "redirect:entrada?accion=ListaEmpresas";		
		}else {
			return "redirect:entrada?accion=LoginForm";		
			
		}
		
	}

}
