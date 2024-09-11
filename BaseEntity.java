package practicas;

public class BaseEntity {
	
	String nombre;
	String modelo; 
	String tamaño;
	int precio;
	
	public BaseEntity(String nombre, String modelo, String tamaño, int precio) {
		this.nombre = nombre;
		this.modelo = modelo;
		this.tamaño = tamaño;
		this.precio = precio;
	}
	
}
