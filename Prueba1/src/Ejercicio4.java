import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int x, y, z, valorMin, valorMax, valorMed;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe 3 numeros separados por un espacio: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        valorMin = (x < y && x < z) ? x : ((y < x && y < z) ? y : z);
        valorMax = (x > y && x > z) ? x : ((y > x && y > z) ? y : z);
        valorMed = (x != valorMin && x != valorMax) ? x : ((y != valorMin && y != valorMax) ? y : z );

        System.out.println(
                "Valor Mínimo: " + valorMin +
                "\nValor Máximo: " + valorMax +
                "\nValor Medio: " + valorMed
        );
    }
}
