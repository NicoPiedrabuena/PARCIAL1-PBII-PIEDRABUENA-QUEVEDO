
public class Celiaco extends Paciente {

	public Celiaco(String nombre, Integer dni) {
		super(nombre, dni);
		
	}
	@Override
	public Boolean recibirIngesta(Plato plato) {
		Boolean comio =false;
		if(plato.tieneTACC() == false) {
			super.recibirIngesta(plato);
			comio =true;
		}
		return comio;
	}

}
