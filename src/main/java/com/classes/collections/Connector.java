/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.collections;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;

import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;
import java.util.Arrays;

/**
 *
 * classe Connector pour faire le opérations (connexion a la base de données , déconexxion , retourner lObjet MongClient)
 */
public class Connector {
    
    public static MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
    
    
    
    
    /*
    une méthoe pour retourner la base de données ****
    */
    
    public static MongoDatabase getDB(){
        
       
MongoDatabase database = mongoClient.getDatabase("smartsms");

         return database ;
    }
    
    
    
    /*
    une méthode pour faire déconexion de la base de données
    */
    
    public static void closeServer(){
        mongoClient.close();
    }
    
    
    
}
