
package com.rest.example.domain.sports;

import java.util.List;


public class Sports{
   	private String id;
   	private List<Leagues> leagues;
   	private Links links;
   	private String name;
   	private String uid;

 	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
 	public List<Leagues> getLeagues(){
		return this.leagues;
	}
	public void setLeagues(List<Leagues> leagues){
		this.leagues = leagues;
	}
 	public Links getLinks(){
		return this.links;
	}
	public void setLinks(Links links){
		this.links = links;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public String getUid(){
		return this.uid;
	}
	public void setUid(String uid){
		this.uid = uid;
	}
}
