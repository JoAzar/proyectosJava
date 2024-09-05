package practicas;

public class Teclado extends BaseEntity{

	Teclado(String nombre, String modelo, String tamaño, int precio) {
		super(nombre, modelo, tamaño, precio);
	}
	
	@Override
	public String toString() {
		return "Teclado -> Nombre: " +this.nombre+" Modelo: "+this.modelo+" Tamaño: "+this.tamaño+" Precio: "+this.precio;
	}
}
