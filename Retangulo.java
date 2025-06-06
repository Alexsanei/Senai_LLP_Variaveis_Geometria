import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float area; float base; float altura;
        System.out.print("Digite a base do retangulo : " );
        base = scanner.nextInt();
        System.out.print("Digite a altura do retangulo : " ); 
        altura = scanner.nextInt();
        area = base * altura;
        System.out.println("A área do retangulo é: " + area);
    }
}
