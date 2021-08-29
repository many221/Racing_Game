package com.engines;

public abstract class Engine {

    //Strings
    public static final String[] SPEED_CHART = new String[]{"Here","There","Gone"};
    public final String NAME;
    protected String engineSound;

    //Integers
    protected int currentSpeed;
    protected int buffPonies;

    //Booleans
    protected boolean used = false;
    protected boolean on = false;

    //Constructor
    public Engine(String NAME,String sound) {
        this.NAME = NAME;
        this.engineSound = sound;

    }

    //Starting/Stopping
    public void start_stop(){
        if (on){
            on = false;
        }else on = true;
    };


    //Getters

    public String getNAME() {
        return NAME;
    }

    public boolean isOn() {
        return on;
    }

    public boolean isUsed() {
        return used;
    }

    public int getBuffPonies() {
        return buffPonies;
    }

    //Setters
    public void setUsed(boolean used) {
        this.used = used;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

}
