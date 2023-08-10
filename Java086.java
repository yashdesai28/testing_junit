/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java086;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author hadoop
 */
public class Java086 {
    
    
     int add(int num1,int num2){
        
        int sum=num1+num2;
        
        return sum;
        
        
    }
     
     int count(String s1){
         
         int count=0;
         
         for(int i=0;i<s1.length();i++){
             
             if(Character.isLetter(s1.charAt(i))){
                 
                 count++;
             }
             
         }
         
         return count;
         
         
     }
     
    
    public static String con(String[] a1,String[] a2){
        
             
         HashSet<String>set=new HashSet<>(Arrays.asList(a1));
         set.addAll(Arrays.asList(a2));
         
         String y=set.toString();
         return y;

         
         
     }
    
    
    
     
    
     
      int mul(int num1,int num2,int num3){
        
        int mul=num1*num2*num3;
        
        return mul;
        
        
    }
      
      boolean esc(String s1,String s2){
          
          if(s1.equals(s2)){
              
              if(s1.length()==s2.length()){
                  
                  return true;
              }
              else{
                  
                  return false;
              }
              
              
              
          }
          else{
              return false;
          }
          
         
          
      }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println(add(5,4));
         String[] res = new String[4];
        String[] a1 = new String[]{"yash","anvi"};
         String[] a2 = new String[]{"yash","romit"};
         System.out.println(con(a1,a2));
          
    }
    
}
