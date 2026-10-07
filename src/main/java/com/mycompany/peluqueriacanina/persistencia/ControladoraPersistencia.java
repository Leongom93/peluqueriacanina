package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;

public class ControladoraPersistencia {

	//Debo vinuclarlo con los jpa controller
	//crear un objeto con el contrutror JPA (DuenioJpaController y MascotaJpaController)
	
	DuenioJpaController duenioJpa = new DuenioJpaController();
	MascotaJpaController mascoJpa = new MascotaJpaController();

	//Es llamado desde la cotnroladora
	public void guardar(Duenio duenio, Mascota masco) {
		//Aca usamos los metodos del JPAController
		//Creamos el duenio en la BD
		duenioJpa.create(duenio);
		
		//Creamos la mascota en la BD
		mascoJpa.create(masco);
	}
	
}