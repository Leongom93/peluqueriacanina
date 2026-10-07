package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

public class Controladora {

	//La logica llama a la persistencia
	//crea un objeto de controladoraPersistencia para poder llamar a sus metodos de JPA
	ControladoraPersistencia controlPersis = new ControladoraPersistencia();

	//Esto llama el boton Guardar
	public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
	
		//Creamos el dueño y asignamos sus valores - tomads de la igu
		Duenio duenio = new Duenio();
		duenio.setNombre(nombreDuenio);
		duenio.setCelDuenio(celDuenio);
		
		//Creamos la mascota y asignamos sus valores - tomads de la igu
		Mascota masco = new Mascota();
		masco.setNombre(nombreMasco);
		masco.setRaza(raza);
		masco.setColor(color);
		masco.setAlergico(alergico);
		masco.setAtencion_especial(atenEsp);
		masco.setObservaciones(observaciones);
		//Se vincula el duenño que estoy creando arriba en esta mascota
		masco.setUnDuenio(duenio);

		
		//LLamar a la persisitencia para crear estos 2 objetos en nuestra BD
		controlPersis.guardar(duenio,masco);
	}
	
}