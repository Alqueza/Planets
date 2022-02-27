package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(Planets.Neptune);
        System.out.println(Planets.Uranus);
        System.out.println(Planets.Saturn);
        System.out.println(Planets.Jupiter);
        System.out.println(Planets.Earth);
        System.out.println(Planets.Venus);
        System.out.println(Planets.Mercury);
        System.out.println();

        Planets[] planets = Planets.values();

        findAPlanetThatIsMoreThanDays(planets);
        System.out.println();
        findAPlanetThatIsLessThanDays(planets);

    }

    static  Planets findAPlanetThatIsMoreThanDays(Planets[] planets){
        System.out.println("Planets with more days: --->");
        for (Planets p:planets) {
            if(p.getDaysOfAYear()>=1000){
                System.out.println(p.name()+" has " +p.getDaysOfAYear()+" days");
            }
        }
        return null;

    }

    static  Planets findAPlanetThatIsLessThanDays(Planets[] planets){
        System.out.println("Planets with less days: --->");
        for (Planets p:planets) {
            if(p.getDaysOfAYear()<=1000){
                System.out.println(p.name()+" has " +p.getDaysOfAYear()+" days");
            }
        }
        return null;

    }
}
