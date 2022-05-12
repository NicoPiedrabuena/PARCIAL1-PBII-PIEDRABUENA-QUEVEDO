
public class Hipertenso extends Paciente {

	public Hipertenso(String nombre, Integer dni) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Boolean recibirIngesta(Plato plato) {
		Boolean comio =false;
		if(plato.tieneSal() == false) {
			super.recibirIngesta(plato);
			comio = true;
		}
		return comio;
	}

}
