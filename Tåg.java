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
public class Tåg extends Fordon{
    private int antalVagnar;
    private int koppladeVagnar;
    
    void antalVagnar (int newValue){
    antalVagnar = newValue;
    }
    
    void koppladeVagnar(int newValue){
    koppladeVagnar = newValue;
    }
    
    void printState(){
    System.out.println("antalVagnar:" + 
            antalVagnar + "koppladeVagnar:" +
            koppladeVagnar );
    }
}
