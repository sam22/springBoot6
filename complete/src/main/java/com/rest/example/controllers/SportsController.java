package com.rest.example.controllers;

import javax.annotation.Resource;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

	/*@RequestMapping(method = RequestMethod.GET,value="/index")
	public ModelAndView index() {
		ModelMap model = new ModelMap();
		model.addAttribute("index", "http://api.espn.com/v1/sports?apikey=s6jqaabp8449btdemqm34qxt");
		model.addAttribute("sports", "http://localhost:8080/sports");
		return new ModelAndView("index", model);
	}*/
	
	@RequestMapping(method = RequestMethod.GET,value="/index")
	public @ResponseBody String index() {
		ModelMap model = new ModelMap();
		return "Sam";
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
		model.addAttribute("sport", sport);
		model.addAttribute("la", leagueAbbreviation);
		model.addAttribute("sportsTeams", teams);
		return new ModelAndView("teams", model);

	}

	
	@RequestMapping(method = RequestMethod.GET,value="/athletes/{sport}/{leagueAbbreviation}")
	public ModelAndView athletes(@PathVariable("sport") String sport, @PathVariable("leagueAbbreviation") String leagueAbbreviation) {

		Athletes athletes = sportsService.getAthletes(sport, leagueAbbreviation);
		ModelMap model = new ModelMap();
		model.addAttribute("sport", sport);
		model.addAttribute("la", leagueAbbreviation);
		model.addAttribute("athletes", athletes);
		return new ModelAndView("athletes", model);

	}
	
	@RequestMapping(method = RequestMethod.GET,value="/payload")
	public ModelAndView payload() {

		String jsonPayload = sportsService.getPayload();
		ModelMap model = new ModelMap();
		model.addAttribute("payload", jsonPayload);
		return new ModelAndView("payload", model);

	}
	
	@RequestMapping(method = RequestMethod.GET,value="/teamsPayload/{sport}/{leagueAbbreviation}")
	public ModelAndView getTeamsPayload(@PathVariable("sport") String sport, @PathVariable("leagueAbbreviation") String leagueAbbreviation) {

		String jsonPayload = sportsService.getTeamsPayload(sport, leagueAbbreviation);
		ModelMap model = new ModelMap();
		model.addAttribute("payload", jsonPayload);
		return new ModelAndView("payload", model);

	}

	
	@RequestMapping(method = RequestMethod.GET,value="/athletesPayload/{sport}/{leagueAbbreviation}")
	public ModelAndView getAthletePayload(@PathVariable("sport") String sport, @PathVariable("leagueAbbreviation") String leagueAbbreviation) {

		String jsonPayload = sportsService.getAthletesPayload(sport, leagueAbbreviation);
		ModelMap model = new ModelMap();
		model.addAttribute("payload", jsonPayload);
		return new ModelAndView("payload", model);

	}

}
