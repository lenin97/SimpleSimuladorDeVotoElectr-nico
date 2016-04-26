/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lenin
 */
public class Candidate {
    private String nameCandidate;
    private int votesQuantity;

    public Candidate(String nameCandidate, int votesQuantity) {
        this.nameCandidate = nameCandidate;
        this.votesQuantity = votesQuantity;
    }
    
    public Candidate() {
        
    }

    public String getNameCandidate() {
        return nameCandidate;
    }

    public void setNameCandidate(String nameCandidate) {
        this.nameCandidate = nameCandidate;
    }

    public int getVotesQuantity() {
        return votesQuantity;
    }

    public void setVotesQuantity(int votesQuantity) {
        this.votesQuantity = votesQuantity;
    }

    @Override
    public String toString() {
        return "Candidate{" + "nameCandidate=" + nameCandidate + ", votesQuantity=" + votesQuantity + '}';
    }   
    
}
