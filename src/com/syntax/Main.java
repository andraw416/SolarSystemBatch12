package com.syntax;

public class Main {
    public static void main(String[] args) {
        SolarSystem xfac=new SolarSystem();

        xfac.moon="1";
        xfac.planet="4";
        xfac.sun="6";
        xfac.star="1000";


        FeatureSun xfactor = new FeatureSun();
        xfactor.color="puruple";
        xfactor.heat="123123";
        xfactor.radius="huge";

        FeatureStars stars = new FeatureStars();
        stars.color = "blue";
        stars.radius = "Large";
        stars.size = "12km";


        //adding planet 2 features
        Planet2 planet2=new Planet2();
        planet2.color="orange";
        planet2.size="2020020202 km squared";
        planet2.name="Marsianusth";
        

        Planet1Feature mars = new Planet1Feature();
        mars.color = "blue";
        mars.name="MARS";
        mars.size="HUGEEE";


    }
}
