package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator:
	
/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	// code to turn class into a singleton. 
	public static GameService GS_Singelton = null; //Declares it and sets it to null
	
	public static GameService getInstance() {
		if (GS_Singelton == null) {
			GS_Singelton = new GameService(); // if it is null then it sets it for a new game service.
		}   
		return GS_Singelton;
	}

	//Constructing a new game instance
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply return the existing instance

		// if not found, make a new game instance and add to list of games
		Iterator iter = games.iterator();
		while (iter.hasNext()) {  // while loop to set the first game to the iter.next
			Game gameOne = (Game)iter.next();
			if (name.equalsIgnoreCase(gameOne.getName())) {
				game = gameOne;
			}
		}
		
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		Iterator iter = games.iterator();
		while (iter.hasnext()) {   // while loop
			Game gameOne = (Game) iter.next();
	// if found, simply assign that instance to the local variable.		
			if (gameOne.getId() == id) {
				game = gameOne;
			}
		}
		

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// Uses iterator to look for existing game with same name
		Iteratoriter = games.iterator();
		while (iter.hasNext()) {  // while loop
			GamegameOne = (game) iter.next();
			
			if (name.equalsIgnoreCase(gameOne.getName())) {
				game = gameOne;
			}
		}
		// if found, simply assign that instance to the local variable

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
}
