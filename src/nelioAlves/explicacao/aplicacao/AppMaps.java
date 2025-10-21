package nelioAlves.explicacao.aplicacao;

import java.util.Map;
import java.util.TreeMap;

public class AppMaps {
	
	public static void main(String[] args) {
		
		Map<String , String> cookies = new TreeMap<>();
		
		cookies.put("nome", "Maria");
		cookies.put("email", "maria@email.com");
		cookies.put("telefone", "889966584");
		
		cookies.remove("email");
		
		cookies.put("cep","68000000");
		cookies.put("telefone", "8891222444");
		
		System.out.println("contem telefone? " + cookies.containsKey("telefone"));
		System.out.println("Phone Number: " + cookies.get("telefone"));
		
		System.out.println("=====  Contato  =====");
		for (String k : cookies.keySet()) {
			System.out.println(k + ": "+ cookies.get(k));
		}
		
		
	}

}
