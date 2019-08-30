package com.qa.simpleplantemp;

	// for each possible encounter in swamp
	// including properties:
	// str id/name, multiline[] description of room, list objects,
	// check for encounter repetition, table for exits and outcomes

//after storing data as private, export public methods to make available

public class Encounter extends SuperEncounter {

	public int getEncounterNum() {
		return super.getEncounterNum();
	}
	
	public String getName() {
		return super.getName();
	}
	
// repeat above for possible in-game objects, long descriptions,
	// setting flag for room, 
