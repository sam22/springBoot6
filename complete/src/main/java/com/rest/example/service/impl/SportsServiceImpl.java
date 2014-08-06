package com.rest.example.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.rest.example.domain.athletes.Athletes;
import com.rest.example.domain.sports.SportsData;
import com.rest.example.domain.sports.teams.SportsTeams;
import com.rest.example.factory.AthletesDTOFactory;
import com.rest.example.factory.SportsDTOFactory;
import com.rest.example.factory.TeamsDTOFactory;
import com.rest.example.service.SportService;


@Repository
public class SportsServiceImpl implements SportService {
   

    RestTemplate template = new RestTemplate();
	
	public SportsData getSports(){
		String sports = template.getForObject("http://api.espn.com/v1/sports?apikey=s6jqaabp8449btdemqm34qxt", String.class);	
		return SportsDTOFactory.createSportsFromSportsJsonService(sports);

	}
	
	public SportsTeams getTeams(String sport, String abbreviation){
		String teams = template.getForObject("http://api.espn.com/v1/sports/{sport}/{abbreviation}/teams?apikey=s6jqaabp8449btdemqm34qxt", String.class, sport, abbreviation);	
		return TeamsDTOFactory.createSportsFromSportsJsonService(teams);

	}

	
	public Athletes getAthletes(String sport, String abbreviation){
		String athletes = template.getForObject("http://api.espn.com/v1/sports/{sport}/{abbreviation}/athletes?apikey=s6jqaabp8449btdemqm34qxt", String.class, sport, abbreviation);	
		return AthletesDTOFactory.createAthletesFromSportsJsonService(athletes);

	}

	
	public String getPayload(){
		String result =  template.getForObject("http://api.espn.com/v1/sports?apikey=s6jqaabp8449btdemqm34qxt", String.class);	

		ObjectMapper mapper = new ObjectMapper();
		Object json = new Object();
		try {
			 json = mapper.readValue(result, Object.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonOutput = gson.toJson(json);
		return jsonOutput;
		
	}
	
	public String getTeamsPayload(String sport, String abbreviation){
		String result = template.getForObject("http://api.espn.com/v1/sports/{sport}/{abbreviation}/teams?apikey=s6jqaabp8449btdemqm34qxt", String.class, sport, abbreviation);	
		ObjectMapper mapper = new ObjectMapper();
		Object json = new Object();
		try {
			 json = mapper.readValue(result, Object.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonOutput = gson.toJson(json);
		return jsonOutput;

	}

	
	public String getAthletesPayload(String sport, String abbreviation){
		String result = template.getForObject("http://api.espn.com/v1/sports/{sport}/{abbreviation}/athletes?apikey=s6jqaabp8449btdemqm34qxt", String.class, sport, abbreviation);	
		ObjectMapper mapper = new ObjectMapper();
		Object json = new Object();
		try {
			 json = mapper.readValue(result, Object.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonOutput = gson.toJson(json);
		return jsonOutput;

	}
	
}
