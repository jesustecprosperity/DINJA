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
public class SysUtils {
    
    
    //Delphi function IntToStr(Value: Integer): string;
    public static String IntToStr(Integer i){
        String s = new String();
        s = i.toString();
        return s;
    }
    
    public static String FloatToStr(Double d){
        
        String s = new String();
        s = d.toString();
        return s;
    }
    
    
    //Delphi function StrToInt(const S: string): Integer;
    public static Integer StrToInt(String s){
        Integer i;
        try {
            i = Integer.parseInt(s);
        }
        catch( NumberFormatException e ){
            return 0;
        }
        return i;
    }
    
    //Delphi function Trim(const S: string): string;
    public static String Trim(String s){
        s = s.replace(" ", "");
        s = s.trim();
        return s;
    }
    
    
}
