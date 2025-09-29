package nelioAlves.explicacao.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm:ss");

	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;

	List<Comments> comments = new ArrayList<>();

	public Post() {
	}

	public Post(LocalDateTime moment, String title, String content, Integer likes) {

		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comments> getComments() {
		return comments;
	}

	public void addComments(Comments comment) {
		comments.add(comment);
	}

	public void removeComments(Comments comment) {
		comments.add(comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(dtf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:" + "\n");
		for (Comments comments2 : comments) {
			sb.append(comments2.getText() + "\n");
		}

		return sb.toString();

	}

}
