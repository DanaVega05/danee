import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
         System.out.println("ingrese su nombre");
        Scanner nombre = new Scanner(System.in);
       String n=nombre.nextLine();
        System.out.println("su nombre es: " +n);
        
         System.out.println("ingrese su apellido");
        Scanner apellido = new Scanner(System.in);
       String a=apellido.nextLine();
        System.out.println("su apellido es: " +a);
        
        System.out.println("ingrese su edad");
        Scanner entrada = new Scanner(System.in); 
        int e=entrada.nextInt();
        System.out.println("su edad es: "+e);
        
        System.out.println("obtener el tercer caracter de su apellido");
        Scanner caracter = new Scanner(System.in);
        char c=caracter.next().charAt(3);
        System.out.println("el caracter es: " +c);
    }
    
}
