import java.util.ArrayList;
import java.util.HashSet;

public class Plato {
	private String nombre;
	private HashSet<Ingrediente>ingredientes;
	private Boolean esCrudo;
	public Plato(String nombre ,Boolean esCrudo) {
		this.ingredientes = new HashSet<Ingrediente>();
		this.nombre = nombre;
		this.esCrudo = esCrudo;
	}
	public void agregarIngrediente(Ingrediente fideos) {
		ingredientes.add(fideos);
		
	}
	public Boolean tieneSal() {
		 Boolean tieneSal =false;
		for (Ingrediente ingrediente : ingredientes) {
			if(ingrediente.getTieneSal() == true) {
				tieneSal = true;
			}
		}
		return tieneSal;
	}
	public Boolean tieneTACC() {
		 Boolean tieneTACC =false;
		for (Ingrediente ingrediente : ingredientes) {
			if(ingrediente.getTieneTACC() == true) {
				tieneTACC = true;
			}
		}
		return tieneTACC;
	}
	public Boolean tieneAzucar() {
		 Boolean tieneAzucar =false;
		for (Ingrediente ingrediente : ingredientes) {
			if(ingrediente.getTieneAzucar() == true) {
				tieneAzucar = true;
			}
		}
		return tieneAzucar;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public HashSet<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(HashSet<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public Boolean getEsCrudo() {
		return esCrudo;
	}
	public void setEsCrudo(Boolean esCrudo) {
		this.esCrudo = esCrudo;
	}
	
}
