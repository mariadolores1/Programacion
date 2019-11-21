import java.util.Scanner;

public class IfAnidado1 {

        public static void main(String[] args) {
        
    
            int edad;
        Scanner scan = new Scanner(System.in);

        System.out.println("Dime tu edad: ");
        
        edad = scan.nextInt();

        if (edad >= 0 && edad < 18) {
            System.out.println("No puedes pasar!");
            System.out.println(" Vete de aqui\n");
            if (edad < 12) {
                System.out.println(" Aun eres un meco!\n");
            }
            if (edad < 6) {
                System.out.println("\tDonde esta tu madre?\n");
            }
        }

        if (edad > 18) {
            System.out.println("Adelante, pasa");

            if (edad >= 100) {
                System.out.println("Se conserva usted muy bien\n");
            }
        }

    }
}
