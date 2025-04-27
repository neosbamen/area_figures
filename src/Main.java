import java.util.Scanner;


public class Main extends AreaCuadrado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculateAreaTriangle calculateAreaTriangle = new CalculateAreaTriangle();
        AreaCirculo areaCirculo = new AreaCirculo();
        AreaRectangulo areaRectangulo = new AreaRectangulo();
        int lado;
        int baseRect;
        int alturaRect;
        int resultadoRectangulo;

        System.out.println("Dime el lado del cuadrado cuya area quieres calcular");
        lado = scanner.nextInt();
        scanner.nextLine();
        areaCuadrado(lado);

        System.out.println("ingresa la base del triangulo");
        int base = scanner.nextInt();
        scanner.nextLine();

        System.out.println("ingresa la altura del triangulo");
        int altura = scanner.nextInt();
        int result = calculateAreaTriangle.calculate(base, altura);

        System.out.println(result);


        System.out.println("Ingresa el radio del circulo");
        double radius = scanner.nextDouble();


        System.out.println(areaCirculo.areaCirculo(radius));

        System.out.println("Introduce la base del rectangulo cuya area quieres calcular");
        baseRect = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce la altura del rectangulo cuya area quieres calcular");
        alturaRect = scanner.nextInt();
        scanner.nextLine();
        resultadoRectangulo = areaRectangulo.areaRectangulo(baseRect, alturaRect);
        System.out.println("El area del rectangulo de base: " + baseRect + " y altura: " + alturaRect
                + " es: " + resultadoRectangulo);

        scanner.close();
    }
}

