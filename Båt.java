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
public class Båt extends Fordon {
    private int dödvikt;
    private int sväng;
    
    void dödvikt(int newValue){
        dödvikt = newValue;
    }
    
    void sväng(int newValue){
    sväng = newValue;
    }
    
    void printState(){
    System.out.println("dödvikt:" + dödvikt +
            "sväng:" + sväng);
    }
}
