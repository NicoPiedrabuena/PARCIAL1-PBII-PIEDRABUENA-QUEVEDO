
public class Ingrediente {
	private String nombre;
	private Boolean tieneAzucar;
	private Boolean tieneTACC;
	private Boolean tieneSal;
	
	public Ingrediente (String nombre, Boolean tieneAzucar,Boolean tieneTACC,Boolean tieneSal) {
		this.nombre = nombre;
		this.tieneAzucar = tieneAzucar;
		this.tieneSal = tieneSal;
		this.tieneTACC = tieneTACC;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getTieneAzucar() {
		return tieneAzucar;
	}

	public void setTieneAzucar(Boolean tieneAzucar) {
		this.tieneAzucar = tieneAzucar;
	}

	public Boolean getTieneTACC() {
		return tieneTACC;
	}

	public void setTieneTACC(Boolean tieneTACC) {
		this.tieneTACC = tieneTACC;
	}

	public Boolean getTieneSal() {
		return tieneSal;
	}

	public void setTieneSal(Boolean tieneSal) {
		this.tieneSal = tieneSal;
	}
	

	
	
}
