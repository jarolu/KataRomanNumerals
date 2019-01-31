/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carballeira.katas.romannumerals;

/**
 *
 * @author admin
 */
public class RomanNumerals {

    public String getRoman(int n) {
        if(n==5){
          return "V";
        }
        StringBuffer sb= new StringBuffer();
        for(int i=0; i<n; i++){
          sb.append("I");
        }
        return sb.toString();
    }
    
    
    
    
    
}
