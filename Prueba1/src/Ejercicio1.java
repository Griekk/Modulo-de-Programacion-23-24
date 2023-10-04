import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double a, b, c, resultadoA, resultadoB, resultadoC;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el valor de 'a': ");
        a = sc.nextDouble();
        System.out.println("Escribe el valor de 'b': ");
        b = sc.nextDouble();
        System.out.println("Escribe el valor de 'c': ");
        c = sc.nextDouble();

        resultadoA = a*b + c*((3-a)/(2*b));
        resultadoB = Math.pow((2+a*b)/4, c+2);
        resultadoC = (-b+(Math.pow(Math.pow(b,2)-4*a*c, -2)))/(2*a);

        System.out.println(
                "Resultados:\n" +
                "a) " + resultadoA +
                "\nb) " + resultadoB +
                "\nc) " + resultadoC);
    }
}