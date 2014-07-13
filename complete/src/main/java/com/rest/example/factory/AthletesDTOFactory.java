package com.rest.example.factory;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.rest.example.domain.athletes.Athletes;
public class AthletesDTOFactory {
	public static Athletes createAthletesFromSportsJsonService(String teams){

		JsonParser parser = new JsonParser();
		JsonObject jsonSports =parser.parse(teams).getAsJsonObject();
		Athletes responseData = new Gson().fromJson(jsonSports, Athletes.class);
		return responseData;
	
	}
}

