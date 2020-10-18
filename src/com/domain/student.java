package com.domain;

public class student {
  private  String ID;
  private  String NAME;
  private  int AGE;

    public student(String ID, String NAME, int AGE) {
        this.ID = ID;
        this.NAME = NAME;
        this.AGE = AGE;
    }

    public student() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    @Override
    public String toString() {
        return "student{" +
                "ID='" + ID + '\'' +
                ", NAME='" + NAME + '\'' +
                ", AGE=" + AGE +
                '}';
    }
}
