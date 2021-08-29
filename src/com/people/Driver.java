package com.people;

public class Driver extends People{

    public static final String[]SKILL_CHART = new String[]{"Your Little Sister","You","Lewis Hamilton"};

    //Integers
    private int skill;
    //Strings
    public String skillLevel  = SKILL_CHART[skill];
    //Booleans
    private boolean keys = false;

    public Driver(String NAME, int AGE, int skill) {
        super ( NAME, AGE, "Driver" );

        if(skill > 3){
           this.skill = skill;
        }else this.skill = 0;
    }

    //Setters
    public void setKeys(boolean keys) {
        this.keys = keys;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "skillLevel='" + skillLevel + '\'' +
                ", keys=" + keys +
                ", NAME='" + NAME + '\'' +
                ", AGE=" + AGE +
                '}';
    }

    public Driver getLilSis(String name){
        Driver lilsis = new Driver (name,7,0 );
        return lilsis;
    }

    public Driver youDrive(String name, int age){
        Driver you = new Driver ( name, age,1 );
        return you;
    }

    public Driver racingGod(){
        Driver lewis = new Driver ( "Lewis Hamilton",36,2 );
        return lewis;
    }

}
