import java.util.Scanner;

public class Tubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do tubo : " );
        float raio = scanner.nextFloat();
        System.out.print("Digite a altura do tubo : " ); 
        float altura = scanner.nextFloat();
        double area = 2 * Math.PI * raio * (raio + altura);
        System.out.println("A área do tubo é " + area);
    }
}