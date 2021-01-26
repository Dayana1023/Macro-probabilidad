/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macroprobabilidad;

/**
 *
 * @author dayan
 */
public class sumatoria3 {
   
    int numero,numfav;
    void validarnumero(String numer){
        int validar = Integer.parseInt(numer); 
        
        if (validar<1 || validar >6){
            numfav=9;
        }
        else{
           numero = validar; 
        }
    }
   void menor(){
       switch(numero){
           case 1:
               numfav=0;
               break;
           case 2:
               numfav=1;
               break; 
           case 3:
               numfav=2;
               break;
           case 4:
               numfav=3;
               break;
           case 5:
               numfav=4;
               break;
           case 6:
               numfav=5;
               break;
       }
   } 
   void menoroigual(){
numfav=numero;
   }
   void igual(){
       numfav=1;
   }
   void mayoroigual(){
       switch(numero){
           case 1:
               numfav=6;
               break;
           case 2:
               numfav=5;
               break; 
           case 3:
               numfav=4;
               break;
           case 4:
               numfav=3;
               break;
           case 5:
               numfav=2;
               break;
           case 6:
               numfav=1;
               break;
       }
   }
   void mayor(){
      switch(numero){
           case 1:
               numfav=5;
               break;
           case 2:
               numfav=4;
               break; 
           case 3:
               numfav=3;
               break;
           case 4:
               numfav=2;
               break;
           case 5:
               numfav=1;
               break;
           case 6:
               numfav=0;
               break;
       } 
   }
   int numerofav(){
       return numfav;
      
   }
}
