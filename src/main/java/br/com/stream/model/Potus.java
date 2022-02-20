package br.com.stream.model;

import java.util.List;

public class Potus {

    private String fristName;
    private String lastName;
    private int electionYear;
    private String party;
    private List<Wife> wifes;

    public Potus(String fristName, String lastName, int electionYear, String party, List<Wife> wifes) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.electionYear = electionYear;
        this.wifes = wifes;
        this.party = party;
    }

    public Potus() {
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getElectionYear() {
        return electionYear;
    }

    public void setElectionYear(int electionYear) {
        this.electionYear = electionYear;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public List<Wife> getWifes() {
        return wifes;
    }

    public void setWifes(List<Wife> wifes) {
        this.wifes = wifes;
    }

    @Override
    public String toString() {
        return "Potus{" +
                "fristName='" + fristName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", electionYear=" + electionYear +
                ", party='" + party + '\'' +
                ", wifes=" + wifes +
                '}';
    }
}
