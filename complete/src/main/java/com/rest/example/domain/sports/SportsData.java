
package com.rest.example.domain.sports;

import java.util.List;


public class SportsData{
   	private Links links;
   	private List<Sports> sports;
   	private String status;
   	private String timestamp;

 	public Links getLinks(){
		return this.links;
	}
	public void setLinks(Links links){
		this.links = links;
	}
 	public List<Sports> getSports(){
		return this.sports;
	}
	public void setSports(List<Sports> sports){
		this.sports = sports;
	}
 	public String getStatus(){
		return this.status;
	}
	public void setStatus(String status){
		this.status = status;
	}
 	public String getTimestamp(){
		return this.timestamp;
	}
	public void setTimestamp(String timestamp){
		this.timestamp = timestamp;
	}
}
