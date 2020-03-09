package model;

import java.util.HashMap;

public class Record {

    private String rollNumber;
    private String name;
    private String universityName;

    public Record() {

    }

    public Record(String rollNumber, String name, String universityName) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.universityName = universityName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Record{" +
                "rollNumber='" + rollNumber + '\'' +
                ", name='" + name + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';

    }
}

