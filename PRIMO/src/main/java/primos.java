
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
public class primos {
    
    public static void main(String[] args) {
          boolean esPrimo= true;
          Scanner illo = new Scanner(System.in);
          System.out.println("Introduce shu hermano");
                   int num= illo.nextInt();
         
          for(int i=2;i<num;i++){
              
              if(num%i==0){
                  esPrimo=false;
              }
              
          }
          if(esPrimo==true){
              System.out.println("El numero "+ num+" es primo");
          }
          
          else{
              System.out.println("EL numero "+ num+ " no es primo saes pedazo de imbecil usa la logica ");
          }
        
    }

}
