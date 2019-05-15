/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

/**
 *
 * @author dalut3278
 */
public class Vehicle {
   private double gas, efficiency;
   public Vehicle (){
       
   }
   public Double getDistance(){
       double distance = (gas/efficiency)*100;
       return distance; 
     
   }
   
}
