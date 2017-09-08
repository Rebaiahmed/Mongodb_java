/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.model;

import java.util.Date;

/**
 *
 * @author bouhmid
 */
public class Sms {
    
    
    private int id ;
    private int num_destinataire ;
    private int num_emetteur ;
    private static float cout =(float) 0.5 ;
    private String text ;
    private Date date_creation ;

    public Sms() {
    }

    
    
    
     public Sms(int num_destinataire, int num_emetteur, String text, Date date_creation) {
        this.num_destinataire = num_destinataire;
        this.num_emetteur = num_emetteur;
        
        this.text = text;
        this.date_creation = date_creation;
    }
    
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the num_destinataire
     */
    public int getNum_destinataire() {
        return num_destinataire;
    }

    /**
     * @param num_emetteur the num_destinataire to set
     */
    public void setNum_destinataire(int num_destinataire) {
        this.num_destinataire = num_destinataire;
    }

    public int getNum_emetteur() {
        return num_emetteur;
    }

    public void setNum_emetteur(int num_emetteur) {
        this.num_emetteur = num_emetteur;
    }

  

  

    /**
     * @return the cout
     */
    public float getCout() {
        return cout;
    }

    /**
     * @param cout the cout to set
     */
    public void setCout(float cout) {
        this.cout = cout;
    }

   

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the date_creation
     */
    public Date getDate_creation() {
        return date_creation;
    }

    /**
     * @param date_creation the date_creation to set
     */
    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }
    
}
