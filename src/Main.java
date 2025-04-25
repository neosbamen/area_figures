import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        CalculateAreaTriangle calculateAreaTriangle=new CalculateAreaTriangle();

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