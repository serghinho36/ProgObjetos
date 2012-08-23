import java.util.ArrayList;

class Library{
	String nombre;
	String apellido;
	int numtel;
	String direccion;
	int devolucion;
	Book[] libro;
		
	library(String _nombre, String _apellido, int _numtel, String _direccion, int _devolucion, Book[] _libro){
		this.nombre = _nombre;
		this.apellido = _apellido;
		this.numtel = _numtel;
		this.direccion = _direccion;
		this.Devolucion = _devolucion;
		this.libro = _libro;
	}
	public static void main(String[] args){
		String nlibro= System.console().readLine();
		int edicion= Integer.parseInt(System.conosle.readLine());
		String edit= System.console().readLine();
		String aut= System.console().readLine();
		ArrayList<Book> libros = new ArrayList<Book>();
		libros.add("nlibro", 2, "edit","aut");
	}
}