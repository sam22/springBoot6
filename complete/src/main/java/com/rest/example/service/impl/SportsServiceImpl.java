package com.rest.example.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

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

	
	
	
}
