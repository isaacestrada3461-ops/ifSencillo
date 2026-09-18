import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto ki de sayayin tienes:");
        int aura = leer.nextInt();
        boolean tienesMemorias;
        if (leer.nextBoolean()) tienesMemorias = true;
        else tienesMemorias = false;
        //AND && que tiene que cumplir todas las condiciones
        // // OR || que una de las dos cumplan
        if(aura >= 100 && tienesMemorias == false){
            System.out.println("Bienvenido a tu primer start up");
        }
        System.exit();
        System.out.println(10>3);
        System.out.println(10<3);
        System.out.println(10>=3);
        System.out.println();
        System.out.println();


        int corazones = 13;
        if(corazones == 13){
            System.out.println("completo");
        }


    }
}