package practicas;

public class Disco extends BaseEntity{
	
	Disco(String nombre, String modelo, String tamaño, int precio) {
		super(nombre, modelo, tamaño, precio);
	}
	
	@Override
	public String toString() {
		return "Disco -> Nombre: " +this.nombre+" Modelo: "+this.modelo+" Tamaño: "+this.tamaño+" Precio: "+this.precio;
	}
}
