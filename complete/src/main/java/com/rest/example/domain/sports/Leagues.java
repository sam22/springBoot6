
package com.rest.example.domain.sports;

import java.util.List;


public class Leagues{
   	private String abbreviation;
   	private Number groupId;
   	private Number id;
   	private String name;
   	private Season season;
   	private String shortName;
   	private String uid;
   	private Week week;

 	public String getAbbreviation(){
		return this.abbreviation;
	}
	public void setAbbreviation(String abbreviation){
		this.abbreviation = abbreviation;
	}
 	public Number getGroupId(){
		return this.groupId;
	}
	public void setGroupId(Number groupId){
		this.groupId = groupId;
	}
 	public Number getId(){
		return this.id;
	}
	public void setId(Number id){
		this.id = id;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public Season getSeason(){
		return this.season;
	}
	public void setSeason(Season season){
		this.season = season;
	}
 	public String getShortName(){
		return this.shortName;
	}
	public void setShortName(String shortName){
		this.shortName = shortName;
	}
 	public String getUid(){
		return this.uid;
	}
	public void setUid(String uid){
		this.uid = uid;
	}
 	public Week getWeek(){
		return this.week;
	}
	public void setWeek(Week week){
		this.week = week;
	}
}
