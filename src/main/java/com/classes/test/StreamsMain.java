/*
s * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author bouhmid
 */
public class StreamsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random random = new Random();
//random.ints().limit(10).forEach(System.out::println);

//**********************************************************//
List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

//*****get List of unique squares*************//


//********utiliser le map
//List<Integer> squaresList = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
 //System.out.println("liste est " + squaresList);


 //*********utiliser le filter
 
 List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
 
 //****get count of the empty string******************//
 
 //int count = (int) strings.stream().filter(string->string.isEmpty()).count();
 
//System.out.println("count  of strings" + count);


//*********the sorted method*****************//

List<Integer>nwemer = Arrays.asList(1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19);


        
    }
    
}
