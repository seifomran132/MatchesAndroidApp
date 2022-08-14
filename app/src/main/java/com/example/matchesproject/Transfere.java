package com.example.matchesproject;

public class Transfere {
    private String plyarName;
    private String newClub;
    private String oldClub;
    private float oldSalary;
    private float NewSalary;
    private String contractDate;

    public Transfere(String plyarName, String newClub, String oldClub, float oldSalary, float newSalary, String contractDate) {
        this.plyarName = plyarName;
        this.newClub = newClub;
        this.oldClub = oldClub;
        this.oldSalary = oldSalary;
        NewSalary = newSalary;
        this.contractDate = contractDate;
    }

    public String getPlyarName() {
        return plyarName;
    }

    public void setPlyarName(String plyarName) {
        this.plyarName = plyarName;
    }

    public String getNewClub() {
        return newClub;
    }

    public void setNewClub(String newClub) {
        this.newClub = newClub;
    }

    public String getOldClub() {
        return oldClub;
    }

    public void setOldClub(String oldClub) {
        this.oldClub = oldClub;
    }

    public float getOldSalary() {
        return oldSalary;
    }

    public void setOldSalary(float oldSalary) {
        this.oldSalary = oldSalary;
    }

    public float getNewSalary() {
        return NewSalary;
    }

    public void setNewSalary(float newSalary) {
        NewSalary = newSalary;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }
}
