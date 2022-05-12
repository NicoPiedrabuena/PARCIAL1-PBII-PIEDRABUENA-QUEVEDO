
public class DiabetipoTipo1 extends Paciente {

	public DiabetipoTipo1(String nombre, Integer dni) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
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

}
