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
public class sumatoria {
    int val =2,a=1;
    int posibilidades[][];
    int resuf =0;
    void validarnumero(String sumat){
    
      int suma = Integer.parseInt(sumat);   
      
      if (suma<2 || suma > 12){
          resuf =0;
      }
      else{
          posibilidades = new int [6][6];
          for( int x=0;x<6;x++){
              for(int y=0;y<6;y++){
                  posibilidades [x][y]=val;
                 val=val+1;
              }
             val=2+a;
             a=a+1;
          }
         for( int x=0;x<6;x++){
              for(int y=0;y<6;y++){
                  if (posibilidades[x][y]==suma){
                     resuf = resuf+1; 
                  }
              }
          } 
          
      }
}
int resultado(){
    return resuf;
}    
    
}
