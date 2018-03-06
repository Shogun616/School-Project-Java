/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppgift.pkg2a;

/**
 *
 * @author Philip
 */
public class Fordon {
 private int hastighet;
 private int vikt;
 private int ändraHastighet;
 
 void hastighet(int newValue){
 hastighet = newValue;
 }
 
 void vikt (int newValue){
 vikt = newValue;
 }
 
 void ändraHastighet(int newValue){
 ändraHastighet = newValue;
 }
  
 void printStates(){
    System.out.println("hastighet:" + 
            hastighet + "vikt:" +
            vikt + "ändraHastighet:" + ändraHastighet );
    }
}
