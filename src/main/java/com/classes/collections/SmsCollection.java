/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.collections;

import com.classes.model.Sms;

import com.classes.collections.Connector;
import com.classes.model.Client;
import com.mongodb.BasicDBObject;
import java.net.UnknownHostException;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;
import com.mongodb.client.MongoCollection;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.bson.Document;
/**
 *
 * @author bouhmid
 */
public class SmsCollection {
    
    
    static Connector con ;
    
    public SmsCollection()
    {
        //*********** initializer le constructeur********//
        
        //con = new Connector();
        Sms sms = new Sms();
       
    }
    
    
    
    
    /*
    return une Collection
    */
    
    public static MongoCollection<Document> getCollection(){
       MongoCollection<Document> collection = con.getDB().getCollection("sms");
       return collection ;
    }
    
    
    
    
    
    /*
    une méthode pour créer un Sms
    */
    public static void CreateSms(Sms s)
    {
        Document doc = new Document("num_destinataire", s.getNum_destinataire())
                .append("num_emetteur", s.getNum_emetteur())
                .append("cout", s.getCout())
                .append("text", s.getText())
                .append("date_creation",s.getDate_creation());
        
        
        System.out.println("collecteion geted" +SmsCollection.getCollection());
        //insérer le document
        SmsCollection.getCollection().insertOne(doc);
        
        System.out.println("inserted " );
    }
            
    
    /*
    une méthode qui permet de faire la correspondance entre le modél et la collection dans le DB
    */
    
  
    
    
    
    
    
    /*
    les opérations CRUD ***********
    */
    
    
    /*
    la liste des SMS par d'apres la base de données
    */
    
    public static List<Sms> listeSms() throws ParseException{
        //****récuperer la collection***************//
        MongoCollection<Document> collection = SmsCollection.getCollection();
        
          /*
        la liste des SMS
        */
        List<Sms> liste = new ArrayList<Sms>();
        
       for (Document cur : collection.find()) {
   
    cur.getDate("date_creation");
    cur.getInteger("num_destinataire");
    cur.getInteger("num_emetteur");
    cur.getString("text");
      
  if(cur !=null)
  {
      //faire le mapping entre collection et la liste des SMS
  System.out.println("curseuer one" + cur.toJson() + " " +  cur.getDate("date_creation")
  +" " + cur.getInteger("num_destinataire") + " " +cur.getInteger("num_emetteur") 
  +" " + cur.getString("text"));
  }
        
        
        
       }    
   

      
        
     

  

         
         return liste ;
    }
    
    
    
    
    
    
    /*
    la liste des sms par num destinataire
    */
    
    
    
    public static List<Sms> listeSmsDestinataire(int numdestinataire) throws ParseException{
       
     
       
      return null ;
    }
    
    
    
    
    
    /*
    la liste des sms par numéro émeteur
    */
    
    
    
    
    public static List<Sms> listeSmsEmetteur(int numemeteur) throws ParseException{
   return null ;
    }
    
    
    
    
    
    /*
    une méthode pour convertir une chaine vers un Objet Date
    
    */
    
    
    public static Date converttoDate(String str){
        
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"); 
         
         java.util.Date date = Date.from( Instant.parse( str ));
         
         //System.out.println("the date is" + date);
         
         return date ;
         
   
        
    }
    
    
    
    /*
    retournner une description du SMS
    */
    
    
    
    public static String getDescription()
    {
        
        return null;
    }
    
    
    
    /*
     méthode pour retourner le Destinataire
    */
     public static Client getRécepteur()
    {
        return null;
    }
    
    
    
    /*
    méthode pour retourner l'Emétteur
    */
    
    public static Client getEmetteur()
    {
        return null;
    }
    
    
}
