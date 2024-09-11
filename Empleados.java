package burguerQueen;

public class Empleados {
	private int cuit;
	private String nombre;
	private String fechaNacimiento;
	private int sueldo;
	private String horarioLaboral;
	private int cantVentasMes;
	
	public Empleados(int cuit, String nombre, String fechaNacimiento, int sueldo, String horarioLaboral, int cantVentasMes) {
		this.cuit = cuit;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldo = sueldo;
		this.horarioLaboral = horarioLaboral;
		this.cantVentasMes = cantVentasMes;
	}
	
	public int getCantVentas() {
		return cantVentasMes;
	}
	
	public void displayEmpleado() {
		System.out.println("Empleado: "+nombre+", Cuit: "+cuit+", fecha de nacimiento: "+fechaNacimiento+", Horario "+horarioLaboral+", Ventas: "+cantVentasMes+", Sueldo: "+sueldo);
	}
	
	public String displayEmpleadoMes() {
		return "¡FELICITACIONES "+nombre.toUpperCase()+"! , con "+cantVentasMes+" ventas mensuales sos nuestro mejor empleado del mes";
		
	}
	
}
