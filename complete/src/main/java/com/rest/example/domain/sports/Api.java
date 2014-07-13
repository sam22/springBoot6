
package com.rest.example.domain.sports;

import java.util.List;


public class Api{
   	private Events events;
   	private Headlines headlines;
   	private News news;
   	private Notes notes;

 	public Events getEvents(){
		return this.events;
	}
	public void setEvents(Events events){
		this.events = events;
	}
 	public Headlines getHeadlines(){
		return this.headlines;
	}
	public void setHeadlines(Headlines headlines){
		this.headlines = headlines;
	}
 	public News getNews(){
		return this.news;
	}
	public void setNews(News news){
		this.news = news;
	}
 	public Notes getNotes(){
		return this.notes;
	}
	public void setNotes(Notes notes){
		this.notes = notes;
	}
}
