import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a base da piramide: ");
        float base = scanner.nextFloat();
        System.out.print("Digite a altura da piramide: ");
        float altura = scanner.nextFloat();
        float areabase = base * altura;

        System.out.print("Digite a base de uma face da piramide: ");
        float baseface = scanner.nextFloat();
        float face = ( base * altura)/2;
        float areatotal = areabase + 2 * (baseface * altura);
        System.out.print("A area do retangulo é: " + areatotal);
    }
}