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
public class Cykel extends Fordon {
    private int antalVäxlar = 0;
    private int växelJustNu = 1;
    private int växla = 0;
    
    void antalVäxlar(int newValue){
    antalVäxlar = newValue;
    }
    
    void växelJustNu(int newValue){
    växelJustNu = newValue;
    }
    
    void växla(int newValue){
    växla = newValue;
    }
    
    void printState(){
    System.out.println("antalVäxlar:" + 
            antalVäxlar + "växelJustNu:" +
            växelJustNu + "växla:" + växla );
    }
    
    
}
