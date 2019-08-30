package com.qa.swampy;

import java.util.*;

public class Main_renamethis {

    public static void main(String[] args) {
    	
    	// Builds the Tesselating Swamp
        Scanner input = new Scanner(System.in);
        InSwamp swamp;

        System.out.println("You've traveled far. How many weeks have you wandered?");
        int width = Integer.parseInt(input.nextLine());

        System.out.println("How many days do you have left?");
        int height = Integer.parseInt(input.nextLine());
        
        // Populates the swamp with 'trolls', later
        System.out.println("How many trolls have you slain?");
        double density = Double.parseDouble(input.nextLine());

        swamp = new InSwamp(density, width, height);
        swamp.print();
    }
}
