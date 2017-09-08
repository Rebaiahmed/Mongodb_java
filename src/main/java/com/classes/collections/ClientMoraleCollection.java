/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.collections;

import static com.classes.collections.SmsCollection.con;
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
public class ClientMoraleCollection {

 static Connector con ;
  
  
  
    /*
    return une Collection
    */
    
    public static MongoCollection<Document> getCollection(){
       MongoCollection<Document> collection = con.getDB().getCollection("client_morale");
       return collection ;
    }
    
    
  
  
    




    

}