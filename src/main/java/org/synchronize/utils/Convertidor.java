/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.synchronize.utils;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author comfa
 */
public class Convertidor {
    private static final int  Unidad = 1; 
private static final int  Decena = 10;
private static final int  Centena = 100;

public static String readNumber( String Number, String sepDecimal, String sMoney ){
      
      String  V[] = initVector(), s = "", z = "", c = "", e = " ", t;
      int l = Number.length(), k = Number.indexOf( sepDecimal ), u = 1, n = 0, j = 0, b = 0, d, p, r;
     
      try{
           //obtiene los decimales
            if( k >= 0 ) { c = Number.substring( k + 1, l );  l = k; }
           
            if ( l <= 15 )
            {
                        for( int i = l ; i >= 1; i-- ){
                            d = Integer.parseInt( String.valueOf( Number.charAt( i - 1 ) ));
                            n = ( d * u ) + n;

                                switch( u ){
                                    case Unidad:
                                        s = V[ n ];
                                        if ( i == l && n == 1 ) b++;
                                    break;
                     case Decena:                                               
                                        p = d - 2;
                                   
                                        if( p < 0 )  
                                            s = V[ n ];                                     
                                        else{
                                            t =  V[ 20 + p ];
                                           
                                            if( n % 10 != 0 )
                                               s  =  (d == 2)? "veinti" + s : t + " y " + s;
                                            else   
                                               s = t;
                                         }
                                    break;
                                    case Centena:
                                       p = d - 1;
                                       t = V[ 30 + p ];
        
                                       if( n % 100  == 0 )
                                       { s = ""; e = ""; } 
                                       else
                                         if( d == 1 ) t += "to"; 
                                      
                                       s = t + e + s;                                      
                                       z = ( s + z );  
                                    break;         
                                } 
                               
                                e = " ";    
                              //ini. calcula los miles, millones, billones
                                r = l - i;                               
                                if( r > 0 && r % 3 == 0  ){
                                        p = ( r > 2 )?  2 : j++ & 1;    
                                        t = V[ 40 + p ];
                                       
                                        if( p > 0 )
                                           if( ( n == 1 && i > 1 ) || n > 1  ) t += "es";
                                       
                                        z = e + t + e + z;
                                }
                              //fin.
                                
                               //reinicia las variables
                               if ( u == Centena ){  u = 1;  n = 0;  s = "";  } else u *= 10;                                
                         }
                      
             }     

           //ini. adiciona la moneda y los centavos
                if ( !c.equals("") ) c = " con " + c + " centavos";           
                if ( !sMoney.equals("") )       
                    sMoney = " " + sMoney;
                else
                    if( b > 0 ) z += "o"; 
           //fin.
           
            z = ( s + z ) + sMoney + c;
      }
      catch(NumberFormatException ex){
            z = "ERROR [readNumber]: Formato numerico incorrecto.";
      }
     
     return z;
    
   }

  
  
   private static String[] initVector(  ){
       String V[] = new String[43];
       
        V[0] = "cero";
        V[1] = "un";
        V[2] = "dos";
        V[3] = "tres";
        V[4] = "cuatro";
        V[5] = "cinco";
        V[6] = "seis";
        V[7] = "siete";
        V[8] = "ocho";
        V[9] = "nueve";
        V[10] = "diez";
        V[11] = "once";
        V[12] = "doce";
        V[13] = "trece";
        V[14] = "catorce";
        V[15] = "quince";
        V[16] = "dieciseis";
        V[17] = "diecisiete";
        V[18] = "dieciocho";
        V[19] = "diecinueve";
        V[20] = "veinte";
        V[21] = "treinta";
        V[22] = "cuarenta";
        V[23] = "cincuenta";
        V[24] = "secenta";
        V[25] = "setenta";
        V[26] = "ochenta";
        V[27] = "noventa";
        V[28] = "";
        V[29] = "";
        V[30] = "cien";
        V[31] = "doscientos";
        V[32] = "trescientos";
        V[33] = "cuatrocientos";
        V[34] = "quinientos";
        V[35] = "seiscientos";
        V[36] = "setecientos";
        V[37] = "ochocientos";
        V[38] = "novecientos";
        V[39] = "";
        V[40] = "mil";
        V[41] = "millon";
        V[42] = "billon";
       
        return V;
   }
   
   

/**
 * This Method is unit tested properly for very different cases , 
 * taking care of Leap Year days difference in a year, 
 * and date cases month and Year boundary cases (12/31/1980, 01/01/1980 etc)
**/

public static int getAge(Date dateOfBirth) {

    Calendar today = Calendar.getInstance();
    Calendar birthDate = Calendar.getInstance();

    int age = 0;

    birthDate.setTime(dateOfBirth);
    if (birthDate.after(today)) {
        throw new IllegalArgumentException("Can't be born in the future");
    }

    age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

    // If birth date is greater than todays date (after 2 days adjustment of leap year) then decrement age one year   
    if ( (birthDate.get(Calendar.DAY_OF_YEAR) - today.get(Calendar.DAY_OF_YEAR) > 3) ||
            (birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH ))){
        age--;

     // If birth date and todays date are of same month and birth day of month is greater than todays day of month then decrement age
    }else if ((birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH )) &&
              (birthDate.get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH ))){
        age--;
    }

    return age;
}


public static String padLeftZeros(String inputString, int length) {
    if (inputString.length() >= length) {
        return inputString;
    }
    StringBuilder sb = new StringBuilder();
    while (sb.length() < length - inputString.length()) {
        sb.append('0');
    }
    sb.append(inputString);

    return sb.toString();
}

}
