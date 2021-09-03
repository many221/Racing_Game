package com.people;

public abstract class People {

    public final String NAME;
    public final int AGE;
    public final String ICON;
    private String profession;

    public People(String NAME, int AGE, String icon, String profession) {
        this.NAME = NAME;
        this.AGE = AGE;
        ICON = icon;
        this.profession = profession;
    }


    @Override
    public String toString() {
        return "People{" +
                "NAME='" + NAME + '\'' +
                ", AGE=" + AGE +
                ", profession='" + profession + '\'' +
                '}';
    }
}
