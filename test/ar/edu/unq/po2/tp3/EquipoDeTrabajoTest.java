package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {
	
	private Persona 			persona1;
	private Persona 			persona2;
	private Persona 			persona3;
	private EquipoDeTrabajo 	equipo1;
	private ArrayList<Persona> 	integrantes;
	
	@BeforeEach
	public void setUp() {
		persona1 = new Persona("Javier", LocalDate.of(2000, 8, 7));
		persona2 = new Persona("Marcela", LocalDate.of(1999, 4, 19));
		persona3 = new Persona("Gabriel", LocalDate.of(2002, 2, 6));
		integrantes = new ArrayList<Persona>();
		integrantes.add(persona1);
		integrantes.add(persona2);
		integrantes.add(persona3);
		equipo1  = new EquipoDeTrabajo("Equipo Logico", integrantes);
	}

	@Test
	void vereificarPromedioDeEdadDeLosIntegrantes() {
		assertEquals(22d, this.equipo1.promedioDeEdadDeIntegrantes());
	}

}
