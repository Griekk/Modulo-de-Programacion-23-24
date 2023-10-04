import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        char letra;
        double gradosC, resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la temperatura en grados centigrados (ºC): ");
        gradosC = sc.nextDouble();
        System.out.println("Escribe 'f' para pasar a Fahrenheit o 'k' para pasar a Kelvin");
        letra = sc.next().charAt(0);


        if (letra == 'F' || letra == 'f') {
            resultado = gradosC*9/5 + 32;
            System.out.println(resultado + " ºF");
        } else if (letra == 'K' || letra == 'k') {
            resultado = gradosC + 273.15;
            System.out.println(resultado + " ºK");
        } else {
            System.out.println("Opcion no valida");
        }









        }
}
