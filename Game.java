package com.gamingroom;

import java.util.ArrayList; // import different librarys and array lists.
import java.util.Iterator;
import java.util.List;


public class Game extends Entity { // publicclass game inheriting from class entity.
	
	// Array list that will hold all the teams info	
	private static List <Team> teams = new ArrayList<Team>();
	
	// constructor that will call the Id and name from the parent class entity.  
	public Game(long id, String name) {
		
		this.id = id;
		this.name = name;
	}

	// this wiil take info from class Entity and write them in the string
	public String toString()
	{
		
		return "Game [id=" + getId() + ", name=" + getName() + "]";
	}
	
	public Team addTeam(String name) {
		
		Team team = null; // Local team instance 
		
		
		Iterator<Team>teamiterator = teams.iterator(); // Create iterator 
		
		// while loop for cycling thru the different teams.  
		while(teamiterator.hasNext()){
			team = teamiterator.next();
			if(team.getName().equals(name)) {
			break;
			}
		}
		
		team = null;
		
		// If there is no team found add new team to list 
		if(team == null) {
			team = new Team(teams.size()+1,name);
			teams.add(team);
		}
		return team;
	}

}