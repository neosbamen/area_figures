import java.util.Scanner;


public class Main extends  AreaCuadrado{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      CalculateAreaTriangle calculateAreaTriangle=new CalculateAreaTriangle();

        int lado;

        System.out.println("Dime el lado del cuadrado cuya area quieres calcular");
        lado = scanner.nextInt();
        scanner.nextLine();
      
        areaCuadrado(lado);

        System.out.println("ingresa la base del triangulo");
        int base=scanner.nextInt();
        scanner.nextLine();

        System.out.println("ingresa la altura del triangulo");
        int altura=scanner.nextInt();
        scanner.close();
        int result=calculateAreaTriangle.calculate(base,altura);

        System.out.println(result);
        }
        }
