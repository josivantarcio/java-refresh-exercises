package nelioAlves.explicacao.aplicacao;

import java.io.File;
import java.util.Scanner;

public class ListaPastas {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Caminho da pasta: ");
			String strPath = sc.nextLine();
			
			File path = new File(strPath);
			File[] files = path.listFiles(File::isFile);
			
			System.out.println("Lista de Arquivos:");
			for (File file : files) {
				System.out.println(file);
			
			}			
			boolean subFolder = new File(strPath + "/temp").mkdir();
			System.out.println(subFolder ? "Criado com Sucesso" : "Houve um erro na criacao");
			
			
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
		
	}

}
