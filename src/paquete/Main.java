package paquete;
import java.util.Scanner;

/**
 * Created by carlosrojas on 4/21/15.
 */

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Variables
        String mar,col;
        int puertas, vel;
        // Marca

        System.out.print("Introduzca Marca: ");
        mar = sc.nextLine();


        // Color
        System.out.print("Introduzca el Color: ");
        col = sc.nextLine();

        //Puertas

        System.out.print("Introduzca numero de puertas: ");
        puertas = sc.nextInt();

        //Velocidad
        System.out.print("Introduzca Maxima Velocidad: ");
        vel = sc.nextInt();



        Carro Micarro = new Carro();
        Micarro.setMarca(mar);
        Micarro.setPuertas(puertas);
        Micarro.ImprimirCarro();

    }
}
