/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.test;

import com.classes.collections.ClientParticulierCollection;
import com.classes.collections.Connector;
import com.classes.collections.SmsCollection;
import com.classes.model.Sms;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;

import com.mongodb.ServerAddress;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author bouhmid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
     
        List<BasicDBObject> sms_envoyees= new ArrayList<>();
           List<BasicDBObject> sms_reçus= new ArrayList<>();
              List<BasicDBObject> offres_inscrits= new ArrayList<>();
        
        Document document = new Document("email", "test@mail.com")
               .append("bonus", "50000")
                                      
               .append("num_tel" , "21008363")
                .append("adresse", "Tunis")
                .append("cin ","00000000")
                .append("solde ","50000")
                .append("nom ","Hosni")
                .append("prenom ","Mansour")
               .append("sms_envoyees", sms_envoyees)
                .append("sms_reçus", sms_reçus)
                .append("offres_inscrits", offres_inscrits)
                .append("code", 0000);
        
        
        ClientParticulierCollection.getCollection().insertOne(document);
        
        
        
        
        
        
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("************************SMART SMS*************************************");
        System.out.println("**********Bienvenue dans notre application d'envoi des sms**************");
        
        //**************Récupere numéro de télephone et le code******************//
        
        




    }
    
}
