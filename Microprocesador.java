package practicas;

public class Microprocesador extends BaseEntity{
	
	Microprocesador(String nombre, String modelo, String tamaño, int precio) {
		super(nombre, modelo, tamaño, precio);
	}
	
	@Override
	public String toString() {
		return "Microprocesador -> Nombre: " +this.nombre+" Modelo: "+this.modelo+" Tamaño: "+this.tamaño+" Precio: "+this.precio;
	}
	
}
