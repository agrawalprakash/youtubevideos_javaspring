package net.risingdev.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class YoutubeVideo {
	
	@Id
	private long id;
	private String title;
	private String description;
	private String url;
	public YoutubeVideo(long id, String title, String description, String url) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.url = url;
	}
	public YoutubeVideo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "YoutubeVideo [id=" + id + ", title=" + title + ", description=" + description + ", url=" + url + "]";
	}
	
	

}
