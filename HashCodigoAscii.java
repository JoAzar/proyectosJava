package traductorAscii;
import java.util.*;
import java.util.Map.Entry;

public class HashCodigoAscii<K, V> {
	private Map<Character, Integer> map;

	public HashCodigoAscii() {
		this.map = new HashMap<>();
	}
	
	public void put(Character key, Integer value) {
		map.put(key, value);
	}
	
	public Integer get(Character key) {
		return map.get(key);
	}
	
	public Map<Character, Integer> getMap() {
		return map;
	}
	
	public Map<Character, Integer> traducirPalabra(String valor) {
		Map<Character,Integer> traduccion = new HashMap<>();
		
		for(char c : valor.toCharArray()) {
			Integer valorCorrespondiente = get(c);
			if(valorCorrespondiente != null) {
				traduccion.put(c, valorCorrespondiente);
			}
		}
		return traduccion;
	}
	
	public void printAllValue() {
		for(Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println("Clave: "+entry.getKey()+"| Valor: "+entry.getValue()+" | Tamaño de mapa: "+map.size());
		}
	}
	
}
