package com.gamingroom;

/**
 * A simple class to hold information about a player
 */
public class Player extends Entity{	

	// Constructor to identify player with a name
	public Player(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Constructor to show name and a team they are on.
	public Player(long id, String name, Team team) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}
}