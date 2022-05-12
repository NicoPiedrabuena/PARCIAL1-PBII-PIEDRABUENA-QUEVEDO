import java.util.ArrayList;

public class Paciente {
	private String nombre;
	private Integer dni;
	private ArrayList<Plato>platosAComer;
	public Paciente(String nombre,Integer dni) {
		this.nombre = nombre;
		this.dni =dni;
		platosAComer = new ArrayList<Plato>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public ArrayList<Plato> getPlatosAComer() {
		return platosAComer;
	}

	public void setPlatosAComer(ArrayList<Plato> platosAComer) {
		this.platosAComer = platosAComer;
	}

	public Boolean recibirIngesta(Plato plato) {
		Boolean comio = false;
		return platosAComer.add(plato);
	}
}
