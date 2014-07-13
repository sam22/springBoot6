package com.rest.example.factory;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.rest.example.domain.sports.SportsData;


public class SportsDTOFactory {
	
	public static SportsData createSportsFromSportsJsonService(String sports){

		JsonParser parser = new JsonParser();
		JsonObject jsonSports =parser.parse(sports).getAsJsonObject();
		SportsData responseData = new Gson().fromJson(jsonSports, SportsData.class);
		return responseData;
	
	}

	
	
}
