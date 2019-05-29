/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.generics;

/**
 *
 * @author Arun
 */
public class GenericMethodTest {
    
    static <T> void genericDisplay (T[] element){
        
        for(int i=0;i<element.length;i++){
            System.out.println("Element : "+element[i]);
        }
    }
    
    static <T extends Comparable<T>> void maximumElement(T[] element){
        T max=element[0];
        
        for(int i=1;i<element.length;i++){
            if(element[i].compareTo(max)>0){
                max=element[i];
            }
        }
        
        System.out.println("Max : "+max);
        
        }
       
    
    
    public static void main(String[] arg){
        String[] integerArray={"Arun","Razu","Farhan","Shakil","Tareq","Iqbal","Masum"};
       // genericDisplay(integerArray);
       //genericDisplay("apple");
        maximumElement(integerArray);
    }
    
}
