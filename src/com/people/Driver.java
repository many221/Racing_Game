package com.people;

public class Driver extends People{

    public static final String[]SKILL_CHART = new String[]{"Your Little Sister","You","Lewis Hamilton"};

    //Integers
    private int skill;
    //Strings
    private String skillLevel;
    //Booleans
    private boolean keys = false;

    public Driver(String NAME, int AGE,String icon, int skill) {
        super ( NAME, AGE, icon, "Driver" );
        this.skill = skill;
        skillLevel = SKILL_CHART[skill];
    }

    //Setters
    public void setKeys(boolean keys) {
        this.keys = keys;
    }

    @Override
    public String toString() {
        return "\n|Driver: " + ICON +
                ", Name:" + NAME + '\'' +
                ", Age:" + AGE +
                ", Skill Level:'" + skillLevel + '\'' +
                " |";
    }

    //Getters
    public int getSkill() {
        return skill;
    }

    //Premade Drivers
    public static Driver getLilSis(String name){return new Driver (name,7,"👧",0 );}

    public static Driver youDrive(String name, int age){
        return new Driver ( name, age,"👴",1 );
    }

    public static Driver racingGod(){
        return new Driver ( "Lewis Hamilton",36,"🤴",2 );
    }

}
