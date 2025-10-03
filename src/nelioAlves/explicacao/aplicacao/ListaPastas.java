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
			File[] folders = path.listFiles(File::isDirectory);
			
			for(File f : folders) {
				System.out.println(f);
			}
			
			
			
			
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
		
	}

}
