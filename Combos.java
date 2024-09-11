package burguerQueen;

public class Combos {
	private String hamburguesas;
	private String papasFritas;
	private String bebidas;
	private String nombre;
	private String codigo;
	private int precio;
	private boolean estaEnPromocion;
	
	public Combos(String hamburguesas, String papasFritas, String bebidas, String nombre, String codigo, int precio, boolean estaEnPromocion) {
		this.hamburguesas = hamburguesas;
		this.papasFritas = papasFritas;
		this.bebidas = bebidas;
		this.precio = precio;
		this.nombre = nombre;
		this.codigo = codigo;
		this.estaEnPromocion = estaEnPromocion;
	}
	
	public void displayCombo() {
		System.out.println("Nombre del Combo: "+ nombre);
        System.out.println("Hamburguesa: "+ hamburguesas+", Papas Fritas: "+ papasFritas+", Bebida: "+ bebidas);
        System.out.println("Precio: "+this.precio);
        System.out.println("Promoción: "+(this.estaEnPromocion ? "Si" : "No"));
    }
	
	public String getCodigo() {
		return codigo;
	}
	
}
