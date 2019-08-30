package com.qa.proofofconcept;

import java.util.Random;
import java.util.Scanner;

public class Conceptual {
	
    public static final Scanner userSC = new Scanner(System.in);
    public static final Random rando = new Random();
    public static Encounter[][] currSwamp;
    public static Player currPlayer;

	public static void main(String[] args) {
		mainMenu();
	}
	
	public static void mainMenu() {
		boolean status = false;
		do {
			IO.Welcome();
			String choice = userSC.nextLine();
			switch (choice) {
			case "A":
				newGame();
				status = true;
				break;
			case "B":
				loadGame();
				status = true;
				break;
			case "C":
				settings();
				status = true;
				break;
			case "D":
				IO.credits();
				status = true;
				break;
			case "E":
				 System.exit(0);
			}
		} while (status == false);
	}

	public static void newGame() {
}
