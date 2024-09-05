package tuplas;

public class Tupla2<T1, T2, T3, T4> {
    private T1 marca;
    private T2 modelo;
    private T3 usuario;
    private T4 contrasena;

    public Tupla2(T1 marca, T2 modelo, T3 usuario, T4 contrasena) {
        this.marca = marca;
        this.modelo = modelo;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public T1 obtenerX() {
        return marca;
    }

    public T2 obtenerY() {
        return modelo;
    }

    public T3 obtenerZ() {
        return usuario;
    }

    public T4 obtenerW() {
        return contrasena;
    }
	
	@Override
    public String toString() {
        return "Marca: "+ this.marca +", Modelo: " + this.modelo+", Usuario: "+this.usuario+", Contraseña: "+this.contrasena;
    }

	
}
