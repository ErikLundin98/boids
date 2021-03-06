package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;

public enum BoidAttribute {
    WIDTH("width"),
    HEIGHT("height"), 
    MAXSPEED("maxSpeed"), 
    SEPARATIONSTRENGTH("separationStrength"), 
    SEPARATIONRANGE("separationRange"), 
    ALIGNMENTSTRENGTH("alignmentStrength"), 
    ALIGNMENTRANGE("alignmentRange"), 
    COHESIONSTRENGTH("cohesionStrength"), 
    COHESIONRANGE("cohesionRange");

    private final String stringValue;
    BoidAttribute(final String s) {
        stringValue = s;
    }
    public String toString() {
        return stringValue;
    }

    public static Color getColor(float hue) {
        hue = hue*360;
        float r, g, b;
        
        float Hprime = hue/60;
        float X = 1 - Math.abs(Hprime%2 - 1);
        if (Hprime<1){
            r = 1;
            g = X;
            b = 0;
        } else if (Hprime<2){
            r = X;
            g = 1;
            b = 0;
        } else if (Hprime<3){
            r = 0;
            g = 1;
            b = X;
        } else if (Hprime<4){
            r = 0;
            g = X;
            b = 1;
        } else if (Hprime<5){
            r = X;
            g = 0;
            b = 1;
        } else if (Hprime<6){
            r = 1;
            g = 0;
            b = X;
        } else {
            r = 0;
            g = 0;
            b = 0;
        }
        return new Color(r, g, b, 1);
    }

}
