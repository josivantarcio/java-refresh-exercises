package nelioAlves.explicacao.aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import nelioAlves.explicacao.entities.Comments;
import nelioAlves.explicacao.entities.Post;

public class ProgramPost {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		LocalDateTime date = LocalDateTime.parse("21/06/2018 13:05:44", dtf);
		Post post1 = new Post(date, "Traveling to New Zealand", "I'm going to visit  this wonderful country", 12);

		Comments c1 = new Comments("Have a nice trip!");
		Comments c2 = new Comments("Wow that's awesamw!");

		post1.addComments(c1);
		post1.addComments(c2);

		LocalDateTime date2 = LocalDateTime.parse("28/07/2018 23:14:19", dtf);
		Post post2 = new Post(date2, "Good night guys", "See you tomorrow", 5);
		Comments c3 = new Comments("Good ninght");
		Comments c4 = new Comments("May th Force be with you");
		
		post2.addComments(c3);
		post2.addComments(c4);

		System.out.println(post1);
		System.out.println(post2);

	}

}
