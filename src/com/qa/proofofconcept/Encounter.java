package com.qa.proofofconcept;

public final class Encounter {
	
	private final String description;
	private final Creature creature;
	private final int numCreatures;
	private final boolean anyTreasure;
	
	private Encounter(String description, Creature creature, boolean anyTreasure;
	int numCreatures) {
		this.description = description;
		this.creature = creature;
		this.anyTreasure = anyTreasure;
		this.numCreatures = numCreatures;
	}
	
	public static Encounter instanceOfEncounter() {
		String description = null;
		int numCreatures = 0;
		boolean anyTreasure = false;
		int randall = Conceptual.rando.nextInt(*) + 1; // room types to be added
		switch (randall) {
		case A:
			description = "Verdant swamp as far as the eye can see.";
			anyCreatures = 0;
			break;
		case B:
			description = "A hut can be sighted in the distance, the air smells foul of farm animals and onions. Ogres were once known to dwell here"
			+ " with any luck they might still be around...";
				anyCreatures = 2;
		}
	}
}
