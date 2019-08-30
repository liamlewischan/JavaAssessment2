package com.qa.swampy;

import java.util.*;

public class InSwamp {
    private double swampDensity;
    private int swampWidth;
    private int swampHeight;
    private int trollsInLastPrint;

    public InSwamp(double density) {
        this(density, 20, 10);
    }

    public InSwamp(int width, int height) {
        this(0.1, width, height);
    }

    public InSwamp(double density, int width, int height) {
        this.swampDensity = density;
        this.swampWidth = width;
        this.swampHeight = height;
        this.trollsInLastPrint = 0;
    }

    public void printLine() {

        for (int counter = 0; counter < this.swampWidth; counter++){
            Random random = new Random();
            double randNum = random.nextDouble();

            if (randNum <= this.swampDensity) {

                System.out.print("*");
                this.trollsInLastPrint++;
            } else {
                System.out.print(" ");     // void
            }
        }
    }

    public void print() {
        this.trollsInLastPrint = 0;

        for (int countHigh = 0; countHigh < this.swampHeight; countHigh++) {
            this.printLine();
            System.out.println("");
        }
    }

    public int starsInLastPrint() {
        return this.trollsInLastPrint;
    }
}