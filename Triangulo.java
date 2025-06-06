// base * altura / 2 

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float total; float base; float altura;
        System.out.print("Digite a base do triangulo : " );
        base = scanner.nextInt();
        System.out.print("Digite a altura do triangulo : " ); 
        altura = scanner.nextInt();
        total = (base * altura) /2;
        System.out.println("A área do triangulo é: " + total);
    }
}
