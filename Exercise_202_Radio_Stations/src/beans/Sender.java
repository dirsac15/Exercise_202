/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Sabrina
 */
public class Sender 
{
    private String sender;
    private double frequenz;
    private String band;

    public Sender(String sender, double frequenz, String band) {
        this.sender = sender;
        this.frequenz = frequenz;
        this.band = band;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public double getFrequenz() {
        return frequenz;
    }

    public void setFrequenz(double frequenz) {
        this.frequenz = frequenz;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    @Override
    public String toString() {
        return "Sender{" + "sender=" + sender + ", frequenz=" + frequenz + ", band=" + band + '}';
    }
    
    
}
