/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.collections;

import static com.classes.collections.ClientMoraleCollection.con;
import com.classes.model.Offre;
import com.classes.model.Sms;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author bouhmid
 */
public class ClientParticulierCollection {

    
    
    
    
        /*
    return une Collection
    */
    
    public static MongoCollection<Document> getCollection(){
       MongoCollection<Document> collection = con.getDB().getCollection("client_particulier");
       return collection ;
    }
    
  
       
       
       
       
       /*
       Envoyer SMS
       */
       
       public static void EnvoiSms(Sms sms)
       {
           
       }
       
       
       /*
       transfer solde
       */
       
       public static void transfertSolde(int numdestinataire,int solde)
       {
           
       }
       
       
       /*
       la liste des smsenvoyées
       */
      public static void setlisteSmsEnvoyées()
      {
      }
      
      
      /*
        la liste des SMS reçus
      */
 public static void setListeSmsReçus()
 {
     
 }
 
 
 
   /*
      s'inscrire a une offre
 */
 
 
 public static void inscrireOffre(Offre off)
 {
     
 }
 
 
 
 /*
 
 */
 
 
    public static boolean rechercherClientParticulier(int numtel)
    {
        return true ;
    }
 
}