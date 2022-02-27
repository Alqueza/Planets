package com.company;

public enum Planets {
    Neptune("Neptune",60200),
    Uranus("Uranus",30687),
    Saturn("Saturn",10759),
    Jupiter("Jupiter",4333),
    Earth("Earth",365),
    Venus("Venus",225),
    Mercury("Mercury",88);

    private String planet;
    private int daysOfAYear;

    Planets() {
    }

    Planets(String planet, int daysOfAYear) {
        this.planet = planet;
        this.daysOfAYear = daysOfAYear;
    }

    public String getPlanet() {
        return planet;
    }

    public int getDaysOfAYear() {
        return daysOfAYear;
    }

    @Override
    public String toString() {
        return  "\nPlanet: " + planet +
                "\nDays Of A Year: " + daysOfAYear + " days";
    }

}
