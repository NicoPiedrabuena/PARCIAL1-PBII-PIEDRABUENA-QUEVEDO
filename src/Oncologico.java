
public class Oncologico extends Paciente {

	public Oncologico(String nombre, Integer dni) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Boolean recibirIngesta(Plato plato) {
		Boolean comio =false;
		if(plato.getEsCrudo() == false) {
			super.recibirIngesta(plato);
			comio =true;
		}
		return comio;
	}
}
