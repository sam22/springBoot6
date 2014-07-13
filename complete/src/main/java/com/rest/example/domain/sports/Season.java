
package com.rest.example.domain.sports;

import java.util.List;

public class Season{
   	private String description;
   	private String endDate;
   	private String startDate;
   	private String type;
   	private String year;

 	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}
 	public String getEndDate(){
		return this.endDate;
	}
	public void setEndDate(String endDate){
		this.endDate = endDate;
	}
 	public String getStartDate(){
		return this.startDate;
	}
	public void setStartDate(String startDate){
		this.startDate = startDate;
	}
 	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}
 	public String getYear(){
		return this.year;
	}
	public void setYear(String year){
		this.year = year;
	}
}
