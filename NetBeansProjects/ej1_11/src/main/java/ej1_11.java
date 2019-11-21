
import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md
 */
public class ej1_11 {
   
    public static void main(String[] args) {
        double num1, num2;
        String opcion;
        Scanner illo= new Scanner(System.in).useLocale(Locale.UK);
        
        System.out.println("fhjdsfkjdskfjsd");
        num1= illo.nextDouble();
        
        
        num2= illo.nextDouble();
        
          opcion= illo.next();
         opcion = opcion.toLowerCase();
         
         switch(opcion){
             
             case "R":
                 System.out.println(num1+"-"+num2+"="+(num1+num2));
             break;
             case "y":
                 System.out.println(num1+"-"+num2+"="+(num1+num2));
             break;
             case "f":
                 System.out.println(num1+"-"+num2+"="+(num1+num2));
             break;
             case "z":
                 System.out.println(num1+"-"+num2+"="+(num1+num2));
             break;
             case "SCSFD":
                 System.out.println(num1+"-"+num2+"="+(num1+num2));
             break;
             
              default:
                 System.out.println("la opcion no es correcta");
             
             
             
             
             
             
         }
        
        
       
        
        
                 
                }
    
   
    
}
