package com.qa.proofofconcept;

public class Swamp {
	private static boolean northDirection = false;
    private static boolean southDirection = false;
    private static boolean westDirection = false;
    private static boolean eastDirection = false;

    public static Encounter[][] newRandomSwamp(Player player) {
        Encounter[][] swamp = new Encounter[null][null];
        for (int i = 0; i < swamp.length; i++) {
            for (int t = 0; t < swamp.length; t++) {
                swamp[i][t] = Encounter.newEncounterInstance();

            }
        }
        player.setCurrEncounter(swamp[null][null]);
        return swamp;
    }

    public boolean encounterExists(int x, int y) {
        return  (rowExists(x)) && (colExists(y));
    }

    public boolean rowExists(int x){
        return  (x >= 0) && (x <= 29);
    }

    public boolean colExists(int y){
        return  (y >= 0) && (y <= 29);
    }

    public void playerMovement(Player player) {
        northDirection = encounterExists(player.getCurrX(), player.getCurrY()
                + 1);
        southDirection = encounterExists(player.getCurrX(), player.getCurrY()
                - 1);
        eastDirection = encounterExists(player.getCurrX() + 1,
                player.getCurrY());
        westDirection = encounterExists(player.getCurrX() - 1,
                player.getCurrY());
        IO.movePlayer(player);

    }

   // public void fight(Player player, Creature creature, Encounter[][] swamp) {
   //     IO.fightIntro(player, swamp[player.getCurrX()][player.getCurrY()]);
   //     IO.fight(player, creature);
    }

    public void swampLogic(Player player, Encounter[][] swamp) {
        while (player.isAlive()) {
            if (player.isAlive() && swamp[player.getCurrX()][player.getCurrY()]
                    .getCreature().isAlive()) {
                fight(player, swamp[player.getCurrX()][player.getCurrY()]
                        .getCreature(), Conceptual.currSwamp);
            } else if (player.isAlive()) {
                playerMovement(player);
            }
        }
    }

    public static boolean isNorthDirection() {
        return northDirection;
    }

    public static boolean isSouthDirection() {
        return southDirection;
    }

    public static boolean isWestDirection() {
        return westDirection;
    }

    public static boolean isEastDirection() {
        return eastDirection;
    }

}