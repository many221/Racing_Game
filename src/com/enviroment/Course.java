package com.enviroment;

public class Course {

    public final String NAME;

    public final Road ROAD;

    public final FinishLine GOAL;

    public Course(String NAME, Road ROAD) {
        this.NAME = NAME;
        this.ROAD = ROAD;
        GOAL = ROAD.getGoalSpot ();
    }

    //PreMade Course

    public static Course smallCourse(){
        return new Course ("Small Course",Road.shortRoad () );
    }

    public static Course medCourse(){
        return new Course ("Medium Course",Road.mediumRoad () );
    }

    public static Course longCourse(){
        return new Course ( "Long Course",Road.longRoad () );
    }

}
