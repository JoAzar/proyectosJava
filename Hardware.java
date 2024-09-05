package practicas;

public class Hardware {
	Ram ram;
	Monitor monitor;
	Mouse mouse;
	Disco disco;
	Microprocesador micro;
	Teclado teclado;

	Hardware(Ram ram, Monitor monitor, Mouse mouse, Disco disco, Microprocesador micro, Teclado teclado) {
		this.ram = ram;
		this.monitor = monitor;
		this.mouse = mouse;
		this.disco = disco;
		this.micro = micro;
		this.teclado = teclado;
	}
	
	public String ramInfo() {
		return this.ram.toString();
	}
	
	public String monitorInfo() {
		return this.monitor.toString();
	}
	
	public String mouse() {
		return this.mouse.toString();
	}
	
	public String discoInfo() {
		return this.disco.toString();
	}
	
	public String microInfo() {
		return this.microInfo().toString();
	}
	
	public String teclado() {
		return this.teclado.toString();
	}
	
}
