package practicas;

public class Ram extends BaseEntity{
	
	Ram(String nombre, String modelo, String tamaño, int precio) {
		super(nombre, modelo, tamaño, precio);
	}
	
	@Override
	public String toString() {
		return "Ram -> Nombre: " +this.nombre+" Modelo: "+this.modelo+" Tamaño: "+this.tamaño+" Precio: "+this.precio;
	}
}
