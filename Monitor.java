package practicas;

public class Monitor extends BaseEntity{

	Monitor(String nombre, String modelo, String tamaño, int precio) {
		super(nombre, modelo, tamaño, precio);
	}
	
	@Override
	public String toString() {
		return "Monitor -> Nombre: " +this.nombre+" Modelo: "+this.modelo+" Tamaño: "+this.tamaño+" Precio: "+this.precio;
	}
	
}
