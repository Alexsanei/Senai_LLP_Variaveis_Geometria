// area = pi * raio².

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        
        // Usar valor fixo de pi
        double pi = Math.PI;
        
        double area = pi * raio * raio;
        
        System.out.println("A área do círculo é: " + area);
    }
}