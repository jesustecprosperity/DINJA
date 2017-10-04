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
public class StrUtils {
    
    //function ReplaceStr(const AText, AFromText, AToText: string): string;
    public static String ReplaceStr(String v1,String v2,String v3 ){
        v1 = v1.replace(v2, v3);
        return v1;
    }
    //teste atualização

}
