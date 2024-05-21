package com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DB {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();
	private static List<Usuario> listaUsuarios= new ArrayList<>();
	private static Integer llaveSecuencial =1;
	
	static {
		Empresa empresa = new Empresa("Alura");
		empresa.setId(DB.llaveSecuencial++);
		Empresa empresa2 = new Empresa("Caelum");
		empresa2.setId(DB.llaveSecuencial++);
		Empresa empresa3 = new Empresa("Messi");
		empresa3.setId(DB.llaveSecuencial++);
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
		listaEmpresas.add(empresa3);
		
		Usuario u1 = new Usuario("bruno","12345");
		Usuario u2 = new Usuario("Marco","12345");
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
		
	}

	public void agregarEmpresa(Empresa empresa) {
		empresa.setId(DB.llaveSecuencial++);
		DB.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return DB.listaEmpresas;
	}
	
	
	

	public void eliminarEmpresa(Integer id) {

		Iterator<Empresa> it = listaEmpresas.iterator();

		while (it.hasNext()) {

			Empresa emp = it.next();
			if (emp.getId() == id) {
				it.remove();
			}
		}

	}

	public Empresa buscarEmpresaPorId(Integer id) {

		for (Empresa empresa : listaEmpresas) {

			if (empresa.getId() == id) {
				return empresa;

			}

		}
		return null;
	}

	public void modificarEmpresaPorId(Integer id, String nombreEmpresa, Date FechaAbertura) {

		Iterator<Empresa> it = listaEmpresas.iterator();
		
		while (it.hasNext()) {
			
			Empresa emp = it.next();
			if (emp.getId() == id) {
				emp.setNombre(nombreEmpresa);
				emp.setFechaAbertura(FechaAbertura);
				System.out.println("Fecha en base de datos es: "+emp.getFechaAbertura());
			}
		}
		
	}

	public Usuario existeUsuario(String paramLogin, String paramContrasena) {

		for (Usuario usuario : listaUsuarios) {
			if (usuario.esIgual(paramLogin, paramContrasena)) {
				return usuario;
			}
		}
		
		return null;
	}
	
		
}
		

