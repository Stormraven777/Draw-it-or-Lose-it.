package com.gamingroom;

public class Entity {  // Class Entity
	
	private long id;  // Private Constructors
	private String name;
	
	private Entity() {
		
	}
	
	public Entity(long id, String name) { // Public Constructors
		this.id = id;
		this.name = name;
		
	}
	
	public long getId() {  // Get the Id 
		return id;
		
	}
	
	public String getName() { // Get the Name
		return name;
		
	}
	
	public String toString() {
		return "Entity[id =" + id + ", name =" + name + "]";
		
	}
}
