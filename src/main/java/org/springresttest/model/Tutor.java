package org.springresttest.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


public class Tutor extends Person {

    private int tutorid;

    private ArrayList<Course> coursesTaught = new ArrayList<Course>();

    public Tutor (String firstname, String lastname, int age, int tutid)
    {
        super(firstname, lastname, age);
        tutorid = tutid;
    }

    public int getTutoritd() {
        return tutorid;
    }

    public void setTutoritd(int tutorid) {
        this.tutorid = tutorid;
    }
}
