package tuplas;
import java.util.*;
import java.util.stream.Collectors;

public class Tupla<T1, T2> {
	private T1 x;
	private T2 y;
	private List<Tupla2<String, String, String, String>> listaTupla;
	
	public Tupla(T1 x, T2 y, List<Tupla2<String, String, String, String>> listaTupla) {
		establecerX(x);
		establecerY(y);
		this.listaTupla = listaTupla;
	}
	
	void establecerX(T1 x) {
		this.x = x;
	}
	
	void establecerY(T2 y) {
		this.y = y;
	}
	
	T1 obtenerX() {
		return this.x;
	}
	
	T2 obtenerY() {
		return this.y;
	}
	
	public List<Tupla2<String, String, String, String>> obtenerlistaTupla() {
		return listaTupla;
	}
	
	public List<Tupla2<String, String, String, String>> obtenerCredenciales(String x, String y) {
        return listaTupla.stream()
                .filter(tupla -> tupla.obtenerX().equals(x) && tupla.obtenerY().equals(y))
                .collect(Collectors.toList());
    }
	
	 @Override
    public String toString() {
        return "Marca: " + x +" | Modelo: " + y +" | Usuario y contraseña: " + listaTupla;
    }
	
}
