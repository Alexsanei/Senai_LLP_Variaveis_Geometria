import java.util.Scanner;

public class Bola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da bola : " );
        float raio = scanner.nextFloat();
        double area = Math.PI * ( raio * raio );
        System.out.println("A área da bola é: " + area);
    }
}