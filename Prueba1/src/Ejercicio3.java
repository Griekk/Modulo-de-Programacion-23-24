import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numPizzas, numAmigos, numPorciones, resultado, sobrantes;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero de pizzas: ");
        numPizzas= sc.nextInt();
        System.out.println("Escribe el numero de porciones en la que las divides: ");
        numPorciones= sc.nextInt();
        System.out.println("Escribe el numero de amigos entre los que quieres repartirlas: ");
        numAmigos= sc.nextInt();


        resultado = (numPizzas*numPorciones)/numAmigos;
        sobrantes = (numPizzas*numPorciones)%numAmigos;

        System.out.println("Cada amigo tocaria a "+ resultado + " porciones y sobrarian " + sobrantes + ".");
    }
}
