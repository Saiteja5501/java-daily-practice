package com.javapractice;


public class Post {
	private int userId;
	private int id;
	private String title;
	private String body;
	public Post(int userId,int id,String title,String body){
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.body = body;
	}
	
	public int getUserId() {
		return this.userId;
	}
	public int getId() {
		return this.id;
	}
	public String getTitle() {
		return this.title;
	}
	public String getBody() {
		return this.body;
	}
	
	public Post setUserId(int userId) {
		return new Post(userId,id,title,body);
	}
	public Post setId(int id) {
		return new Post(userId,id,title,body);

	}
	public Post setTitle(String title) {
		return new Post(userId,id,title,body);

	}
	public Post setBody(String body) {
		return new Post(userId,id,title,body);

	}
	
}
