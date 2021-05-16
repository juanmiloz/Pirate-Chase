package model;

public class Pirate {
	
	private String name;
	private int energy;
	
	public Pirate(String name, int energy) {
		this.name = name;
		this.energy = energy;
	}
	
	public Pirate() {
		this.name = "Morgan";
		this.energy = Integer.MAX_VALUE; 
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
}
