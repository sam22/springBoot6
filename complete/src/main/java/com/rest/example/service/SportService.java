package com.rest.example.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.google.gson.JsonObject;
import com.rest.example.domain.athletes.Athletes;
import com.rest.example.domain.sports.SportsData;
import com.rest.example.domain.sports.teams.SportsTeams;

//@Service
public interface SportService {
	
	public SportsData getSports();
	
	public SportsTeams getTeams(String sport,String leagueAbbreviation);
	
	public Athletes getAthletes(String sport, String abbreviation);

	
}
