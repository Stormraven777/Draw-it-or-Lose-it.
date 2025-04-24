package com.gamingroom;

/**
 * A simple class to hold information about a team
 */
public class Team {
	long id;
	String name;
	
	/*
	 * Constructor with an identifier and name
	 */
	public class Team extends Entity {

		// list of active teams.
		private static List<Player> players = new ArrayList<Player>();
		
		// Constructor with an identifier and name
		public Team(long id, String name) {
			this.id = id;
			this.name = name;
		}
		
		/**
		 * Construct a new player instance
		 */
		public Player addPlayer(String name) {

			// local Player instance
			Player player = null;

			// go over the players to look for existing players with the same name and if they are found return to existing instance
			for (int i = 0; i < players.size() - 1; i++) {
				// looks through the list of players to see if that name already exists.
				if (players.get(i).getName() == name) {
					player = players.get(i);
				}
			}
			
			// if not found, make a new player instance and add to list of teams
			if (player == null) {
				// Get a reference to the GameService's singleton instance
				GameService service = GameService.getInstance();
				
				//  Use GameService to call for next player
				player = new Player(service.getNextPlayerId(), name);
				players.add(player);
			}

			
			return player;
		}

		@Override
		public String toString() {
			return "Team [id=" + id + ", name=" + name + "]";
		}
	}