
public class DiabeticoTipo2 extends Paciente {
	private Boolean recibioInsulina;
	public DiabeticoTipo2(String nombre, Integer dni) {
		super(nombre,dni);
		this.recibioInsulina = false;
	}
	@Override
	public Boolean recibirIngesta(Plato plato) {
		Boolean comio =false;
		if(plato.tieneAzucar() == false) {
			super.recibirIngesta(plato);
			comio=true;
		}
		return comio;
	}
	public Boolean administrarInsulina() {
		return this.recibioInsulina = true;
		
	}
}
