package com.rest.example.controllers;

import javax.annotation.Resource;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rest.example.domain.athletes.Athletes;
import com.rest.example.domain.sports.SportsData;
import com.rest.example.domain.sports.teams.SportsTeams;
import com.rest.example.service.SportService;

@RestController
public class SportsController {

	@Resource
	SportService sportsService;

	@RequestMapping(method = RequestMethod.GET,value="/index")
	public ModelAndView index() {
		ModelMap model = new ModelMap();
		model.addAttribute("index", "http://api.espn.com/v1/sports?apikey=s6jqaabp8449btdemqm34qxt");
		model.addAttribute("sports", "http://localhost:8080/sports");
		return new ModelAndView("index", model);
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value="/sports")
	public ModelAndView getSports() {

		SportsData sports = sportsService.getSports();
		ModelMap model = new ModelMap();
		model.addAttribute("sportsListing", sports);
		return new ModelAndView("sports", model);
	}
	

	@RequestMapping(method = RequestMethod.GET,value="/sports/{sport}/{leagueAbbreviation}")
	public ModelAndView getTeams(@PathVariable("sport") String sport, @PathVariable("leagueAbbreviation") String leagueAbbreviation) {

		SportsTeams teams = sportsService.getTeams(sport, leagueAbbreviation);
		ModelMap model = new ModelMap();
		model.addAttribute("sportsTeams", teams);
		return new ModelAndView("teams", model);

	}

	
	@RequestMapping(method = RequestMethod.GET,value="/athletes/{sport}/{leagueAbbreviation}")
	public ModelAndView athletes(@PathVariable("sport") String sport, @PathVariable("leagueAbbreviation") String leagueAbbreviation) {

		Athletes athletes = sportsService.getAthletes(sport, leagueAbbreviation);
		ModelMap model = new ModelMap();
		model.addAttribute("athletes", athletes);
		return new ModelAndView("athletes", model);

	}

}