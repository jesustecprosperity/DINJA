/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinja;


import DELPHI.System1;
import DELPHI.StrUtils;
import DELPHI.SysUtils;


/**
 *
 * @author root
 */
public class DINJA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "1234"; 
        Integer i;
        i = 1;
        i = i + SysUtils.StrToInt(str);
        
        System.out.println("Convertido para Integer = "+i);
        
        str = SysUtils.IntToStr(i)+"5"+" foi adicionado o 5";
        System.out.println("Convertido para String = "+str);
        
        str = SysUtils.Trim(str);
        System.out.println("Usando o Trim = "+str);
        
        str = "testando a StrUtils.ReplaceStr( )--";
        System.out.println(str);
        str = StrUtils.ReplaceStr(str, "-", "/");
        str = StrUtils.ReplaceStr(str, ".", "/");
        str = StrUtils.ReplaceStr(str, "(", "/");
        str = StrUtils.ReplaceStr(str, ")", "/");
        System.out.println(str);
        
        str = "teste-de-copy";
        str = System1.Copy(str, 3, 17);
        System.out.println(str);
        
        //String valores = "2.000,00";
	//valores = valores.replace('.', ' ');
	//valores = valores.replace(',', '.').trim();
	//System.out.println(valores);
        
    }
    
}
