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
public class Bil extends Fordon {
    private int antalVäxel;
    private int växelJustNu;
    private int växla;
    
    void antalVäxel(int newValue){
    antalVäxel = newValue;
    }
    
    void växelJustNu(int newValue){
    växelJustNu = newValue;
    }
    
    void växla(int newValue){
    växla = newValue;
    }
    
    void printState(){
    System.out.println("antalVäxel:" + antalVäxel +
            "växelJustNu:" + växelJustNu +
            "växla:" + växla);}
}
