package com.rest.example.factory;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.rest.example.domain.sports.teams.SportsTeams;


public class TeamsDTOFactory {
	
	public static SportsTeams createSportsFromSportsJsonService(String teams){

		JsonParser parser = new JsonParser();
		JsonObject jsonSports =parser.parse(teams).getAsJsonObject();
		SportsTeams responseData = new Gson().fromJson(jsonSports, SportsTeams.class);
		return responseData;
	
	}
}
