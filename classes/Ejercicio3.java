import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("ingrese su edad");
        Scanner entrada = new Scanner(System.in); 
        int e=entrada.nextInt();
        System.out.println("su edad es: "+e);
        
        System.out.println("ingrese su nombre");
        Scanner nombre = new Scanner(System.in);
       String n=nombre.nextLine();
        System.out.println("su nombre es: " +n);
        
    }
    
}
