/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DELPHI;

/**
 *
 * @author root
 */
public class System1 {
    
    //Delphi procedure GetDir(Drive: Byte; var S: String);
    
    //function Copy(S: <string or dynamic array>; Index: Integer; Count: Integer): string;
    public static String Copy(String s,Integer x, Integer y){
        s = "-"+s;
        
        if  (x <= 0) {
            x = x+1;
        } 
        
        y = x + y;
        if (y > s.length()) {
            y = s.length();
        }
        
        s = s.substring(x,y);
        
        return s;
    }
    
}
