import java.util.Scanner;

public class Main extends  AreaCuadrado{
    public static void main(String[] args) {

        int lado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el lado del cuadrado cuya area quieres calcular");
        lado = scanner.nextInt();
        areaCuadrado(lado);


    }
}