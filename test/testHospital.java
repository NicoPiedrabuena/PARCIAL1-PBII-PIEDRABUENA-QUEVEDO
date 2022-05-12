import static org.junit.Assert.*;

import org.junit.Test;

public class testHospital {


	@Test
	public void queSePuedaPrepararUnPlato() {
		String nombrePlato = "tallarines";
		Boolean esCrudo = false;
		Plato plato = new Plato(nombrePlato,esCrudo);
		
		String nombreIngrediente = "fideos";
		Boolean tieneTACC=true;
		Boolean tieneSal = true;
		Boolean tieneAzucar = false;
		Integer cantidadIngrediente = 1;
		Boolean tieneSalEsperado =true;
		Ingrediente fideos = new Ingrediente(nombreIngrediente, tieneAzucar,tieneTACC,tieneSal);
		plato.agregarIngrediente(fideos);
		
		assertEquals(cantidadIngrediente,(Integer) plato.getIngredientes().size());
		
	}
	@Test
  public void queSeLePuedaDarDeComerAUnPaciente() {
		String nombrePlato = "tallarines";
		Boolean esCrudo = false;
		Plato plato = new Plato(nombrePlato,esCrudo);
		String nombre = "Raul Nappio";
		Integer dni = 1452632;
		Paciente paciente = new Paciente (nombre,dni);
	
		
		String nombreIngrediente = "fideos";
		Boolean tieneTACC=true;
		Boolean tieneSal = true;
		Boolean tieneAzucar = false;
		Integer cantidadIngrediente = 1;
		Boolean tieneSalEsperado =true;
		Ingrediente fideos = new Ingrediente(nombreIngrediente, tieneAzucar,tieneTACC,tieneSal);
		plato.agregarIngrediente(fideos);
		assertTrue(paciente.recibirIngesta(plato));
		
	}
	@Test
	  public void queSeLePuedaDarDeComerAUnPacienteDiabeticoTipo1() {
			String nombrePlato = "flan";
			Boolean esCrudo = false;
			Plato plato = new Plato(nombrePlato,esCrudo);
			String nombre = "Raul Nappio";
			Integer dni = 1452632;
			Paciente paciente = new DiabetipoTipo1 (nombre,dni);
		
			
			String nombreIngrediente = "leche";
			Boolean tieneTACC=true;
			Boolean tieneSal = false;
			Boolean tieneAzucar = true;
			Integer cantidadIngrediente = 1;
			Boolean tieneSalEsperado =true;
			Ingrediente leche = new Ingrediente(nombreIngrediente, tieneAzucar,tieneTACC,tieneSal);
			plato.agregarIngrediente(leche);
			
			assertFalse(paciente.recibirIngesta(plato));

	}
	
	@Test
	  public void queNoSeLePuedaDarDeComerAUnDiabeticoTipo2() {
			String nombrePlato = "bizcuchuelo";
			Boolean esCrudo = false;
			Plato plato = new Plato(nombrePlato,esCrudo);
			String nombre = "Raul Nappio";
			Integer dni = 1452632;
			Paciente paciente = new DiabeticoTipo2 (nombre,dni);
		
			
			String nombreIngrediente = "azucar";
			Boolean tieneTACC=true;
			Boolean tieneSal = true;
			Boolean tieneAzucar = true;
			Ingrediente azucar = new Ingrediente(nombreIngrediente, tieneAzucar,tieneTACC,tieneSal);
			plato.agregarIngrediente(azucar);
			
			assertFalse(paciente.recibirIngesta(plato));

	}
	@Test
	  public void queNoSeLePuedaDarDeComerAUnOncologico() {
			String nombrePlato = "sushi";
			Boolean esCrudo = false;
			Plato plato = new Plato(nombrePlato,esCrudo);
			String nombre = "Raul Nappio";
			Integer dni = 1452632;
			Paciente paciente = new Oncologico (nombre,dni);
		
			
			String nombreIngrediente = "salmon";
			Boolean tieneTACC=true;
			Boolean tieneSal = true;
			Boolean tieneAzucar = true;
			plato.setEsCrudo(true);
			Ingrediente salmon = new Ingrediente(nombreIngrediente, tieneAzucar,tieneTACC,tieneSal);
			plato.agregarIngrediente(salmon);
			
			assertFalse(paciente.recibirIngesta(plato));

	}
	@Test
	  public void queSeLePuedaDarDeComerAUnCeliaco() {
			String nombrePlato = "pizza";
			Boolean esCrudo = false;
			Plato plato = new Plato(nombrePlato,esCrudo);
			String nombre = "Raul Nappio";
			Integer dni = 1452632;
			Paciente paciente = new Celiaco (nombre,dni);
		
			
			String nombreIngrediente = "harina";
			Boolean tieneTACC=false;
			Boolean tieneSal = true;
			Boolean tieneAzucar = true;
			Ingrediente harina = new Ingrediente(nombreIngrediente, tieneAzucar,tieneTACC,tieneSal);
			plato.agregarIngrediente(harina);
			
			assertTrue(paciente.recibirIngesta(plato));

	}
	@Test
	  public void queNoSeLePuedaDarDeComerAUnHipertenso() {
			String nombrePlato = "arroz con atun";
			Boolean esCrudo = false;
			Plato plato = new Plato(nombrePlato,esCrudo);
			String nombre = "Raul Nappio";
			Integer dni = 1452632;
			Paciente paciente = new DiabeticoTipo2 (nombre,dni);
		
			
			String nombreIngrediente = "atun";
			Boolean tieneTACC=true;
			Boolean tieneSal = true;
			Boolean tieneAzucar = true;
			Ingrediente atun = new Ingrediente(nombreIngrediente, tieneAzucar,tieneTACC,tieneSal);
			plato.agregarIngrediente(atun);
			
			assertFalse(paciente.recibirIngesta(plato));
			

	}
	@Test
	public void queSePuedaSuministrarInsulinaAUnDiabeticoTipo2() {
		String nombre = "Raul Nappio";
		Integer dni = 1452632;
		Paciente paciente = new DiabeticoTipo2 (nombre,dni);
		assertTrue(((DiabeticoTipo2) paciente).administrarInsulina());
	}
	
	
	
}