/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.model;

import java.util.ArrayList;

/**
 *
 * @author bouhmid
 */
public class Client {
    
     float bonus ;
    //unique!!!!!!!!!!!!
    private int num_tel ;
    protected String adresse ;
    private String email ;
    private ArrayList<Sms> sms_envoyées = new ArrayList<>();
    private ArrayList<Sms> sms_reçus = new ArrayList<>();
   
    
    
    
}
