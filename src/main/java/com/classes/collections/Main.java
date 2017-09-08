/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.collections;

import com.classes.test.*;
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
     
        System.out.println("hiiiiiiii");        
        SmsCollection.CreateSms(new Sms(20140428,20140428,"hi",new Date()));
        SmsCollection.listeSms();




    }
    
}
