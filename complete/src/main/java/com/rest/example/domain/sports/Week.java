
package com.rest.example.domain.sports;

import java.util.List;

public class Week{
   	private String endDate;
   	private String number;
   	private String startDate;

 	public String getEndDate(){
		return this.endDate;
	}
	public void setEndDate(String endDate){
		this.endDate = endDate;
	}
 	public String getNumber(){
		return this.number;
	}
	public void setNumber(String number){
		this.number = number;
	}
 	public String getStartDate(){
		return this.startDate;
	}
	public void setStartDate(String startDate){
		this.startDate = startDate;
	}
}
