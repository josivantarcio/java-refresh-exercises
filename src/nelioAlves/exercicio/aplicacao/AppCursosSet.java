package nelioAlves.exercicio.aplicacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AppCursosSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			Set<Integer> alunos = new HashSet<>();

			// Course A
			System.out.print("How many students for course A? ");
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				alunos.add(sc.nextInt());
			}

			// Course B
			System.out.print("How many students for course B? ");
			n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				alunos.add(sc.nextInt());
			}

			// Course C
			System.out.print("How many students for course C? ");
			n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				alunos.add(sc.nextInt());
			}

			System.out.println("Total Students: " + alunos.size());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
